/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package principal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Diego
 */
public class interfaz extends javax.swing.JFrame {

    
    
    private int[][] estadoPaneles;
    //matrices por cada patron
    int[][] matriz1 = {
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0}
        };
    int[][] matriz2 = {
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0}
        };
    int[][] matriz3 = {
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0}
        };
    int[][] matriz4 = {
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0}
        };
    //matrices de entrada
        int[][] matrizE1 = {
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0}
        };
    int[][] matrizE2 = {
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0}
        };
    int[][] matrizE3 = {
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0}
        };
    int[][] matrizE4 = {
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0}
        };
     //memoria maxima y minima de las 4 matrices
    int memoriaMax[][];
    int memoriaMin[][];
    
     //matriz que recupera la entrada 1
    int recuperacion1Max[][]={
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0}
        };
    int recuperacion1Min[][] = {
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0}
        }; 
    //matriz que recupera la entrada 2
    int recuperacion2Max[][] = {
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0}
        };
    int recuperacion2Min[][] = {
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0}
        }; 
    //matriz que recupera la entrada 3
    int recuperacion3Max[][] = {
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0}
        };
    int recuperacion3Min[][] = {
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0}
        };
    //matriz que recupera la entrada 4
    int recuperacion4Max[][] = {
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0}
        };
    int recuperacion4Min[][] = {
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0}
        };
    
    //matrices donde se guarda el aprendizaje de cada patron
    int[][]aprendizaje1;
    int[][]aprendizaje2;
    int[][]aprendizaje3;
    int[][]aprendizaje4;
    int[][] limpieza= {
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0},
            {0, 0, 0, 0 ,0}
        };
    
    int columnas=5;
    int filas=8;
    public interfaz() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        reinicio();


    }//
    public void reinicio(){
        
        GridLayout gridLayout = new GridLayout(filas, columnas);
        //SE ASIGNA UN PANEL Y UNA MATRIZ
        panel_matrizE1.setLayout(gridLayout);
        asignar(panel_matrizE1, matriz1);
        panel_matrizE2.setLayout(gridLayout);
        asignar(panel_matrizE2,matriz2);
        panel_matrizE3.setLayout(gridLayout);
        asignar(panel_matrizE3,matriz3);
        panel_matrizE4.setLayout(gridLayout);
        asignar(panel_matrizE4, matriz4);
        //SE ASIGNA UN PANEL Y UNA MATRIZ DE ENTRADA
        panel_matrizP1.setLayout(gridLayout);
        asignar(panel_matrizP1,matrizE1);
        panel_matrizP2.setLayout(gridLayout);
        asignar(panel_matrizP2,matrizE2);
        panel_matrizP3.setLayout(gridLayout);
        asignar(panel_matrizP3,matrizE3);
        panel_matrizP4.setLayout(gridLayout);
        asignar(panel_matrizP4,matrizE4);
        
        panel_matrizMax1.setLayout(gridLayout);
        asignar_2(panel_matrizMax1,recuperacion1Max);
        
        panel_matrizMax2.setLayout(gridLayout);
        asignar_2(panel_matrizMax2,recuperacion2Max);
        
        panel_matrizMax3.setLayout(gridLayout);
        asignar_2(panel_matrizMax3,recuperacion3Max);
        
        panel_matrizMax4.setLayout(gridLayout);
        asignar_2(panel_matrizMax4,recuperacion4Max);
        
        panel_matrizMin1.setLayout(gridLayout);
        asignar_2(panel_matrizMin1,recuperacion1Min);
        
        panel_matrizMin2.setLayout(gridLayout);
        asignar_2(panel_matrizMin2,recuperacion2Min);
        
        panel_matrizMin3.setLayout(gridLayout);
        asignar_2(panel_matrizMin3,recuperacion3Min);
        
        panel_matrizMin4.setLayout(gridLayout);
        asignar_2(panel_matrizMin4,recuperacion4Min);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_matrizE1 = new javax.swing.JPanel();
        panel_matrizE2 = new javax.swing.JPanel();
        panel_matrizE4 = new javax.swing.JPanel();
        panel_matrizE3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_matrizP2 = new javax.swing.JPanel();
        panel_matrizP4 = new javax.swing.JPanel();
        panel_matrizP3 = new javax.swing.JPanel();
        panel_matrizP1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panel_matrizMax1 = new javax.swing.JPanel();
        panel_matrizMax2 = new javax.swing.JPanel();
        panel_matrizMax4 = new javax.swing.JPanel();
        panel_matrizMax3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panel_matrizMin1 = new javax.swing.JPanel();
        panel_matrizMin3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panel_matrizMin4 = new javax.swing.JPanel();
        panel_matrizMin2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        panel_matrizE1.setPreferredSize(new java.awt.Dimension(150, 150));
        panel_matrizE1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_matrizE1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_matrizE1Layout = new javax.swing.GroupLayout(panel_matrizE1);
        panel_matrizE1.setLayout(panel_matrizE1Layout);
        panel_matrizE1Layout.setHorizontalGroup(
            panel_matrizE1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_matrizE1Layout.setVerticalGroup(
            panel_matrizE1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        panel_matrizE2.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout panel_matrizE2Layout = new javax.swing.GroupLayout(panel_matrizE2);
        panel_matrizE2.setLayout(panel_matrizE2Layout);
        panel_matrizE2Layout.setHorizontalGroup(
            panel_matrizE2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_matrizE2Layout.setVerticalGroup(
            panel_matrizE2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        panel_matrizE4.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout panel_matrizE4Layout = new javax.swing.GroupLayout(panel_matrizE4);
        panel_matrizE4.setLayout(panel_matrizE4Layout);
        panel_matrizE4Layout.setHorizontalGroup(
            panel_matrizE4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );
        panel_matrizE4Layout.setVerticalGroup(
            panel_matrizE4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        panel_matrizE3.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout panel_matrizE3Layout = new javax.swing.GroupLayout(panel_matrizE3);
        panel_matrizE3.setLayout(panel_matrizE3Layout);
        panel_matrizE3Layout.setHorizontalGroup(
            panel_matrizE3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_matrizE3Layout.setVerticalGroup(
            panel_matrizE3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        jLabel1.setText("Entrenamiento");

        panel_matrizP2.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout panel_matrizP2Layout = new javax.swing.GroupLayout(panel_matrizP2);
        panel_matrizP2.setLayout(panel_matrizP2Layout);
        panel_matrizP2Layout.setHorizontalGroup(
            panel_matrizP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_matrizP2Layout.setVerticalGroup(
            panel_matrizP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        panel_matrizP4.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout panel_matrizP4Layout = new javax.swing.GroupLayout(panel_matrizP4);
        panel_matrizP4.setLayout(panel_matrizP4Layout);
        panel_matrizP4Layout.setHorizontalGroup(
            panel_matrizP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );
        panel_matrizP4Layout.setVerticalGroup(
            panel_matrizP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        panel_matrizP3.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout panel_matrizP3Layout = new javax.swing.GroupLayout(panel_matrizP3);
        panel_matrizP3.setLayout(panel_matrizP3Layout);
        panel_matrizP3Layout.setHorizontalGroup(
            panel_matrizP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_matrizP3Layout.setVerticalGroup(
            panel_matrizP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        panel_matrizP1.setPreferredSize(new java.awt.Dimension(150, 150));
        panel_matrizP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_matrizP1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_matrizP1Layout = new javax.swing.GroupLayout(panel_matrizP1);
        panel_matrizP1.setLayout(panel_matrizP1Layout);
        panel_matrizP1Layout.setHorizontalGroup(
            panel_matrizP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_matrizP1Layout.setVerticalGroup(
            panel_matrizP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        jLabel2.setText("PRUEBA");

        panel_matrizMax1.setPreferredSize(new java.awt.Dimension(150, 150));
        panel_matrizMax1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_matrizMax1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_matrizMax1Layout = new javax.swing.GroupLayout(panel_matrizMax1);
        panel_matrizMax1.setLayout(panel_matrizMax1Layout);
        panel_matrizMax1Layout.setHorizontalGroup(
            panel_matrizMax1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_matrizMax1Layout.setVerticalGroup(
            panel_matrizMax1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        panel_matrizMax2.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout panel_matrizMax2Layout = new javax.swing.GroupLayout(panel_matrizMax2);
        panel_matrizMax2.setLayout(panel_matrizMax2Layout);
        panel_matrizMax2Layout.setHorizontalGroup(
            panel_matrizMax2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_matrizMax2Layout.setVerticalGroup(
            panel_matrizMax2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        panel_matrizMax4.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout panel_matrizMax4Layout = new javax.swing.GroupLayout(panel_matrizMax4);
        panel_matrizMax4.setLayout(panel_matrizMax4Layout);
        panel_matrizMax4Layout.setHorizontalGroup(
            panel_matrizMax4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_matrizMax4Layout.setVerticalGroup(
            panel_matrizMax4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        panel_matrizMax3.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout panel_matrizMax3Layout = new javax.swing.GroupLayout(panel_matrizMax3);
        panel_matrizMax3.setLayout(panel_matrizMax3Layout);
        panel_matrizMax3Layout.setHorizontalGroup(
            panel_matrizMax3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );
        panel_matrizMax3Layout.setVerticalGroup(
            panel_matrizMax3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        jLabel3.setText("RECUPERADO MAXIMOS");

        panel_matrizMin1.setPreferredSize(new java.awt.Dimension(150, 150));
        panel_matrizMin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_matrizMin1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_matrizMin1Layout = new javax.swing.GroupLayout(panel_matrizMin1);
        panel_matrizMin1.setLayout(panel_matrizMin1Layout);
        panel_matrizMin1Layout.setHorizontalGroup(
            panel_matrizMin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_matrizMin1Layout.setVerticalGroup(
            panel_matrizMin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        panel_matrizMin3.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout panel_matrizMin3Layout = new javax.swing.GroupLayout(panel_matrizMin3);
        panel_matrizMin3.setLayout(panel_matrizMin3Layout);
        panel_matrizMin3Layout.setHorizontalGroup(
            panel_matrizMin3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_matrizMin3Layout.setVerticalGroup(
            panel_matrizMin3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        jLabel4.setText("RECUPERADOS MINIMOS");

        panel_matrizMin4.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout panel_matrizMin4Layout = new javax.swing.GroupLayout(panel_matrizMin4);
        panel_matrizMin4.setLayout(panel_matrizMin4Layout);
        panel_matrizMin4Layout.setHorizontalGroup(
            panel_matrizMin4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        panel_matrizMin4Layout.setVerticalGroup(
            panel_matrizMin4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        panel_matrizMin2.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout panel_matrizMin2Layout = new javax.swing.GroupLayout(panel_matrizMin2);
        panel_matrizMin2.setLayout(panel_matrizMin2Layout);
        panel_matrizMin2Layout.setHorizontalGroup(
            panel_matrizMin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_matrizMin2Layout.setVerticalGroup(
            panel_matrizMin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        jButton1.setText("Aprendizaje");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Recuperacion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Reinicio");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panel_matrizE1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                        .addComponent(panel_matrizE2, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                        .addComponent(panel_matrizE3, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                        .addComponent(panel_matrizE4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(260, 260, 260)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_matrizP1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(panel_matrizP2, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(panel_matrizP3, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_matrizP4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_matrizMax1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(panel_matrizMax2, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(panel_matrizMax3, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_matrizMax4, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_matrizMin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_matrizMin2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_matrizMin3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_matrizMin4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(panel_matrizMin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_matrizMin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_matrizMin3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_matrizMin4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(panel_matrizE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel_matrizE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panel_matrizE3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel_matrizE4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(panel_matrizP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel_matrizP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panel_matrizP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel_matrizP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(panel_matrizMax1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel_matrizMax2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panel_matrizMax3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel_matrizMax4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panel_matrizE1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_matrizE1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panel_matrizE1MousePressed

    private void panel_matrizP1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_matrizP1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panel_matrizP1MousePressed

    private void panel_matrizMax1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_matrizMax1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panel_matrizMax1MousePressed

    private void panel_matrizMin1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_matrizMin1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panel_matrizMin1MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        btn_1();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void btn_1(){
        //patron1 unidimensional
        int[]patron1=convertirBidimensional(matriz1);
        int[][]patron1t;

        //patron2 unidimensional
        int[] patron2=convertirBidimensional(matriz2);;
        int[][]patron2t;
        //patron3 unidimensional
        int[] patron3=convertirBidimensional(matriz3);;
        int[][]patron3t;
        //patron4 unidimensional 
        int[] patron4=convertirBidimensional(matriz4);;
        int[][]patron4t;
        
        patron1t=transpuesta(patron1);
        patron2t=transpuesta(patron2);
        patron3t=transpuesta(patron3);
        patron4t=transpuesta(patron4);
        
        aprendizaje1=fase_aprendizaje(patron1, patron1t);
        aprendizaje2=fase_aprendizaje(patron2, patron2t);
        aprendizaje3=fase_aprendizaje(patron3, patron3t);
        aprendizaje4=fase_aprendizaje(patron4, patron4t);
        
        memoriaMax=maximos(aprendizaje1, aprendizaje2, aprendizaje3,aprendizaje4);
        memoriaMin=minimos(aprendizaje1, aprendizaje2, aprendizaje3,aprendizaje4);
    }
            
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        btn_2();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void btn_2(){
        
        int[] matrizEntrada1= convertirBidimensional(matrizE1);
        int[] matrizEntrada2= convertirBidimensional(matrizE2);
        int[] matrizEntrada3= convertirBidimensional(matrizE3);
        int[] matrizEntrada4= convertirBidimensional(matrizE4);
        
        System.out.println("patron 1");
        recuperacion1Max=convertirABidimensional(recuperacionMax(matrizEntrada1, memoriaMax),8,5);
        recuperacion1Min=convertirABidimensional(recuperacionMin(matrizEntrada1, memoriaMin),8,5);
        configurarColores(panel_matrizMin1, limpieza);
        configurarColores(panel_matrizMax1, limpieza);
        configurarColores(panel_matrizMin1, recuperacion1Min);
        configurarColores(panel_matrizMax1, recuperacion1Max);
        
        System.out.println("patron 2");
        recuperacion2Max=convertirABidimensional(recuperacionMax(matrizEntrada2, memoriaMax),8,5);
        recuperacion2Min=convertirABidimensional(recuperacionMin(matrizEntrada2, memoriaMin),8,5);
        configurarColores(panel_matrizMin2, limpieza);
        configurarColores(panel_matrizMax2, limpieza);
        configurarColores(panel_matrizMin2, recuperacion2Min);
        configurarColores(panel_matrizMax2, recuperacion2Max);
        System.out.println("patron 3");
        recuperacion3Max=convertirABidimensional(recuperacionMax(matrizEntrada3, memoriaMax),8,5);
        recuperacion3Min=convertirABidimensional(recuperacionMin(matrizEntrada3, memoriaMin),8,5);
         configurarColores(panel_matrizMin3, limpieza);
        configurarColores(panel_matrizMax3, limpieza);
        configurarColores(panel_matrizMin3, recuperacion3Min);
        configurarColores(panel_matrizMax3, recuperacion3Max);
        System.out.println("patron 4");
        recuperacion4Max=convertirABidimensional(recuperacionMax(matrizEntrada4, memoriaMax),8,5);
        recuperacion4Min=convertirABidimensional(recuperacionMin(matrizEntrada4, memoriaMin),8,5);
         configurarColores(panel_matrizMin4, limpieza);
        configurarColores(panel_matrizMax4, limpieza);
        configurarColores(panel_matrizMin4, recuperacion4Min);
        configurarColores(panel_matrizMax4, recuperacion4Max);
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        reinicio();
        limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed
    public void asignar(JPanel asignado, int[][] matriz){
        JLabel[][] pixels = new JLabel[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                pixels[i][j] = new JLabel();
                pixels[i][j].setOpaque(true);
                pixels[i][j].setBackground(Color.WHITE);

                // Agregamos un MouseListener para cambiar el color al mantener presionado el botón del mouse
                final int row = i;
                final int col = j;
                pixels[i][j].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if(pixels[row][col].getBackground().toString().equals(Color.WHITE.toString())){
                            pixels[row][col].setBackground(Color.BLACK);
                            matriz[row][col]=1;
                            //imprimirMatriz(matriz);
                            btn_1();
                            btn_2();
                        }else{
                            pixels[row][col].setBackground(Color.WHITE);
                            matriz[row][col]=0;
                            //imprimirMatriz(matriz);
                            btn_1();
                            btn_2();
                        }
                        
                        
                    }
                });

                asignado.add(pixels[i][j]);
            }
        }
    }
    public static void configurarColores(JPanel panel, int[][] arreglo) {
        for (int fila = 0; fila < arreglo.length; fila++) {
            for (int columna = 0; columna < arreglo[0].length; columna++) {
                int valor = arreglo[fila][columna];
                Color color = (valor == 1) ? Color.BLACK : Color.WHITE;

                // Obtener el componente en la posición (fila, columna)
                JLabel componente = (JLabel) panel.getComponent(fila * arreglo[0].length + columna);

                // Configurar el color de fondo del componente
                componente.setBackground(color);
            }
        }
    }


     public void asignar_2(JPanel asignado, int[][] matriz){
        JLabel[][] pixels = new JLabel[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                pixels[i][j] = new JLabel();
                pixels[i][j].setOpaque(true);
                pixels[i][j].setBackground(Color.WHITE);

                // Agregamos un MouseListener para cambiar el color al mantener presionado el botón del mouse
                final int row = i;
                final int col = j;
                pixels[i][j].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if(matriz[row][col]==1){
                            pixels[row][col].setBackground(Color.BLACK);
                            
                            //imprimirMatriz(matriz);
                        }else if(matriz[row][col]==0){
                            pixels[row][col].setBackground(Color.WHITE);
                            matriz[row][col]=0;
                            
                        }
                      
                        
                    }
                });

                asignado.add(pixels[i][j]);
            }
        }
    }
    public void imprimirMatriz(int[][]matriz){
        for(int i=0;i< matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
     public static int[][] transpuesta(int [] matriz){
        //System.out.println(matriz.length);
        int[][] matrizt= new int[matriz.length][1];
        for(int i=0;i<matriz.length;i++){
            matrizt[i][0]=matriz[i];
            //System.out.println("["+matrizt[i][0]+"]");
        }
        return matrizt;
    }
    
    public static int alfa(int x, int y){
        int regreso = 0;
        if(x==0 && y==0){
            regreso=1;
        }else if(x==0 && y==1){
            regreso=0;
        }else if(x==1 && y==0){
            regreso=2;
        }else if(x==1 && y==1){
            regreso=1;
        }
        return regreso;
    }
    
    public static int beta(int x, int y){
        int regreso = 0;
        if(x==0 && y==0){
            regreso=0;
        }else if(x==0 && y==1){
            regreso=0;
        }else if(x==1 && y==0){
            regreso=0;
        }else if(x==1 && y==1){
            regreso=1;
        }
        else if(x==2 && y==0){
            regreso=1;
        }else if(x==2 && y==1){
            regreso=1;
        }
        return regreso;
    }
    
    public int[][] fase_aprendizaje(int[]matriz, int matrizt[][]){
        int [][] matrizAprendizaje= new int[matriz.length][matrizt.length];
        for(int i=0;i<matrizt.length;i++){
            for(int j=0;j<matriz.length;j++){
                matrizAprendizaje[i][j]= alfa(matrizt[i][0],matriz[j]);
                //System.out.print("["+matrizAprendizaje[i][j]+"]");
                
            }
        //System.out.println("");
        }
         //System.out.println("");
         return matrizAprendizaje;
    }
    
    public int [][] maximos(int[][] patron1, int[][] patron2,int[][] patron3,int[][] patron4){
        int[][]max= new int[patron1.length][patron1.length];
        System.out.println("Maximos: ");
        int mayor;
            for(int i=0;i<patron1.length;i++){
                for(int j=0;j<patron1.length;j++){
                    if (patron1[i][j] >= patron2[i][j]&& patron1[i][j] >= patron3[i][j] && patron1[i][j] >= patron4[i][j] ) {
                        mayor = patron1[i][j];
                    } else if (patron2[i][j] >= patron1[i][j] && patron2[i][j] >= patron3[i][j] && patron2[i][j] >= patron4[i][j] ) {
                        mayor = patron2[i][j];
                    } else if (patron3[i][j] >= patron1[i][j] && patron3[i][j] >= patron2[i][j] && patron3[i][j] >= patron4[i][j]) {
                        mayor = patron3[i][j];
                    }else {
                        mayor = patron4[i][j];
                    }
                    max[i][j]=mayor;
                    
                    System.out.print("["+max[i][j]+"]");

                }
            System.out.println("");
        }
        return max;
    }
    
    public int [][] minimos(int[][] patron1, int[][] patron2,int[][] patron3,int[][] patron4){
        int[][]min= new int[patron1.length][patron1.length];
        System.out.println("Minimos: ");
        int menor;
            for(int i=0;i<patron1.length;i++){
                for(int j=0;j<patron1.length;j++){
                    if (patron1[i][j] <= patron2[i][j]&& patron1[i][j] <= patron3[i][j] && patron1[i][j] <= patron4[i][j]) {
                        menor = patron1[i][j];
                    } else if (patron2[i][j] <= patron1[i][j] && patron2[i][j] <= patron3[i][j] && patron2[i][j] <= patron4[i][j]) {
                        menor = patron2[i][j];
                    } else if (patron3[i][j] <= patron1[i][j] && patron3[i][j] <= patron2[i][j] && patron3[i][j] <= patron4[i][j]) {
                        menor = patron3[i][j];
                    } else {
                        menor = patron4[i][j];
                    }
                    min[i][j]=menor;
                    
                    System.out.print("["+min[i][j]+"]");

                }
            System.out.println("");
        }
        return min;
    }
    
    public int [] recuperacionMax(int[] entrada,int memoriaMax[][]){
        int[] recuperacion= new int[entrada.length];
        int[][] temporal= new int[memoriaMax.length][memoriaMax.length];
         System.out.println("Recuperacion Maximos: ");
            for(int i=0;i<entrada.length;i++){
                for(int j=0;j<entrada.length;j++){
                     temporal[i][j]= beta(memoriaMax[i][j],entrada[j]);
                    //System.out.print("["+temporal[i][j]+"]");
                }
                //System.out.println("");
            }
            recuperacion=encontrarMenoresPorFila(temporal);
            //System.out.println("Recuperacion final: ");
            for(int i=0;i< recuperacion.length;i++){
                //System.out.print("["+recuperacion[i]+"]");
            }
            //System.out.println("");
            
        return recuperacion;
    }
    
     public int [] recuperacionMin(int[] entrada,int memoriaMin[][]){
        int[] recuperacion= new int[entrada.length];
        int[][] temporal= new int[memoriaMin.length][memoriaMin.length];
         System.out.println("Recuperacion Minimos: ");
            for(int i=0;i<entrada.length;i++){
                for(int j=0;j<entrada.length;j++){
                     temporal[i][j]= beta(memoriaMin[i][j],entrada[j]);
                    //System.out.print("["+temporal[i][j]+"]");
                }
                //System.out.println("");
            }
            recuperacion=encontrarMayoresPorFila(temporal);
            //System.out.println("Recuperacion final: ");
            for(int i=0;i< recuperacion.length;i++){
                //System.out.print("["+recuperacion[i]+"]");
            }
        return recuperacion;
    }
    public void limpiar(){
        hacerCeros(matriz1);
        hacerCeros(matriz2);
        hacerCeros(matriz3);
        hacerCeros(matriz4);
        hacerCeros(matrizE1);
        hacerCeros(matrizE2);
        hacerCeros(matrizE3);
        hacerCeros(matrizE4);
        hacerCeros(memoriaMax);
        hacerCeros(memoriaMin);
        hacerCeros(recuperacion1Max);
        hacerCeros(recuperacion2Max);
        hacerCeros(recuperacion3Max);
        hacerCeros(recuperacion4Max);
        hacerCeros(recuperacion1Min);
        hacerCeros(recuperacion2Min);
        hacerCeros(recuperacion3Min);
        hacerCeros(recuperacion4Min);
        
        hacerCeros(memoriaMax);
        hacerCeros(memoriaMin);
        configurarColores(panel_matrizE1, limpieza);
        configurarColores(panel_matrizE2, limpieza);
        configurarColores(panel_matrizE3, limpieza);
        configurarColores(panel_matrizE4, limpieza);
        configurarColores(panel_matrizP1, limpieza);
        configurarColores(panel_matrizP2, limpieza);
        configurarColores(panel_matrizP3, limpieza);
        configurarColores(panel_matrizP4, limpieza);
        
        configurarColores(panel_matrizMax1, limpieza);
        configurarColores(panel_matrizMax2, limpieza);
        configurarColores(panel_matrizMax3, limpieza);
        configurarColores(panel_matrizMax4, limpieza);
        configurarColores(panel_matrizMin1, limpieza);
        configurarColores(panel_matrizMin2, limpieza);
        configurarColores(panel_matrizMin3, limpieza);
        configurarColores(panel_matrizMin4, limpieza);
        
    } 
    public static int[] encontrarMayoresPorFila(int[][] matriz) {
        int filas = matriz.length;
        int[] mayoresPorFila = new int[filas];

        for (int i = 0; i < filas; i++) {
            int mayor = matriz[i][0];
            for (int j = 1; j < matriz[i].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
            mayoresPorFila[i] = mayor;
        }

        return mayoresPorFila;
    }
    
    public static void hacerCeros(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                matriz[fila][columna] = 0;
            }
        }
    }
     
    public static int[] encontrarMenoresPorFila(int[][] matriz) {
        int filas = matriz.length;
        int[] menoresPorFila = new int[filas];

        for (int i = 0; i < filas; i++) {
            int menor = matriz[i][0];
            for (int j = 1; j < matriz[i].length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
            menoresPorFila[i] = menor;
        }

        return menoresPorFila;
    }
    
    public static int[] convertirBidimensional(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length; // Suponemos que todas las filas tienen la misma cantidad de columnas

        int[] arregloUnidimensional = new int[filas * columnas];
        int index = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                arregloUnidimensional[index] = matriz[i][j];
                index++;
            }
        }

        return arregloUnidimensional;
    }
    
    public static int[][] convertirABidimensional(int[] arregloUnidimensional, int filas, int columnas) {
        if (arregloUnidimensional.length != filas * columnas) {
            throw new IllegalArgumentException("El tamaño del arreglo unidimensional no coincide con el número de filas y columnas especificadas.");
        }

        int[][] matrizBidimensional = new int[filas][columnas];
        int index = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizBidimensional[i][j] = arregloUnidimensional[index];
                index++;
                System.out.print("["+matrizBidimensional[i][j]+"]");
            }
            System.out.println("");
        }

        return matrizBidimensional;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel_matrizE1;
    private javax.swing.JPanel panel_matrizE2;
    private javax.swing.JPanel panel_matrizE3;
    private javax.swing.JPanel panel_matrizE4;
    private javax.swing.JPanel panel_matrizMax1;
    private javax.swing.JPanel panel_matrizMax2;
    private javax.swing.JPanel panel_matrizMax3;
    private javax.swing.JPanel panel_matrizMax4;
    private javax.swing.JPanel panel_matrizMin1;
    private javax.swing.JPanel panel_matrizMin2;
    private javax.swing.JPanel panel_matrizMin3;
    private javax.swing.JPanel panel_matrizMin4;
    private javax.swing.JPanel panel_matrizP1;
    private javax.swing.JPanel panel_matrizP2;
    private javax.swing.JPanel panel_matrizP3;
    private javax.swing.JPanel panel_matrizP4;
    // End of variables declaration//GEN-END:variables
}
class MatrizPanel extends JPanel {
    private int numRows;
    private int numCols;
    private boolean[][] grid; // Matriz para almacenar el estado de cada celda

    public MatrizPanel(int numRows, int numCols) {
        this.numRows = numRows;
        this.numCols = numCols;
        this.grid = new boolean[numRows][numCols];

        // Agregar un MouseListener para manejar los clics del ratón
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int cellSize = getWidth() / numCols;
                int row = e.getY() / cellSize;
                int col = e.getX() / cellSize;
                grid[row][col] = !grid[row][col]; // Alternar entre negro y blanco
                repaint(); // Volver a dibujar el panel
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int cellSize = getWidth() / numCols;

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                if (grid[row][col]) {
                    g.setColor(Color.BLACK);
                } else {
                    g.setColor(Color.WHITE);
                }
                g.fillRect(col * cellSize, row * cellSize, cellSize, cellSize);
            }
        }
    }
}

