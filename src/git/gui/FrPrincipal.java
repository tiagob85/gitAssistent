/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.gui;

import git.classes.ListaProcessos;
import git.principal.Principal;
import java.awt.Color;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago B
 */
public class FrPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrPrincipal
     */
    public FrPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        LblStatus = new javax.swing.JLabel();
        BtnStart = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Git Assistent");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "IDE/Editor"));

        LblStatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LblStatus.setText("Programa em execução");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        BtnStart.setText("Start");
        BtnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnStart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));

        jMenu1.setText("Configurações");

        jMenuItem1.setText("Manutenção projetos");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Outras configurações");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStartActionPerformed
       /*
        0 - Code.exe         - Visual Code
        1 - netbeans64.exe   - NetBeans
        2 - eclipse.exe      - Eclipse
        3 - Calculator.exe   - Calculadora
        */
        /*String programa = "";
       
        
        while(programa.equals("")){
            programa = verificaProgramaAberto();
        }*/
       
        
        LblStatus.setForeground(Color.RED);
        TimerTask repeatedTask = new TimerTask() 
        {
            public String line;
            public String programa = "";
            public int status = 0;
            public int encontrouPrograma = 0;
            public String nomeIDE;
            public int idPrograma = -1;
            public int instances = 0;
            public int instances1 = 0; 
            public int contador = 0;
            
            public void run() 
            {       
                //programa = verificaProgramaAberto(3);
                if(encontrouPrograma == 0)
                {//Verifica se há programa da lista em aberto
                    while(programa.equals(""))/*Verifica se algum programa esta execução.*/
                    {
                        //for(int contador = 0;contador<4;contador++){
                        while((contador<4)&&programa.equals("")){    
                            programa = verificaProgramaAberto(contador);
                            if(!programa.equals(""))
                            {
                                encontrouPrograma = 1;
                                idPrograma = contador;
                                
                            }
                            contador = contador+1;
                        }
                    }
                    contador = 0;//resetando o contador.
                }
                else
                {
                    programa = verificaProgramaAberto(idPrograma);
                    encontrouPrograma = 1;
                }
                
                if(!programa.equals(""))
                {                    
                    switch(idPrograma)
                    {
                        case 0:{
                            nomeIDE = "Visual Studio Code";
                        }break;
                      /*  case 1:{
                            nomeIDE = "NetBeans 8.2";
                        }break;*/
                        case 2:{
                            nomeIDE = "Eclipse";
                        }break;
                        case 3:{                          
                            nomeIDE = "Calculadora";
                        }break;
                    }
                    
                    LblStatus.setText(nomeIDE);
                    
                    try 
                    {    
                        Process processo = Runtime.getRuntime().exec("wmic.exe");
                        try (BufferedReader br = new BufferedReader(new InputStreamReader(processo.getInputStream()))) {
                            OutputStreamWriter osw = new OutputStreamWriter(processo.getOutputStream());
                            System.out.println("Saida : "+programa);
                            osw.write("process where name='"+programa+"' ");
                            //osw.write("process where name='Calculator.exe' ");
                            osw.flush();
                            osw.close();
                            while ((line = br.readLine()) != null) 
                            {

                                //if(line.contains("Calculator.exe"))
                                if(line.contains(programa)&&!line.equals(""))
                                {
                                    status = 1;
                                    instances1++;
                                }

                            }
                            if(instances1 > 0)
                            {
                                LblStatus.setText("IDE "+ nomeIDE + " aberta");
                                LblStatus.setForeground(Color.GREEN);
                                status = 1;
                            }                                                   
                            
                            System.out.println("Existem " + instances1 + " processos "+ programa +" rodando ");
                        }
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }                 
                System.out.println("Task performed on " + new Date());
            }
            else
            {
                LblStatus.setText("Programa Fechado");
                LblStatus.setForeground(Color.RED);     
                cancel();
                FrNotificacao obj = new FrNotificacao();
                obj.setVisible(true);                
            }
                
        }//Metodo run
            
    };
    Timer timer = new Timer("Timer");
     
    long delay  = 1000L;
    long period = 2000L;
    timer.scheduleAtFixedRate(repeatedTask, delay, period);  
    
    
           
    }//GEN-LAST:event_BtnStartActionPerformed

    public String verificaProgramaAberto(int idPrograma){
        String programaExecutado =  "";
        String programaVerificado = "";
        String line;
        
        switch(idPrograma){
            case 0:{
                programaVerificado = "Code.exe";
                }break;
           /* case 1:{
                programaVerificado = "netbeans64.exe";
            }break;*/
            case 2:{
                programaVerificado = "eclipse.exe";
            }break;
            case 3:{
                programaVerificado = "Calculator.exe";
            }break;
        }
        
        
        try {
            Process processo = Runtime.getRuntime().exec("wmic.exe");
            try (BufferedReader br = new BufferedReader(new InputStreamReader(processo.getInputStream()))) {
                OutputStreamWriter osw = new OutputStreamWriter(processo.getOutputStream());
                //osw.write("process where name='Calculator.exe'");
                String processResult = "process where name='"+programaVerificado+"' ";
                osw.write("process where name='"+programaVerificado+"' ");
                osw.flush();
                osw.close();
                while ((line = br.readLine()) != null) {
                    if (line.contains(programaVerificado)) {
                        programaExecutado = programaVerificado;
                    }
                }
              //  System.out.println("Existem " + instances + " processos Calculator.exe rodando");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } 
        return programaExecutado;
    }//metodo de verificação de programa aberto.
    
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnStart;
    private javax.swing.JLabel LblStatus;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

   
}
