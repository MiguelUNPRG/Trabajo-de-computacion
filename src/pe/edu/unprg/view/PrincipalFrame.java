/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pe.edu.unprg.view;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

/**
 *
 * @author asus
 */
public class PrincipalFrame extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalFrame
     */
    public PrincipalFrame() {
        initComponents();
        //para que ocupe todo el maximo de la pantalla
        this.setExtendedState(MAXIMIZED_BOTH);
        
        
        
    }

    //para el icono 
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("pe/edu/unprg/images/LOGO_3.png"));
        return retValue;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_compra1 = new javax.swing.JButton();
        txt_cliente1 = new javax.swing.JButton();
        txt_pedido = new javax.swing.JButton();
        txt_compra2 = new javax.swing.JButton();
        txt_cliente2 = new javax.swing.JButton();
        txt_pedido1 = new javax.swing.JButton();
        txt_producto2 = new javax.swing.JButton();
        txt_producto1 = new javax.swing.JButton();
        txt_proveedor1 = new javax.swing.JButton();
        txt_proveedor2 = new javax.swing.JButton();
        VentanaPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_compra1.setBackground(new java.awt.Color(204, 255, 255));
        txt_compra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/edu/unprg/images/compra.png"))); // NOI18N
        txt_compra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_compra1ActionPerformed(evt);
            }
        });
        getContentPane().add(txt_compra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 100, 100));

        txt_cliente1.setBackground(new java.awt.Color(204, 255, 255));
        txt_cliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/edu/unprg/images/cliente.png"))); // NOI18N
        txt_cliente1.setText("CLIENTE");
        txt_cliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cliente1ActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 100, 100));

        txt_pedido.setBackground(new java.awt.Color(204, 255, 255));
        txt_pedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/edu/unprg/images/pedido.png"))); // NOI18N
        txt_pedido.setText("PEDIDO");
        txt_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pedidoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 100, 100));

        txt_compra2.setText("COMPRAR");
        txt_compra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_compra2ActionPerformed(evt);
            }
        });
        getContentPane().add(txt_compra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        txt_cliente2.setText("CLIENTE");
        txt_cliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cliente2ActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        txt_pedido1.setText("PEDIDO");
        txt_pedido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pedido1ActionPerformed(evt);
            }
        });
        getContentPane().add(txt_pedido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, -1, -1));

        txt_producto2.setText("PRODUCTO");
        txt_producto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_producto2ActionPerformed(evt);
            }
        });
        getContentPane().add(txt_producto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 760, -1, -1));

        txt_producto1.setBackground(new java.awt.Color(204, 255, 255));
        txt_producto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/edu/unprg/images/producto.png"))); // NOI18N
        txt_producto1.setText("PRODUCTO");
        txt_producto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_producto1ActionPerformed(evt);
            }
        });
        getContentPane().add(txt_producto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, 100, 100));

        txt_proveedor1.setBackground(new java.awt.Color(204, 255, 255));
        txt_proveedor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/edu/unprg/images/proveedor.png"))); // NOI18N
        txt_proveedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_proveedor1ActionPerformed(evt);
            }
        });
        getContentPane().add(txt_proveedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 850, 100, 100));

        txt_proveedor2.setText("PROVEEDOR");
        txt_proveedor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_proveedor2ActionPerformed(evt);
            }
        });
        getContentPane().add(txt_proveedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 960, -1, -1));

        VentanaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/edu/unprg/images/fondo10.jpg"))); // NOI18N
        getContentPane().add(VentanaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 204));
        jMenuBar1.setBorder(null);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(311, 30));

        jMenu1.setText("INICIO");

        jMenuItem2.setText("SALIR");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("COMPRAS");

        jMenuItem6.setText("COMPRA");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("MANTENIMIENTOS");

        jMenuItem1.setText("CLIENTES");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem3.setText("PEDIDO");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem4.setText("PRODUCTO");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem5.setText("PROVEEDOR");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("REPORTES");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       //generar cuando se le de el click para proveedor
       ProveedorF proveedor = new ProveedorF();
       CentrarVentana(proveedor);
       
       
       
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //generar cuando se le de el click para cliente
        ClienteFrame cliente = new ClienteFrame();
        CentrarVentana(cliente);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //generar cuando se le de el click para pedido
        PedidoFrame pedido = new PedidoFrame();
        CentrarVentana(pedido);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        //generar cuando se le de el click para producto
        ProductoFrame producto = new ProductoFrame();
        CentrarVentana(producto);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        //generar cuando se le de el click para compra
        CompraFrame compra = new CompraFrame();
        CentrarVentana(compra);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void txt_compra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_compra1ActionPerformed
        // para compra en imagen
        CompraFrame compra = new CompraFrame();
        CentrarVentana(compra);
    }//GEN-LAST:event_txt_compra1ActionPerformed

    private void txt_cliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cliente1ActionPerformed
        //Cliente pero en imagen 
        ClienteFrame cliente = new ClienteFrame();
        CentrarVentana(cliente);
    }//GEN-LAST:event_txt_cliente1ActionPerformed

    private void txt_compra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_compra2ActionPerformed
        // para compra en boton
        CompraFrame compra = new CompraFrame();
        CentrarVentana(compra);
    }//GEN-LAST:event_txt_compra2ActionPerformed

    private void txt_cliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cliente2ActionPerformed
        // cliente en boton 
        ClienteFrame cliente = new ClienteFrame();
        CentrarVentana(cliente);
    }//GEN-LAST:event_txt_cliente2ActionPerformed

    private void txt_proveedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_proveedor1ActionPerformed
        // para proveedor en imagen
        ProveedorF proveedor = new ProveedorF();
        CentrarVentana(proveedor);
    }//GEN-LAST:event_txt_proveedor1ActionPerformed

    private void txt_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pedidoActionPerformed
        // para pedido en imagen
        PedidoFrame pedido = new PedidoFrame();
        CentrarVentana(pedido);
    }//GEN-LAST:event_txt_pedidoActionPerformed

    private void txt_pedido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pedido1ActionPerformed
        //para pedido en boton
        PedidoFrame pedido = new PedidoFrame();
        CentrarVentana(pedido);
    }//GEN-LAST:event_txt_pedido1ActionPerformed

    private void txt_producto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_producto1ActionPerformed
        //para producto en imagen
        ProductoFrame producto = new ProductoFrame();
        CentrarVentana(producto);
    }//GEN-LAST:event_txt_producto1ActionPerformed

    private void txt_producto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_producto2ActionPerformed
        // para producto en boton
        ProductoFrame producto = new ProductoFrame();
        CentrarVentana(producto);
    }//GEN-LAST:event_txt_producto2ActionPerformed

    private void txt_proveedor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_proveedor2ActionPerformed
        // para proveedor en boton
        ProveedorF proveedor = new ProveedorF();
        CentrarVentana(proveedor);
    }//GEN-LAST:event_txt_proveedor2ActionPerformed

    //GENERAR UN METODO PARA QUE APARESCA LA VENTANA 
    
    public void CentrarVentana(JInternalFrame frame){
        VentanaPrincipal.add(frame);
        
        Dimension dimension = VentanaPrincipal.getSize();
        Dimension dimensionIF = frame.getSize();
        frame.setLocation((dimension.width - dimensionIF.height)/2, (dimension.height - dimensionIF.width)/2);         
        frame.show();
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
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel VentanaPrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JButton txt_cliente1;
    private javax.swing.JButton txt_cliente2;
    private javax.swing.JButton txt_compra1;
    private javax.swing.JButton txt_compra2;
    private javax.swing.JButton txt_pedido;
    private javax.swing.JButton txt_pedido1;
    private javax.swing.JButton txt_producto1;
    private javax.swing.JButton txt_producto2;
    private javax.swing.JButton txt_proveedor1;
    private javax.swing.JButton txt_proveedor2;
    // End of variables declaration//GEN-END:variables
}