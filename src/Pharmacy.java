
import javax.swing.JFrame;



/**
 *
 * @author Zainab
 */

public class Pharmacy extends javax.swing.JFrame {
       JFrame frame;
    /**
     * Creates new form pharmacy
     */
  
    public Pharmacy() {
       initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

         frame=new JFrame("Pharmacy");
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        record = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//
//        jPanel1.setLayout(null);


         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setAlwaysOnTop(true);
        frame.setLocation(50, 50);
        frame.setSize(1250,1000);
        frame.setLayout(null);
        
        

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("Pic/pharmacy.gif"))); // NOI18N
        jLabel1.setBounds(0, -55, 1200, 900);
        frame.add(jLabel1);

        add.setText("add");
        add.addActionListener(this::addActionPerformed);
         add.setBounds(120, 520, 220, 40);
        frame.add(add);

        record.setText("records");
        record.addActionListener(this::recordActionPerformed);
          record.setBounds(800, 520, 210, 40);
        frame.add(record);

        update.setText("jButton1");
        update.addActionListener(this::updateActionPerformed);
        update.setBounds(450, 680, 220, 40);
        frame.add(update);

        jMenu1.setText("Home");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("Pic/logout.png"))); // NOI18N
        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(this::jMenuItem1ActionPerformed);
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        frame.setJMenuBar(jMenuBar1);

//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//        );
//        layout.setVerticalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//        );

        pack();
         frame.setVisible(true);
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        frame.setVisible(false);
        Addmed obj = new Addmed();
        obj.setVisible(true);
    }//GEN-LAST:event_addActionPerformed

    private void recordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordActionPerformed
        // TODO add your handling code here:
        frame.setVisible(false);
        Available obj = new Available();
        obj.setVisible(true);
    }//GEN-LAST:event_recordActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        frame.setVisible(false);
        Updatemed obj = new Updatemed();
        obj.setVisible(true);
    }//GEN-LAST:event_updateActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         //TODO add your handling code here:
                frame.setVisible(false);
                Home obj = new Home();
                obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new Pharmacy();
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
            java.util.logging.Logger.getLogger(Pharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                 
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton record;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
