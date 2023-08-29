
package principal;

import java.awt.Color;
import java.awt.Graphics;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;


public class Interfaz extends javax.swing.JFrame {

  
    int[] puntosX;
    int[] puntosY;
    
    Graphics g;
    int maxPuntos;
    Puntos auxiliar;
    int primera=0;
    ArrayList<Integer> numerosGuardadosX = new ArrayList<Integer>();
    ArrayList<Integer> numerosGuardadosY = new ArrayList<Integer>();
    ArrayList<cluster> graficar= new ArrayList<>();
    ArrayList<cluster> clusteres= new ArrayList<>();
    int numero=0;
    
    JPanel aux;
    public Interfaz() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sp_puntos = new javax.swing.JSpinner();
        btn_generar = new javax.swing.JButton();
        btn_inicio = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        lb_k = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 204));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(650, 800));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(650, 800));
        panelPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelPrincipalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 500));

        jLabel1.setText("Numero de puntos");

        sp_puntos.setModel(new javax.swing.SpinnerNumberModel(100, 100, null, 1));
        sp_puntos.setFocusable(false);
        sp_puntos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sp_puntosStateChanged(evt);
            }
        });

        btn_generar.setText("Generar");
        btn_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarActionPerformed(evt);
            }
        });

        btn_inicio.setText("Inicio");
        btn_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicioActionPerformed(evt);
            }
        });

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        lb_k.setText("K=0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(sp_puntos, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_generar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lb_k)))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sp_puntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_generar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_k)
                .addGap(33, 33, 33)
                .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(312, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                    .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sp_puntosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sp_puntosStateChanged
      
    }//GEN-LAST:event_sp_puntosStateChanged

    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed
        if(puntosX!=null &&puntosY!=null){
            auxiliar= new Puntos(panelPrincipal, puntosX, puntosY);
            auxiliar.borrarPuntos();
            
            auxiliar.redibujar(numerosGuardadosX, numerosGuardadosY);
            Redibujar(Color.red);
        }
        maxPuntos = (int) sp_puntos.getValue();
        
        puntosX= new int[maxPuntos];
        puntosY = new int[maxPuntos];
        Puntos p= new Puntos(panelPrincipal, puntosX, puntosY);
        
        p.numPuntos=maxPuntos;
        p.generarPuntos();
        
        puntosX=p.puntosx;
        puntosY=p.puntosy;
        try {
            primera++;
            p.start();
            p.join();
            Redibujar(Color.red);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
   
    }//GEN-LAST:event_btn_generarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void panelPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrincipalMouseClicked
        g=panelPrincipal.getGraphics();
        int posx =panelPrincipal.getMousePosition().x;
        int posy =panelPrincipal.getMousePosition().y;
        
        numerosGuardadosX.add(posx);
        numerosGuardadosY.add(posy);
        g.setColor(Color.red);
        
        g.fillOval(panelPrincipal.getMousePosition().x, panelPrincipal.getMousePosition().y,10, 10);
        Color col= new Color((int)(Math.random()*255+0),(int)(Math.random()*255+0),(int)(Math.random()*255+0));
        cluster c= new cluster(posx,posy, col);
        c.puntosInicialesX=posx;
        c.puntosIncialesY=posy;
        numero++;
        c.noCluster=numero;
        
        clusteres.add(c);
        lb_k.setText("K = "+clusteres.size());
        
           
    }//GEN-LAST:event_panelPrincipalMouseClicked

    private void btn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioActionPerformed
        boolean terminar= false;
        if(puntosX.length==0 || puntosY.length==0 || clusteres.size()==0  || numerosGuardadosX.size()==0|| numerosGuardadosY.size()==0){
            JOptionPane.showMessageDialog(null, "Primero genere los puntos");
        }else{
            do {                
                ArrayList<cluster> aux= new ArrayList<>();
            ArrayList<Boolean> igual= new ArrayList<>();
            
            aux=clusteres;
                for(int i=0;i<puntosX.length;i++){
                    ArrayList<Double> distancia= new ArrayList<>();
                    //calcula la distancia y lo guarda en un arrayList
                    for(int j=0;j<clusteres.size();j++){              
                        double distanciaP= Math.sqrt(Math.pow(puntosX[i]-clusteres.get(j).puntosx, 2)+Math.pow(puntosY[i]-clusteres.get(j).puntosy, 2));
                        //clusteres.get(j).distancias.add(distanciaP);
                        distancia.add(distanciaP);
                    }
                    //obtiene la distancia minima del arrayList
                    double min = distancia.get(0);
                    int indice=0; 

                    for (int j = 1; j < distancia.size(); j++) {
                        if (distancia.get(j) < min) {
                            min = distancia.get(j);
                            indice=j;
                        }
                    }
                    //guarda ese punto en su correspondiente cluster
                    clusteres.get(indice).puntosX.add(puntosX[i]);           
                    clusteres.get(indice).puntosY.add(puntosY[i]);
                    //limpia el arrayList para evitar conflictos
                    distancia.clear();
                }
            g=panelPrincipal.getGraphics();
            //grafica los puntos pertenecientes a cada cluster
            Redibujar(new Color(255,255,204));
            numerosGuardadosX.clear();
            numerosGuardadosY.clear();
            
            graficar=clusteres;
            
            for(int i=0; i<graficar.size();i++){
                for(int j=0;j<graficar.get(i).puntosX.size();j++){
                    g.setColor(graficar.get(i).col);
                    g.fillOval(graficar.get(i).puntosX.get(j), graficar.get(i).puntosY.get(j), 10, 10);
                    
                }
                
                numerosGuardadosX.add( clusteres.get(i).puntosx);
                numerosGuardadosY.add( clusteres.get(i).puntosy);
                clusteres.get(i).centroide();
//                clusteres.get(i).puntosX.clear();
//                clusteres.get(i).puntosY.clear();
                

                if(clusteres.get(i).puntosx==clusteres.get(i).puntoAnteriorX ||clusteres.get(i).puntosy==clusteres.get(i).puntoAnteriorY){
                    clusteres.get(i).igual=true;
                    igual.add(true);
                }else{
                    clusteres.get(i).igual=false;
                    igual.add(false);
                }
            }
            //graficar.clear();
            Redibujar(Color.red);
            for (boolean valor : igual) {
                //System.out.println(valor);
                if (valor==false) {
                    terminar = false;
                    for(int i=0;i<clusteres.size();i++){
                        clusteres.get(i).puntosX.clear();
                        clusteres.get(i).puntosY.clear();
                    }
                  
                    break;
                }else{
                    terminar= true;
                }
               
            }   
            System.out.println(terminar);
            } while (terminar==false);
            JOptionPane.showMessageDialog(null, "El proceso ha terminado excitosamente");
            
            String rutaArchivo = "archivo.txt";
            for(int i=0;i<clusteres.size();i++){
                 try {
           
                    FileWriter escritor = new FileWriter(rutaArchivo);


                    escritor.write(clusteres.toString());
                    escritor.close();

                    System.out.println("Se ha escrito en el archivo correctamente.");
                } catch (IOException e) {
                System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btn_inicioActionPerformed
    public void limpiar() {
     
        panelPrincipal.removeAll();
        panelPrincipal.repaint();
        panelPrincipal.revalidate();
        
        numerosGuardadosX.clear();
        numerosGuardadosY.clear();
        clusteres.clear();
        lb_k.setText("K=0");
        
    }
    public void Redibujar(Color c){
        g=panelPrincipal.getGraphics();
        for(int i=0;i<numerosGuardadosX.size();i++){
            g.setColor(c);
            g.fillOval(numerosGuardadosX.get(i), numerosGuardadosY.get(i), 10, 10);
        }
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_generar;
    private javax.swing.JButton btn_inicio;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_k;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JSpinner sp_puntos;
    // End of variables declaration//GEN-END:variables
}

