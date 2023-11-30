/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mycompany.proyecto.interfaz;

import java.awt.Image;
import static mycompany.proyecto.NewClass.boleta;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 *
 * @author juan
 */
public class GenerarBoleta extends javax.swing.JFrame {
    
DefaultListModel modelo = new DefaultListModel();
    public GenerarBoleta() {

        initComponents();
                 ImageIcon image =new ImageIcon(getClass().getResource("/imagenes/fondo.jpeg"));
 Icon icon = new ImageIcon(
         image.getImage().getScaledInstance(imageFondo.getWidth(), imageFondo.getHeight(), Image.SCALE_DEFAULT)
 );
 imageFondo.setIcon(icon);
 this.repaint();
          this.setExtendedState(GenerarBoleta.MAXIMIZED_BOTH);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        numeroBoleta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        colorboleta = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ganador = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        imageFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1370, 770));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1370, 770));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("Generar boleta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 200, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Número");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 110, -1));

        numeroBoleta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        numeroBoleta.setForeground(new java.awt.Color(255, 255, 255));
        numeroBoleta.setText("0");
        jPanel1.add(numeroBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Color");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 110, -1));

        colorboleta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        colorboleta.setForeground(new java.awt.Color(255, 255, 255));
        colorboleta.setText("Ninguno");
        jPanel1.add(colorboleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ganador");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Telefono");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, -1, -1));

        ganador.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ganador.setForeground(new java.awt.Color(255, 255, 255));
        ganador.setText("Ninguno");
        jPanel1.add(ganador, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 100, -1));

        telefono.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        telefono.setForeground(new java.awt.Color(255, 255, 255));
        telefono.setText("0000");
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, 90, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 120, 40));
        jPanel1.add(imageFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Inicio in = new Inicio();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        
        
        
        
        
        
        
        
        
        Random random = new Random();
        
        /*String[] colores = {"amarillo", "rojo", "azul","naranja","morado", "verde","cafe","blanco","negro"};
        */
        int numeroGanador= random.nextInt(boleta.size());
        numeroBoleta.setText(String.valueOf(numeroGanador));
        colorboleta.setText(boleta.get(numeroGanador).getColor());
        boleta.get(numeroGanador);
                ganador.setText(boleta.get(numeroGanador).getUsuarioboleta().getNombre());
telefono.setText(String.valueOf(boleta.get(numeroGanador).getUsuarioboleta().getNumeroCelular()));

        
         
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel colorboleta;
    private javax.swing.JLabel ganador;
    private javax.swing.JLabel imageFondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel numeroBoleta;
    private javax.swing.JLabel telefono;
    // End of variables declaration//GEN-END:variables
}
