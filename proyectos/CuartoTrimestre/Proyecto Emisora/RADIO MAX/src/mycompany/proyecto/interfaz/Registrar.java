/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mycompany.proyecto.interfaz;


import java.awt.Image;
import static mycompany.proyecto.NewClass.usuario;
import mycompany.proyecto.Usuario;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Registrar extends javax.swing.JFrame {
    public Registrar() {
 
        initComponents();
                 ImageIcon image =new ImageIcon(getClass().getResource("/imagenes/fondo.jpeg"));
 Icon icon = new ImageIcon(
         image.getImage().getScaledInstance(imageFondo.getWidth(), imageFondo.getHeight(), Image.SCALE_DEFAULT)
 );
 imageFondo.setIcon(icon);
 this.repaint();
         this.setExtendedState(Registrar.MAXIMIZED_BOTH);
    }
    public static int docUsuario;
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JTextField();
        textFieldTelefono = new javax.swing.JTextField();
        textFieldDocumento = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        Siguiente = new javax.swing.JButton();
        imageFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1370, 770));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(1370, 770));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 190, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 190, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Documento");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 190, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 170, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese sus datos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 190, 30));

        textFieldNombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(textFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 270, 50));

        textFieldTelefono.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(textFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 270, 50));

        textFieldDocumento.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(textFieldDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 270, 50));

        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 120, 40));

        Siguiente.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Siguiente.setText("Siguiente");
        Siguiente.setPreferredSize(new java.awt.Dimension(72, 23));
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(Siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 670, 140, 40));

        imageFondo.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.add(imageFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Inicio in = new Inicio();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
       docUsuario = Integer.parseInt(textFieldDocumento.getText());
       if(Integer.parseInt(textFieldDocumento.getText())>=1999999999 || Integer.parseInt(textFieldDocumento.getText())<=999999999 ){
       textFieldDocumento.setText("numero invalido");
       }
              if(Long.parseLong(textFieldTelefono.getText())>=(4000000000l) || Long.parseLong(textFieldTelefono.getText())<=(2000000000l) ){
       textFieldTelefono.setText("numero invalido");
              }       
              
        for(int i=0; i<usuario.size();i++){                 
        if(docUsuario == usuario.get(i).getNumeroDocumento()){
        textFieldDocumento.setText("numero invalido");
        }
        }
        
        usuario.add(new Usuario(textFieldNombre.getText(), Long.parseLong(textFieldDocumento.getText()), Long.parseLong(textFieldTelefono.getText()), "","","",""));

        
        
        ElegirCanciones elegCan =new ElegirCanciones();
        elegCan.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_SiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Siguiente;
    private javax.swing.JLabel imageFondo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textFieldDocumento;
    private javax.swing.JTextField textFieldNombre;
    private javax.swing.JTextField textFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
