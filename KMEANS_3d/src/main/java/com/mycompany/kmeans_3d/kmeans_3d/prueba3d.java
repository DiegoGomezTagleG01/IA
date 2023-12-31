
package com.mycompany.kmeans_3d.kmeans_3d;


import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import org.math.plot.Plot3DPanel;

/**
 *
 * @author Diego
 */
public class prueba3d extends javax.swing.JFrame {

    /**
     * Creates new form prueba3d
     */
    Plot3DPanel plot = new Plot3DPanel();
    
    JInternalFrame f= new JInternalFrame("Plot panel");
    double[] puntosx;
    double[] puntosy;
    double[] puntosz;
    
    double[] Auxiliarpuntosx=null;
    double[] Auxiliarpuntosy=null;
    double[] Auxiliarpuntosz=null;
    
    ArrayList<Double> puntosxK= new ArrayList<>();
    ArrayList<Double> puntosyK= new ArrayList<>();
    ArrayList<Double> puntoszK= new ArrayList<>();
    
  
    double[] x;
    double[] y;
    double[] z;
    
    int k=0;
    double[] AuxiliarpuntosxK;
    double[] AuxiliarpuntosyK;
    double[] AuxiliarpuntoszK;
    int nom=0;
    ArrayList<cluster> clusteres= new ArrayList<>();
    
  
    
