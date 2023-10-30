package principal;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Alvaro
 */
public class interfaz1 extends javax.swing.JFrame {

    int columnas = 10;
    int filas = 4;
    JButton[][] tablero = new JButton[10][4];

    TableroPanel tb1_m;
    TableroPanel tb2_m;
    TableroPanel tb3_m;

    TableroPanel tb1;
    TableroPanel tb2;
    TableroPanel tb3;

    TableroPanel tb_s_1;
    TableroPanel tb_s_2;
    TableroPanel tb_s_3;
    TableroPanel tb_s_4;
    TableroPanel tb_s_5;
    TableroPanel tb_s_6;

    int[][] m1 = new int[columnas][filas];

    public interfaz1() {
        initComponents();

        tb1_m = new TableroPanel(filas, columnas);
        tb1_m.setBounds(bk_modelo_1.getLocation().x, bk_modelo_1.getLocation().y, 150, 170);
        add(tb1_m);

        tb2_m = new TableroPanel(filas, columnas);
        tb2_m.setBounds(bk_modelo_2.getLocation().x, bk_modelo_2.getLocation().y, 150, 170);
        add(tb2_m);

        tb3_m = new TableroPanel(filas, columnas);
        tb3_m.setBounds(bk_modelo_3.getLocation().x, bk_modelo_3.getLocation().y, 150, 170);
        add(tb3_m);

        int[][] nuevoEstado1 = {
            {1, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {1, 1, 0, 0, 0, 1, 1, 0, 0, 0},
            {1, 0, 1, 0, 1, 0, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0, 1, 0, 0, 0},};

        int[][] nuevoEstado2 = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},};

        int[][] nuevoEstado3 = {
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };

        tb1_m.setEstadoTablero(nuevoEstado1);
        tb2_m.setEstadoTablero(nuevoEstado2);
        tb3_m.setEstadoTablero(nuevoEstado3);

        tb1 = new TableroPanel(filas, columnas);
        tb1.setBounds(bk_entrada1.getLocation().x, bk_entrada1.getLocation().y, 150, 170);
        add(tb1);

        tb2 = new TableroPanel(filas, columnas);
        tb2.setBounds(bk_entrada2.getLocation().x, bk_entrada2.getLocation().y, 150, 170);
        add(tb2);

        tb3 = new TableroPanel(filas, columnas);
        tb3.setBounds(bk_entrada3.getLocation().x, bk_entrada3.getLocation().y, 150, 170);
        add(tb3);

        tb3 = new TableroPanel(filas, columnas);
        tb3.setBounds(bk_entrada3.getLocation().x, bk_entrada3.getLocation().y, 150, 170);
        add(tb3);

        tb_s_1 = new TableroPanel(filas, columnas);
        tb_s_1.setBounds(bk_salida1.getLocation().x, bk_salida1.getLocation().y, 150, 170);
        add(tb_s_1);

        tb_s_2 = new TableroPanel(filas, columnas);
        tb_s_2.setBounds(bk_salida2.getLocation().x, bk_salida2.getLocation().y, 150, 170);
        add(tb_s_2);

        tb_s_3 = new TableroPanel(filas, columnas);
        tb_s_3.setBounds(bk_salida3.getLocation().x, bk_salida3.getLocation().y, 150, 170);
        add(tb_s_3);

        tb_s_4 = new TableroPanel(filas, columnas);
        tb_s_4.setBounds(bk_salida4.getLocation().x, bk_salida4.getLocation().y, 150, 170);
        add(tb_s_4);

        tb_s_5 = new TableroPanel(filas, columnas);
        tb_s_5.setBounds(bk_salida5.getLocation().x, bk_salida5.getLocation().y, 150, 170);
        add(tb_s_5);

        tb_s_6 = new TableroPanel(filas, columnas);
        tb_s_6.setBounds(bk_salid6.getLocation().x, bk_salid6.getLocation().y, 150, 170);
        add(tb_s_6);

        tb1.setPaneles_Max_Min(tb_s_1, tb_s_4);

