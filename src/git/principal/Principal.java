/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.principal;

import git.classes.ListaProcessos;
import git.db.Banco;
import git.db.InfoIde;
import git.gui.FrNotificacao;
import git.gui.FrPrincipal;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tiago B
 */
public class Principal {
    public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException {
        
        FrPrincipal obj = new FrPrincipal();
        obj.setVisible(true);
        /*ListaProcessos obj2 = new ListaProcessos("Calc.exe");
        obj2.exibeProcessos();*/
       /*try {
            String line;
            Process p = Runtime.getRuntime().exec
            //(System.getenv("windir") +"\\system32\\"+"tasklist.exe");
            (System.getenv("C:") +"cd \\Users\\Tiago B");         
            BufferedReader input =
                    new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((line = input.readLine()) != null) {               
                System.out.println(line); //<-- Parse data here.
                if(line.contains("Code.exe")){
                    System.out.println("visual Code");
                }
            }
            input.close();
        } catch (Exception err) {
            err.printStackTrace();
        }    */
       /* String line;
        int instances = 0;
        try {
            Process processo = Runtime.getRuntime().exec("wmic.exe");
            try (BufferedReader br = new BufferedReader(new InputStreamReader(processo.getInputStream()))) {
                OutputStreamWriter osw = new OutputStreamWriter(processo.getOutputStream());
                osw.write("process where name='Code.exe'");
                osw.flush();
                osw.close();
                while ((line = br.readLine()) != null) {
                    if (line.contains("Code.exe")) {
                        instances++;
                    }
                }
                System.out.println("Existem " + instances + " processos Calculator.exe rodando");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }      */
        /*TimerTask repeatedTask = new TimerTask() {
            public void run() {
                System.out.println("Task performed on " + new Date());
            }
        };
        Timer timer = new Timer("Timer");
     
        long delay  = 1000L;
        long period = 2000L;
        timer.scheduleAtFixedRate(repeatedTask, delay, period); */   
    /*    ProcessBuilder builder = new ProcessBuilder(
            "cmd.exe", "/c", "cd \"C:\\Users\\Tiago B\\Documents\\NetBeansProjects\\Git\" && git status");
        builder.redirectErrorStream(true);
        Process p = builder.start(); 
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while (true) {
            line = r.readLine();
            if (line == null) { break; }
            System.out.println(line);
        }     
        */
    }
}