    public prueba3d() {
        initComponents();
        DesktopPane.add(f);
        f.setVisible(true);
        f.setSize(800, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        f.setContentPane(plot);
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_generar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        txt_y = new javax.swing.JTextField();
        txt_x = new javax.swing.JTextField();
        txt_z = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sp_puntos = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        lb_k = new javax.swing.JLabel();
        btn_inicio = new javax.swing.JButton();
        btn_csv = new javax.swing.JButton();
        DesktopPane = new javax.swing.JDesktopPane();

        jLabel3.setText("y");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(255, 204, 204));

        jLabel4.setText("Z");

        btn_generar.setText("Generar Puntos");
        btn_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarActionPerformed(evt);
            }
        });

        jButton1.setText("Añadir punto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_borrar.setText("Borrar Todo");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        jLabel1.setText("X");

        jLabel2.setText("Y");

        sp_puntos.setModel(new javax.swing.SpinnerNumberModel(100, 100, null, 1));
        sp_puntos.setFocusable(false);
        sp_puntos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sp_puntosStateChanged(evt);
            }
        });

        jLabel5.setText("Numero de puntos");

        lb_k.setText("K=0");

        btn_inicio.setText("Clasificar");
        btn_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicioActionPerformed(evt);
            }
        });

        btn_csv.setText("Leer CSV");
        btn_csv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_csvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_csv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_borrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                        .addComponent(sp_puntos, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelPrincipalLayout.createSequentialGroup()
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4))
                                .addComponent(jLabel1))
                            .addGap(22, 22, 22)
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_x, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                .addComponent(txt_y)
                                .addComponent(txt_z)
                                .addGroup(panelPrincipalLayout.createSequentialGroup()
                                    .addComponent(lb_k, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1))))
                        .addComponent(btn_generar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_z, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_k)
                    .addComponent(jButton1))
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp_puntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_generar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_inicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_borrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_csv)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DesktopPane.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(DesktopPane);
        DesktopPane.setLayout(DesktopPaneLayout);
        DesktopPaneLayout.setHorizontalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        DesktopPaneLayout.setVerticalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(DesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(puntosx!=null ||puntosy!=null ||puntosz!=null){
           plot.removeAllPlots();
           Redibujar("puntos", Color.black, Auxiliarpuntosx, Auxiliarpuntosy, Auxiliarpuntosz);
          
        }if(puntosx==null || puntosy==null|| puntosz==null || puntosxK==null || puntosyK ==null || puntoszK==null ||
                txt_x.getText().isEmpty() || txt_y.getText().isEmpty() || txt_z.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese los puntos primero ");
        }else{
            Color cl= new Color((int)(Math.random()*255+0),
                (int)(Math.random()*255+0),(int)(Math.random()*255+0));
        cluster c= new cluster(plot,Double.parseDouble(txt_x.getText())
                ,Double.parseDouble(txt_y.getText())
                ,Double.parseDouble(txt_z.getText()),cl);
        
        c.puntosInicialesX=Double.parseDouble(txt_x.getText());
        c.puntosIncialesY=Double.parseDouble(txt_y.getText());
        c.puntosIncialesZ=Double.parseDouble(txt_z.getText());
        
        c.puntosx=(float)Double.parseDouble(txt_x.getText());
        c.puntosy=(float)Double.parseDouble(txt_y.getText());
        c.puntosz=(float)Double.parseDouble(txt_z.getText());
        c.noCluster=nom++;
        clusteres.add(c);
        
        
        puntosxK.add(Double.valueOf(txt_x.getText()));
        puntosyK.add(Double.valueOf(txt_y.getText()));
        puntoszK.add(Double.valueOf(txt_z.getText()));
        
        
        
        k++;
        lb_k.setText("K= "+k);
       
        x=convertir(puntosxK);
        y=convertir(puntosyK);
        z=convertir(puntoszK);
       
        txt_x.setText("");
        txt_y.setText("");
        txt_z.setText("");
        
        AuxiliarpuntosxK=x;
        AuxiliarpuntosyK=y;
        AuxiliarpuntoszK=z;
        
        plot.addScatterPlot("Kpuntos", Color.red, x, y, z);
        //Redibujar("Kpuntos", Color.red, AuxiliarpuntosxK, AuxiliarpuntosyK, AuxiliarpuntoszK);
        plot.repaint();
      
        }
      
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        limpiar();        
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed
        plot.removeAllPlots();
        if(AuxiliarpuntosxK!=null ||AuxiliarpuntosyK!=null ||AuxiliarpuntoszK!=null){
           Redibujar("Kpuntos", Color.red,AuxiliarpuntosxK, AuxiliarpuntosyK, AuxiliarpuntoszK);
        }
        
        int numPuntos = (int) sp_puntos.getValue();
        puntosx= new double[numPuntos];
        puntosy= new double[numPuntos];
        puntosz= new double[numPuntos];
        for(int i=0;i<numPuntos;i++){        
            puntosx[i]=(Math.random()*50+0);
            puntosy[i]=(Math.random()*50+0);
            puntosz[i]=(Math.random()*50+0);
        }

        plot.addScatterPlot("Puntos", Color.black, puntosx, puntosy, puntosz);
        plot.repaint();
        Auxiliarpuntosx=puntosx;
        Auxiliarpuntosy=puntosy;
        Auxiliarpuntosz=puntosz;
        
        
    }//GEN-LAST:event_btn_generarActionPerformed

    private void sp_puntosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sp_puntosStateChanged

    }//GEN-LAST:event_sp_puntosStateChanged

    private void btn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioActionPerformed
        boolean terminar= false;
        
        if(x==null || y==null|| z==null || puntosxK.isEmpty() || puntosyK.isEmpty() || puntoszK.isEmpty() || 
                puntosx==null|| puntosy==null|| puntosz==null || clusteres.isEmpty()){
            JOptionPane.showMessageDialog(null, "Primero genere los puntos");
        }else{
            //asignamos los valores maximos y minimos del conjunto
            for(int i=0;i<clusteres.size();i++){
                clusteres.get(i).rangoInferiorx=Collections.min(Reconvertir(puntosx));
                clusteres.get(i).rangoSuperiorx=Collections.max(Reconvertir(puntosx));
                clusteres.get(i).rangoInferiory=Collections.min(Reconvertir(puntosy));
                clusteres.get(i).rangoSuperiory=Collections.max(Reconvertir(puntosy));
                clusteres.get(i).rangoInferiorz=Collections.min(Reconvertir(puntosz));
                clusteres.get(i).rangoSuperiorz=Collections.max(Reconvertir(puntosz));
            }
           
            do {                
               for(int i=0;i<puntosx.length;i++){
                    ArrayList<Double> distancia= new ArrayList<>();
                   //se mide la distancia del punto con los centroides
                    for(int j=0;j<clusteres.size();j++){              
                        double distanciaP= Math.sqrt(Math.pow(puntosx[i]-clusteres.get(j).puntosx, 2)+
                                Math.pow(puntosy[i]-clusteres.get(j).puntosy, 2)+Math.pow(puntosz[i]-clusteres.get(j).puntosz, 2));
                        //se guarda en un arrayList 
                        distancia.add(distanciaP);
                    }
                    //busca el elemento mas con menor distancia
                    double min= Collections.min(distancia);
                    int indice=0; 
                    
                    //busca su indice, pues corresponde al del cluster
                    for (int j = 0; j < distancia.size(); j++) {
                       if(min==distancia.get(j)){
                           indice=j;
                       }
                    }
                    //asigna el punto actual con el cluster del indice 
                    clusteres.get(indice).puntosX.add(puntosx[i]);           
                    clusteres.get(indice).puntosY.add(puntosy[i]);
                    clusteres.get(indice).puntosZ.add(puntosz[i]);
                    //limpia el arrayList para evitar conflictos
                    distancia.clear();
               }
               //actualiza el centroide con el promedio
               for (int i=0;i<clusteres.size();i++){
                   clusteres.get(i).centroide();
               }
               //crea un arreglo de booleanos
               ArrayList<Boolean> igual= new ArrayList<>();
              
                //comprueba si lso valores de los centroides son iguales al anterior
                for(int j=0;j<clusteres.size();j++){
                    if(Math.round(clusteres.get(j).puntosx)==Math.round(clusteres.get(j).puntoAnteriorX)
                           && Math.round(clusteres.get(j).puntosy)== Math.round(clusteres.get(j).puntoAnteriorY)
                           && Math.round(clusteres.get(j).puntosz)==Math.round(clusteres.get(j).puntoAnteriorZ) ){
                        clusteres.get(j).igual=true;
                        //si son diferentes se agrega un true al arrayList
                        igual.add(true);
                    }else{
                        clusteres.get(j).igual=false;
                        //si son iguales se agrega un false al arrayList
                        igual.add(false);
                    }
                }
                //busca si en el arrayList igual existe un valor false
                for (boolean valor : igual) {
                    
                    if (valor==false) {
                        //si existe un valor false, se prepara todo para reiniciar el ciclo
                        terminar = false;
                        for(int i=0;i<clusteres.size();i++){
                            clusteres.get(i).puntosX.clear();
                            clusteres.get(i).puntosY.clear();
                            clusteres.get(i).puntosZ.clear();
                        }
                        break;
                    }else{
                        //si no existe un valor false, entonces la variable terminar es igual a true para terminar el ciclo
                        terminar= true;
                    }
               
                } 
               
            } while (terminar==false);
            JOptionPane.showMessageDialog(null, "El proceso ha terminado excitosamente");  
            Thread t;
            plot.removeAllPlots();
            //dibuja los puntos con su nuevo cluster asignado
            double[] clusteresx= new double[clusteres.size()];
            double[] clusteresy= new double[clusteres.size()];
            double[] clusteresz= new double[clusteres.size()];
            for(int i=0;i<clusteres.size();i++){
                clusteresx[i]=clusteres.get(i).puntosx;
                clusteresy[i]=clusteres.get(i).puntosy;
                clusteresz[i]=clusteres.get(i).puntosz;
                
                try {
                    t= new Thread(clusteres.get(i));
                    t.start();
                    t.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(prueba3d.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            //redibuja los centroides
            Redibujar("Centroides", Color.red, clusteresx, clusteresy, clusteresz);
            
        }
        
    }//GEN-LAST:event_btn_inicioActionPerformed

    private void btn_csvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_csvActionPerformed
        limpiar();
        plot.removeAllPlots();
        if(AuxiliarpuntosxK!=null ||AuxiliarpuntosyK!=null ||AuxiliarpuntoszK!=null){
           Redibujar("Kpuntos", Color.red,AuxiliarpuntosxK, AuxiliarpuntosyK, AuxiliarpuntoszK);
        }
        LectorCSV l= new LectorCSV();
        l.leer();
        //int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de rasgo para x(0-3)"));
        //int y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de rasgo para y(0-3)"));
        //int z=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de rasgo para z(0-3)"));
        ArrayList<Double> datosx= new ArrayList<>();
        ArrayList<Double> datosy= new ArrayList<>();
        ArrayList<Double> datosz= new ArrayList<>();
        //if(x!=y && x!=z && y!=z){
            for(int i=1;i<l.datos.size();i++){
                datosx.add(Double.valueOf(l.datos.get(i).get(0)));
                datosy.add(Double.valueOf(l.datos.get(i).get(1)));
                datosz.add(Double.valueOf(l.datos.get(i).get(2)));
            
            }
        //}else{
        //    JOptionPane.showMessageDialog(null, "intenta poner numeros diferentes");
        //}
       
        
        
        puntosx=convertir(datosx);
        puntosy=convertir(datosy);
        puntosz=convertir(datosz);
        
        plot.addScatterPlot("Puntos", Color.black, puntosx, puntosy, puntosz);
        plot.repaint();
        Auxiliarpuntosx=puntosx;
        Auxiliarpuntosy=puntosy;
        Auxiliarpuntosz=puntosz;
        
    }//GEN-LAST:event_btn_csvActionPerformed
    public void limpiar(){
        plot.removeAllPlots();
        
        puntosx= null;
        puntosy= null;
        puntosz=null;
        x=null;
        y=null;
        z=null;
        
        puntosxK.clear();
        puntosyK.clear();
        puntoszK.clear();
        
        AuxiliarpuntosxK=null;
        AuxiliarpuntosyK=null;
        AuxiliarpuntoszK=null;
        lb_k.setText("k=0");
        k=0;
        nom=0;
        clusteres.clear();
    }
    public void Redibujar(String nombre,Color c,double[] x1, double[] y1,double[] z1){
       plot.addScatterPlot(nombre, c, x1,y1,z1);
       plot.repaint();
    }
    public static double[] convertir(ArrayList<Double> n){
        double[]convertir= new double[n.size()];
        for(int i=0;i<n.size();i++){
            convertir[i]=n.get(i);
        }
    return convertir;
    }
    public ArrayList<Double> Reconvertir(double[]n){
        ArrayList<Double> convertir= new ArrayList<>();
        for(int i=0;i<n.length;i++){
            convertir.add(n[i]);
        }
        return convertir;
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
            java.util.logging.Logger.getLogger(prueba3d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prueba3d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prueba3d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prueba3d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prueba3d().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_csv;
    private javax.swing.JButton btn_generar;
    private javax.swing.JButton btn_inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lb_k;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JSpinner sp_puntos;
    private javax.swing.JTextField txt_x;
    private javax.swing.JTextField txt_y;
    private javax.swing.JTextField txt_z;
    // End of variables declaration//GEN-END:variables
}