        tb1.setPanel_Muestra(tb1_m);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        bk_entrada1 = new javax.swing.JPanel();
        bk_entrada2 = new javax.swing.JPanel();
        bk_entrada3 = new javax.swing.JPanel();
        bk_salida1 = new javax.swing.JPanel();
        bk_salida2 = new javax.swing.JPanel();
        bk_salida3 = new javax.swing.JPanel();
        bk_salida4 = new javax.swing.JPanel();
        bk_salida5 = new javax.swing.JPanel();
        bk_salid6 = new javax.swing.JPanel();
        bk_modelo_1 = new javax.swing.JPanel();
        bk_modelo_2 = new javax.swing.JPanel();
        bk_modelo_3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Principal.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout bk_entrada1Layout = new javax.swing.GroupLayout(bk_entrada1);
        bk_entrada1.setLayout(bk_entrada1Layout);
        bk_entrada1Layout.setHorizontalGroup(
            bk_entrada1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        bk_entrada1Layout.setVerticalGroup(
            bk_entrada1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bk_entrada2Layout = new javax.swing.GroupLayout(bk_entrada2);
        bk_entrada2.setLayout(bk_entrada2Layout);
        bk_entrada2Layout.setHorizontalGroup(
            bk_entrada2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bk_entrada2Layout.setVerticalGroup(
            bk_entrada2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bk_entrada3Layout = new javax.swing.GroupLayout(bk_entrada3);
        bk_entrada3.setLayout(bk_entrada3Layout);
        bk_entrada3Layout.setHorizontalGroup(
            bk_entrada3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bk_entrada3Layout.setVerticalGroup(
            bk_entrada3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bk_salida1Layout = new javax.swing.GroupLayout(bk_salida1);
        bk_salida1.setLayout(bk_salida1Layout);
        bk_salida1Layout.setHorizontalGroup(
            bk_salida1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        bk_salida1Layout.setVerticalGroup(
            bk_salida1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bk_salida2Layout = new javax.swing.GroupLayout(bk_salida2);
        bk_salida2.setLayout(bk_salida2Layout);
        bk_salida2Layout.setHorizontalGroup(
            bk_salida2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bk_salida2Layout.setVerticalGroup(
            bk_salida2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bk_salida3Layout = new javax.swing.GroupLayout(bk_salida3);
        bk_salida3.setLayout(bk_salida3Layout);
        bk_salida3Layout.setHorizontalGroup(
            bk_salida3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bk_salida3Layout.setVerticalGroup(
            bk_salida3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bk_salida4Layout = new javax.swing.GroupLayout(bk_salida4);
        bk_salida4.setLayout(bk_salida4Layout);
        bk_salida4Layout.setHorizontalGroup(
            bk_salida4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        bk_salida4Layout.setVerticalGroup(
            bk_salida4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bk_salida5Layout = new javax.swing.GroupLayout(bk_salida5);
        bk_salida5.setLayout(bk_salida5Layout);
        bk_salida5Layout.setHorizontalGroup(
            bk_salida5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bk_salida5Layout.setVerticalGroup(
            bk_salida5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bk_salid6Layout = new javax.swing.GroupLayout(bk_salid6);
        bk_salid6.setLayout(bk_salid6Layout);
        bk_salid6Layout.setHorizontalGroup(
            bk_salid6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bk_salid6Layout.setVerticalGroup(
            bk_salid6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bk_modelo_1Layout = new javax.swing.GroupLayout(bk_modelo_1);
        bk_modelo_1.setLayout(bk_modelo_1Layout);
        bk_modelo_1Layout.setHorizontalGroup(
            bk_modelo_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        bk_modelo_1Layout.setVerticalGroup(
            bk_modelo_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bk_modelo_2Layout = new javax.swing.GroupLayout(bk_modelo_2);
        bk_modelo_2.setLayout(bk_modelo_2Layout);
        bk_modelo_2Layout.setHorizontalGroup(
            bk_modelo_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bk_modelo_2Layout.setVerticalGroup(
            bk_modelo_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bk_modelo_3Layout = new javax.swing.GroupLayout(bk_modelo_3);
        bk_modelo_3.setLayout(bk_modelo_3Layout);
        bk_modelo_3Layout.setHorizontalGroup(
            bk_modelo_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bk_modelo_3Layout.setVerticalGroup(
            bk_modelo_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bk_modelo_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bk_modelo_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bk_modelo_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bk_entrada3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bk_entrada2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bk_entrada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bk_salida2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bk_salida3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bk_salida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bk_salida5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bk_salid6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bk_salida4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addComponent(bk_modelo_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bk_modelo_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bk_modelo_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PrincipalLayout.createSequentialGroup()
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bk_salida4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bk_salida1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bk_entrada1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addComponent(bk_entrada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bk_entrada3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bk_salida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bk_salida5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bk_salida3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(PrincipalLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(bk_salid6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(interfaz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Principal;
    private javax.swing.JPanel bk_entrada1;
    private javax.swing.JPanel bk_entrada2;
    private javax.swing.JPanel bk_entrada3;
    private javax.swing.JPanel bk_modelo_1;
    private javax.swing.JPanel bk_modelo_2;
    private javax.swing.JPanel bk_modelo_3;
    private javax.swing.JPanel bk_salid6;
    private javax.swing.JPanel bk_salida1;
    private javax.swing.JPanel bk_salida2;
    private javax.swing.JPanel bk_salida3;
    private javax.swing.JPanel bk_salida4;
    private javax.swing.JPanel bk_salida5;
    // End of variables declaration//GEN-END:variables
}

class TableroPanel extends JPanel {

    private JButton[][] celdas;

    private TableroPanel TableroPanel_max;
    private TableroPanel TableroPanel_min;
    private TableroPanel TableroPanel_muestra;
    int[][] estado;

    public void setPaneles_Max_Min(TableroPanel max, TableroPanel min) {
        TableroPanel_max = max;
        TableroPanel_min = min;
    }

    public void setPanel_Muestra(TableroPanel muestra) {
        TableroPanel_muestra = muestra;
    }

    public void copiar() {
        int filas = TableroPanel_max.celdas.length;
        int columnas = TableroPanel_max.celdas[0].length;

        estado = getEstadoTablero();

        if (estado.length != filas || estado[0].length != columnas) {
            throw new IllegalArgumentException("La matriz de estado debe tener las mismas dimensiones que el tablero.");
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                TableroPanel_max.celdas[i][j].setBackground(estado[i][j] == 1 ? Color.BLACK : Color.WHITE);
            }
        }
    }

    public void alfa() {

        System.out.println("matriz muestra");
        int[][] M_muestra = TableroPanel_muestra.getEstadoTablero();
        System.out.println(M_muestra[0].length + " " + M_muestra.length);
        imprimirMatriz(M_muestra);

        System.out.println("matriz test");
        int[][] M_actual = this.getEstadoTablero();
        M_actual = matrizTraspuesta(M_actual);
        System.out.println(M_actual[0].length + " " + M_actual.length);
        imprimirMatriz(M_actual);

        multiplicarMatrices_alfa(M_actual, M_muestra);
    }

    public int[][] multiplicarMatrices_alfa(int[][] matrizA, int[][] matrizB) {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int columnasB = matrizB[0].length;
        int[][] resultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                int suma = 0;
                for (int k = 0; k < columnasA; k++) {
                    int valorA = matrizA[i][k];
                    int valorB = matrizB[k][j];
                    suma += evaluar_alfa(valorA, valorB);
                }
                resultado[i][j] = suma;
            }
        }

        return resultado;
    }

    public int evaluar_alfa(int x, int y) {
        int a = -1;

        if (x == 0 && y == 0) {
            a = 1;
        }

        if (x == 0 && y == 1) {
            a = 0;
        }

        if (x == 1 && y == 0) {
            a = 2;
        }

        if (x == 1 && y == 1) {
            a = 1;
        }
        return a;
    }

    public TableroPanel(int filas, int columnas) {
        setLayout(new GridLayout(filas, columnas));
        celdas = new JButton[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                final int fila = i;
                final int columna = j;
                celdas[i][j] = new JButton();
                celdas[i][j].setBackground(Color.WHITE);
                celdas[i][j].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JButton boton = (JButton) e.getSource();
                        int x = fila + 1;
                        int y = columna + 1;
                        System.out.println("Celda presionada en fila: " + x + ", columna: " + y);
                        boton.setBackground(boton.getBackground().equals(Color.BLACK) ? Color.WHITE : Color.BLACK);

                        //alfa();
                    }
                });
                add(celdas[i][j]);
            }
        }
    }

    public int[][] getEstadoTablero() {
        int filas = celdas.length;
        int columnas = celdas[0].length;
        int[][] estado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                estado[i][j] = celdas[i][j].getBackground().equals(Color.BLACK) ? 1 : 0;
            }
        }

        return estado;
    }

    public void setEstadoTablero(int[][] estado) {
        int filas = celdas.length;
        int columnas = celdas[0].length;

        if (estado.length != filas || estado[0].length != columnas) {
            throw new IllegalArgumentException("La matriz de estado debe tener las mismas dimensiones que el tablero.");
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                celdas[i][j].setBackground(estado[i][j] == 1 ? Color.BLACK : Color.WHITE);
            }
        }
    }

    public void deshabilitarPanel() {
        for (int i = 0; i < celdas.length; i++) {
            for (int j = 0; j < celdas[0].length; j++) {
                celdas[i][j].setEnabled(false);
            }
        }
    }

    public void actualizarConMatriz(int[][] matriz) {
        if (matriz.length != celdas.length || matriz[0].length != celdas[0].length) {
            throw new IllegalArgumentException("La matriz debe tener las mismas dimensiones que el tablero.");
        }

        for (int i = 0; i < celdas.length; i++) {
            for (int j = 0; j < celdas[0].length; j++) {
                celdas[i][j].setBackground(matriz[i][j] == 1 ? Color.BLACK : Color.WHITE);
            }
        }
    }

    public void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void actualizarConMatriz(int[][] matriz, TableroPanel panel) {
        if (matriz.length != panel.celdas.length || matriz[0].length != panel.celdas[0].length) {
            throw new IllegalArgumentException("La matriz debe tener las mismas dimensiones que el tablero.");
        }

        for (int i = 0; i < panel.celdas.length; i++) {
            for (int j = 0; j < panel.celdas[0].length; j++) {
                panel.celdas[i][j].setBackground(matriz[i][j] == 1 ? Color.BLACK : Color.WHITE);
            }
        }
    }

    public int[][] matrizTraspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] traspuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }

        return traspuesta;
    }
}
