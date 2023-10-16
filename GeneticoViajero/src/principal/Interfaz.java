package principal;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;




public class Interfaz extends javax.swing.JFrame {
    Graphics g;
    List<Integer> resultado = new ArrayList<Integer>();;
    ArrayList<ciudad> ciudades = new ArrayList<ciudad>();
    
    int numero=0;
    int[][] tablaDistancias;
    
    public Interfaz() {
        initComponents();
        txt_generaciones.setEditable(false);
        txt_matriz.setEditable(false);
        txt_resultado.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_resultado = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_matriz = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btn_borrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_generaciones = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 204));
        panelPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelPrincipalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jButton1.setText("Generar Caminos Aleatoreos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Unir caminos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Inicio");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txt_resultado.setColumns(20);
        txt_resultado.setRows(5);
        jScrollPane1.setViewportView(txt_resultado);

        jLabel1.setText("Matriz de distancias");

        txt_matriz.setColumns(20);
        txt_matriz.setRows(5);
        jScrollPane2.setViewportView(txt_matriz);

        jLabel2.setText("Resultado");

        btn_borrar.setText("Borrar");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        txt_generaciones.setColumns(20);
        txt_generaciones.setRows(5);
        jScrollPane3.setViewportView(txt_generaciones);

        jLabel3.setText("Generaciones");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(32, 32, 32)
                                .addComponent(jButton2)
                                .addGap(33, 33, 33)
                                .addComponent(jButton3))
                            .addComponent(btn_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3)
                        .addGap(6, 6, 6)))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int numCiudades;
       
        g=panelPrincipal.getGraphics();
        Graphics2D g2d = (Graphics2D) g;
        try {
            numCiudades=Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte el numero de ciudades que desea"));
            if(numCiudades!=0){
                for(int i=0;i<numCiudades;i++){
                    int posx=(int)(Math.random()*670);
                    int posy=(int)(Math.random()*650);
                    Color col= new Color((int)(Math.random()*255+0),(int)(Math.random()*255+0),(int)(Math.random()*255+0));
                    ciudad c= new ciudad(posx,posy,numero, col);   
                    g2d.setColor(col);
                    g2d.drawString("Ciudad "+ numero, posx+14, posy+14);
                    numero++;
                    ciudades.add(c);
                    g.setColor(col);
                    g.fillOval(posx, posy,15, 15);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Inserte un valor numero!");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void panelPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrincipalMouseClicked
        g=panelPrincipal.getGraphics();
        repintar();
        int posx =panelPrincipal.getMousePosition().x;
        int posy =panelPrincipal.getMousePosition().y;
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(3));
        Color col= new Color((int)(Math.random()*255+0),(int)(Math.random()*255+0),(int)(Math.random()*255+0));
        
        g2d.setColor(col);
        g2d.drawString("Ciudad "+ numero, posx+14, posy+14);
        ciudad c= new ciudad(posx,posy,numero, col);
        numero++;
        ciudades.add(c);
        g.setColor(col);
        g.fillOval(panelPrincipal.getMousePosition().x, panelPrincipal.getMousePosition().y,15, 15);
        
    }//GEN-LAST:event_panelPrincipalMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    int posx;
    int posy;
    
    tablaDistancias = new int[ciudades.size()][ciudades.size()];
    
    for(int j=0;j<ciudades.size();j++){
        posx=ciudades.get(j).posX+5;
        posy=ciudades.get(j).posY+5;
        ciudades.get(j).distancias.clear();
        for(int i=0;i<ciudades.size();i++){
            Graphics2D g2d = (Graphics2D) g;
            
            g2d.setStroke(new BasicStroke(3));
            g.setColor(Color.BLACK);
            int distancia=distancia(ciudades.get(j),ciudades.get(i));
            ciudades.get(j).distancias.add(distancia);
            if(distancia!=0){
                g2d.setColor(Color.BLACK);
                g2d.drawString(distancia+"px", (posx +ciudades.get(i).posX+3 ) / 2, (posy + ciudades.get(i).posY+3) / 2);
                g.drawLine(posx, posy, ciudades.get(i).posX+3, ciudades.get(i).posY+3);
            }
            
            tablaDistancias[j][i]=distancia(ciudades.get(j),ciudades.get(i));
        }
    }
    repintar();
    distancias();

      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txt_resultado.setText("");
        txt_generaciones.setText("");
        int ciudadInicial;
        resultado.clear();
       
        try {
            ciudadInicial=Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte el numero de ciudad con el que quiera empezar"));
            if(ciudadInicial<ciudades.size() && ciudadInicial>=0 && tablaDistancias!=null){
                
                Generacion posiblesCaminos = new Generacion(ciudades.size(),tablaDistancias, ciudadInicial, 0, txt_generaciones);
                //vendedor solucion = posiblesCaminos.iniciar();
                try {
                    Thread t = new Thread(posiblesCaminos);
                    t.start();
                    t.join();
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
                vendedor solucion=posiblesCaminos.mejorSolucion;
                resultado.add(ciudadInicial);
                for(int i=0;i<solucion.posibleSolucion.size();i++){
                    resultado.add(solucion.posibleSolucion.get(i));
                }
                resultado.add(ciudadInicial);

                for ( int i: resultado ) {
                   System.out.print(" ["+i+"]");
                }
                pintarSolucion();
                txt_resultado.append("\n SOLUCION ENCONTRADA EN EL MEJOR \nINDIVIDUO DE LA GENERACION:"+solucion.noGeneracion );
                txt_resultado.append("\n SE EMPIEZA EL VIAJE EN LA CIUDAD "+resultado.get(0));
                for(int i=1;i<resultado.size();i++){
                     txt_resultado.append("\n DESPUES SE TOMA LA CIUDAD  "+resultado.get(i)+ "("+ciudades.get(resultado.get(i)).distancias.get(resultado.get(i-1))+"px)");
                     if(i-1==resultado.size()){
                        txt_resultado.append("\n POR ULTIMO  "+resultado.get(i)+ "("+ciudades.get(resultado.get(i)).distancias.get(resultado.get(i-1))+"px)");
                     }
                }
                txt_resultado.append("\n DISTANCIA TOTAL: "+solucion.aptitud);
                System.out.println(solucion);
            }else{
                 JOptionPane.showMessageDialog(null, "Inserte el valor de una ciudad Valida");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error! \n asegurese de insertar un valor valido y/o unir caminos");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        limpiar();
    
    }//GEN-LAST:event_btn_borrarActionPerformed
    public void limpiar(){
        resultado.clear();
        ciudades.clear();
        panelPrincipal.removeAll();
        panelPrincipal.repaint();
        panelPrincipal.revalidate();
        numero=0;
        txt_matriz.setText("");
        txt_resultado.setText("");
        txt_generaciones.setText("");
    }
    public void repintar(){
        Color col= new Color((int)(Math.random()*255+0),(int)(Math.random()*255+0),(int)(Math.random()*255+0));
        g.setColor(col);
        
        for(ciudad c: ciudades){
            g.setColor(c.col);
            g.drawString("Ciudad "+ c.numeroCiudad, c.posX+14, c.posY+14);
            g.fillOval(c.posX, c.posY,15, 15);
        }
    }
    public int distancia(ciudad c1, ciudad c2){     
        int distanciaP= (int)Math.sqrt(Math.pow(c2.posX-c1.posX, 2)+Math.pow(c2.posY-c1.posY, 2));
        return distanciaP;            
    }
    public void imprimirDistancia(){
        for(int i=0;i<ciudades.size();i++){
            System.out.println(ciudades.get(i).toString());
        }
    }
    public void distancias(){
        txt_matriz.setText("");
        for(int i=0; i<tablaDistancias.length;i++){
            for(int j=0; j<tablaDistancias.length;j++){
                txt_matriz.append("[ "+tablaDistancias[i][j]+" ]");
                 System.out.print("["+tablaDistancias[i][j]+"]");
            }
            txt_matriz.append("\n");
            System.out.println("");
        }
    }
    public void pintarSolucion(){
        int posx=ciudades.get(resultado.get(0)).posX;
        int posy=ciudades.get(resultado.get(0)).posY;
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(3));
        for(int k=0;k<resultado.size();k++){
            g2d.setColor(Color.RED);
            g2d.drawLine(posx+3, posy+3, ciudades.get(resultado.get(k)).posX+3, ciudades.get(resultado.get(k)).posY+3);
            posx=ciudades.get(resultado.get(k)).posX;
            posy=ciudades.get(resultado.get(k)).posY;

        }
        repintar();
        

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
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextArea txt_generaciones;
    private javax.swing.JTextArea txt_matriz;
    private javax.swing.JTextArea txt_resultado;
    // End of variables declaration//GEN-END:variables
}
