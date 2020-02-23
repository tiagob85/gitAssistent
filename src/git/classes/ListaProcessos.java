/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.classes;

import git.principal.Principal;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tiago B
 */
public class ListaProcessos {
    String NomePrograma;
    Process process = null;
    int estado;
    
    public ListaProcessos(String nomeprograma){
        this.NomePrograma = nomeprograma;
    }//Construtor

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
    public void exibeProcessos() throws IOException{        
        process = new ProcessBuilder("tasklist.exe", "/fo", "csv", "/nh").start();
        new Thread(() -> 
        {
            Scanner sc = new Scanner(process.getInputStream());
            if (sc.hasNextLine()) sc.nextLine();
            while (sc.hasNextLine()) 
            {
                String line = sc.nextLine();
                String[] parts = line.split(",");
                String unq = parts[0].substring(1).replaceFirst(".$", "");
                String pid = parts[1].substring(1).replaceFirst(".$", "");
                if(unq.equals(this.NomePrograma))
                {
                    System.out.println(unq + " " + pid);
                    setEstado(1);
                }
                else
                {
                    setEstado(0);
                }
                
            }
        }).start();
        try {
            process.waitFor();
        } catch (InterruptedException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println("Done");        
        
    }//metodo exibeProcessos
    
}
