package cadena_genetica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.JOptionPane;

public class interfaz extends javax.swing.JFrame {

    ArrayList<individuo> individuos = new ArrayList<>();
    // numero generacion y fin
    HashMap<Integer, Integer> ruleta = new HashMap<>();

    public interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_cadena = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sp_generaciones = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        sp_individuos = new javax.swing.JSpinner();
        bt_inicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_poblacion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_familia = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        txt_cadena.setText("Hola a todosa");

        jLabel1.setText("CADENA OBJETIVO");

        jLabel2.setText("Generaciones");

        sp_generaciones.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel3.setText("Individuos");

        sp_individuos.setModel(new javax.swing.SpinnerNumberModel(10, 1, null, 1));

        bt_inicio.setText("Inicio");
        bt_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_inicioActionPerformed(evt);
            }
        });

        txt_poblacion.setColumns(20);
        txt_poblacion.setRows(5);
        jScrollPane1.setViewportView(txt_poblacion);

        txt_familia.setColumns(20);
        txt_familia.setRows(5);
        jScrollPane2.setViewportView(txt_familia);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_cadena, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane2))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sp_generaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(sp_individuos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bt_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cadena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sp_generaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(sp_individuos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_inicio))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_inicioActionPerformed
        
        String cadena = txt_cadena.getText();
        int numIndividuos = (int) sp_individuos.getValue();
        // nuevo individuo apartir del la cad orginal 

        individuo ind = null;

        if (txt_cadena.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inserte una cadena");
        } else {
            for (int i = 0; i < numIndividuos; i++) {
                ind = new individuo(i + 1, cadena.length(), cadena.trim());
                //SIN HILOS
                ind.generar();
                ind.setCalificacion(ind.evaluar());
                /*
                CON HILOS
                ind.strat();
                 */
                individuos.add(ind);
                txt_poblacion.append(ind.toString() + "\n");
            }
        }

        generar_ruleta();

        imprimir_ruleta();

        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        
        // calcular la frecuencia total (la suma de cada frec)
        int frecuencia_tot = 0;
        for (individuo individuo1 : individuos) {
            frecuencia_tot += individuo1.getCalificacion();
        }

        // crear una lista donde se van a colocar las categorias de cada random para formar hijos
        ArrayList<Integer> rdm_y_num = new ArrayList<>();
        
        // generar los randoms 
        for (int i = 0; i < individuos.size(); i++) {
            int r = generarNumeroAleatorio(0, frecuencia_tot);
            // obtener la categoria que le corresponde al numero random
            int categoria = obtenerClaseEnRuleta(r);

            System.out.println("el numero " + r + " esta en la categoria " + categoria + "[" + individuos.get(categoria - 1).getCadena() + "]");
            rdm_y_num.add(categoria);
        }

        //hacer hijos
        System.out.println("----------------------------------");

        for (int i = 0; i < rdm_y_num.size(); i += 2) {
            int elemento1 = rdm_y_num.get(i);
            // si queda solouno, que se haga con si mismo
            int elemento2 = (i + 1 < rdm_y_num.size()) ? rdm_y_num.get(i + 1) : rdm_y_num.size();

            String cadenaElemento1 = obtenerCadenaPorGeneracion(elemento1);
            String cadenaElemento2 = obtenerCadenaPorGeneracion(elemento2);
            
            txt_familia.append("\nPapá " + cadenaElemento1+"\n");
            txt_familia.append("Mamá " + cadenaElemento2+"\n");

            int longitudMitad1 = cadenaElemento1.length() / 2;
            int longitudMitad2 = cadenaElemento2.length() / 2;

            // letra central de cada palabra a la primera parte 
            if (cadenaElemento1.length() % 2 != 0) {
                longitudMitad1++;
            }

            if (cadenaElemento2.length() % 2 != 0) {
                longitudMitad2++;
            }

            String primeraParteElem1 = cadenaElemento1.substring(0, longitudMitad1);
            String segundaParteElem1 = cadenaElemento1.substring(longitudMitad1);

            String primeraParteElem2 = cadenaElemento2.substring(0, longitudMitad2);
            String segundaParteElem2 = cadenaElemento2.substring(longitudMitad2);

            
            String combinacion1 = primeraParteElem1 + segundaParteElem2;
            String combinacion2 = primeraParteElem2 + segundaParteElem1;

            // combinaciones resultantes
            txt_familia.append("\n\tCombinación 1: " + combinacion1);
            txt_familia.append("\n\tCombinación 2: " + combinacion2);

        }


    }//GEN-LAST:event_bt_inicioActionPerformed

    public void generar_ruleta() {
        int inicio = 0;

        for (individuo ind : individuos) {
            if (ind.getCalificacion() > 0) {
                inicio += ind.getCalificacion();
                ruleta.put(ind.getNoGeneracion(), inicio);
            } else {
                continue;
            }
        }
    }

    public void imprimir_ruleta() {
        System.out.println("------" + ruleta.size());

        int inicio = 0;
        for (Map.Entry<Integer, Integer> entry : ruleta.entrySet()) {
            int generacion = entry.getKey();
            int fin = entry.getValue();

            System.out.println("Sección " + generacion + " (" + inicio + ", " + fin + ")");

            inicio = fin + 1;
        }
    }

    public static int generarNumeroAleatorio(int inicio, int fin) {
        Random rand = new Random();
        return rand.nextInt(fin - inicio + 1) + inicio;
    }

    public int obtenerClaseEnRuleta(int numero) {
        int inicio = 0;
        for (Map.Entry<Integer, Integer> entry : ruleta.entrySet()) {
            int generacion = entry.getKey();
            int fin = entry.getValue();

            if (numero >= inicio && numero <= fin) {
                return generacion;
            }

            inicio = fin;
        }
        return -1;
    }

    public String obtenerCadenaPorGeneracion(int noGeneracion) {
        for (individuo ind : individuos) {
            if (ind.getNoGeneracion() == noGeneracion) {
                return ind.getCadena();
            }
        }
        return null; // null si no se encuentra el número de generación
    }

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
    private javax.swing.JButton bt_inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner sp_generaciones;
    private javax.swing.JSpinner sp_individuos;
    private javax.swing.JTextField txt_cadena;
    private javax.swing.JTextArea txt_familia;
    private javax.swing.JTextArea txt_poblacion;
    // End of variables declaration//GEN-END:variables
}
