/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mycompany.proyecto.interfaz;



import java.awt.Image;
import mycompany.proyecto.Boleta;
import mycompany.proyecto.Cancion;
import static mycompany.proyecto.NewClass.artistas;
import static mycompany.proyecto.NewClass.boleta;
import static mycompany.proyecto.NewClass.canciones;
import static mycompany.proyecto.NewClass.usuario;
import mycompany.proyecto.Usuario;
import static mycompany.proyecto.interfaz.Registrar.docUsuario;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;




public class ElegirCanciones extends javax.swing.JFrame {

    public ElegirCanciones() {



        initComponents();
         ImageIcon image =new ImageIcon(getClass().getResource("/imagenes/fondo.jpeg"));
 Icon icon = new ImageIcon(
         image.getImage().getScaledInstance(imageFondo.getWidth(), imageFondo.getHeight(), Image.SCALE_DEFAULT)
 );
 imageFondo.setIcon(icon);
 this.repaint();
          this.setExtendedState(ElegirCanciones.MAXIMIZED_BOTH);
    }

        int artistaIndex, cancionIndex;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        imageFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1370, 770));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(1370, 770));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Elija su artista favorito");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 240, 40));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 240, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Elija su cancion favorita");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jComboBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox2MouseClicked(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 240, 40));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton2.setText("Seleccionar cancion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 400, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, 400, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usted ha elegido:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton3.setText("Siguiente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 670, 140, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 400, 50));
        jPanel1.add(imageFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        for(int i = 0; i < artistas.size(); i++ ){
        jComboBox1.addItem(artistas.get(i).getNombre());
        
        }
        

        
    }//GEN-LAST:event_formWindowOpened

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked

    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox2MouseClicked


    }//GEN-LAST:event_jComboBox2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        
        //añadir contador
                   for(Cancion cancionesList :canciones ){
                   if(cancionesList.getTitulo().equals(jLabel1.getText())){
                   cancionesList.setContador(cancionesList.getContador()+1);
                   }
                   }
                           //añadir contador
                   for(Cancion cancionesList :canciones ){
                   if(cancionesList.getTitulo().equals(jLabel2.getText())){
                   cancionesList.setContador(cancionesList.getContador()+1);
                   }
                   }
                   //añadir contador
        for(Cancion cancionesList :canciones ){
                   if(cancionesList.getTitulo().equals(jLabel3.getText())){
                   cancionesList.setContador(cancionesList.getContador()+1);
                   }
                   }
        
        if("".equals(jLabel1.getText())){

}else{

        int num=0;
                String[] colores = {"amarillo", "rojo", "azul","naranja","morado", "verde","cafe","blanco","negro"};
         Random rand = new Random();
         int indiceAleatorioColor = rand.nextInt(colores.length);
         String colorAleatorio = colores[indiceAleatorioColor];

        
        int limiteInferior = 1;
        int limiteSuperior = boleta.size();
        int cantidadNumeros = limiteSuperior - limiteInferior + 1;

        ArrayList<Integer> numerosDisponibles1 = new ArrayList<>();
        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            numerosDisponibles1.add(i);
        }

        Random random = new Random();

        for (int i = 0; i < cantidadNumeros; i++) {
            int indiceAleatorio = random.nextInt(numerosDisponibles1.size());
            int numeroAleatorio = numerosDisponibles1.get(indiceAleatorio);
            System.out.println("Número aleatorio: " + numeroAleatorio);
num=numeroAleatorio;
            
// Elimina el número seleccionado de la lista
            numerosDisponibles1.remove(indiceAleatorio);
        }

                for(int e=0; e<usuario.size();e++){
        if(docUsuario==usuario.get(e).getNumeroDocumento()){
            boleta.add(new Boleta(colorAleatorio, num, usuario.get(e)));
        }}
            
        
for(Usuario usuario:usuario){
        if(docUsuario==usuario.getNumeroDocumento()){
        usuario.setCancion1(jLabel1.getText());
        usuario.setCancion2(jLabel2.getText());
        usuario.setCancion3(jLabel3.getText());
        }
}
        TopCanciones pantalla2 = new TopCanciones();
                      pantalla2.setVisible(true);
                      this.dispose();
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
                        artistaIndex= jComboBox1.getSelectedIndex();
                        jComboBox2.removeAllItems();
                    for(Cancion cancionesList :canciones ){
                    if(artistaIndex==cancionesList.getArtista().getId()){
                        System.out.println(artistaIndex);
                        
        jComboBox2.addItem(cancionesList.getTitulo());
        for(Usuario usuario:usuario){
        if(docUsuario==usuario.getNumeroDocumento()){
        usuario.setArtista(cancionesList.getArtista().getNombre());
            }
        }
    }
} 
                    jLabel1.setText("");
                    jLabel2.setText("");
                    jLabel3.setText("");
                    
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cancionIndex= jComboBox2.getSelectedIndex();
        if("".equals(jLabel1.getText())){
            jLabel1.setText(jComboBox2.getItemAt(cancionIndex));

        }else if("".equals(jLabel2.getText())){
            jLabel2.setText(jComboBox2.getItemAt(cancionIndex));

        }
        else if("".equals(jLabel3.getText())){
            jLabel3.setText(jComboBox2.getItemAt(cancionIndex));

            jComboBox2.removeAllItems();
        }
        jComboBox2.removeItemAt(cancionIndex);

    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageFondo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
