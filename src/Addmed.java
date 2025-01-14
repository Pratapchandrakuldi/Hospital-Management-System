





import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Zainab
 */
public class Addmed extends javax.swing.JFrame {
                  JFrame frame;
    /**
     * Creates new form Addmed
     */
    Connection conn = null;
    public Addmed() {
        super("AddMed");
        initComponents();
        conn = Databaseconnection.connection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

         frame=new JFrame("Addmed");
        jPanel1 = new javax.swing.JPanel();
        medexpdate = new javax.swing.JTextField();
        medid = new javax.swing.JTextField();
        medname = new javax.swing.JTextField();
        medprice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        medquantity = new javax.swing.JTextField();
        medmfgdate = new javax.swing.JTextField();
        JLabel1 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        back = new javax.swing.JButton();

//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//
//        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());


         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setAlwaysOnTop(true);
        frame.setLocation(50, 50);
        frame.setSize(1200,1030);
        frame.setLayout(null);
           
        
        medexpdate.setBounds(390, 570, 260, 30);
        frame.add(medexpdate);

        medid.addActionListener(this::medidActionPerformed);
        medid.setBounds(390, 130, 260, 30);
        frame.add(medid);

        medname.addActionListener(this::mednameActionPerformed);
        medname.setBounds(390, 220, 260, 30);
        frame.add(medname);
        medprice.setBounds(390, 300, 260, 30);
        frame.add(medprice);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(":");
         jLabel2.setBounds(230, 390, 10, 30);
        frame.add(jLabel2);
         medquantity.setBounds(390, 390, 260, 30);
        frame.add(medquantity);
         medmfgdate.setBounds(390, 480, 260, 30);
        frame.add(medmfgdate);

        JLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("Pic/addmed.jpg"))); // NOI18N
        JLabel1.setBounds(0, -53, 1200, 900);
        frame.add(JLabel1);

        add.setText("jButton1");
        add.addActionListener(this::addActionPerformed);
         add.setBounds(320, 650, 180, 40);
        frame.add(add);

        back.setText("jButton1");
        back.addActionListener(this::backActionPerformed);
        back.setBounds(540, 650, 180, 40);
        frame.add(back);

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

    private void medidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medidActionPerformed

    private void mednameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mednameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mednameActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
          try{
            Statement stmt = conn.createStatement();
    
            
            int id = Integer.parseInt(medid.getText());
            String name = medname.getText();
            int price = Integer.parseInt(medprice.getText());
            int quantity = Integer.parseInt(medquantity.getText());
            String mfgdate = medmfgdate.getText();
            String expdate = medexpdate.getText();
            
            
            // insert the data into pharmacy
            String sql = "INSERT INTO pharmacy(medid,medname,medprice, medquantity, medmfgdate,medexpdate) VALUES('"+id+"','"+name+"','"+price+"','"+quantity+"','"+mfgdate+"','"+expdate+"')";
            stmt.executeUpdate(sql);
            String sql1 = "INSERT INTO pharmacybilling(medid) VALUES('"+id+"')";
            stmt.executeUpdate(sql1);
            
      
            JOptionPane.showMessageDialog(frame,"Data is sucessfully inserted.");
            medid.setText("");
            medname.setText("");
            medprice.setText("");
            medquantity.setText("");
            medmfgdate.setText("");
            medexpdate.setText("");
              
        }catch(NumberFormatException | SQLException e){
            JOptionPane.showMessageDialog(frame,e);
        }
    }//GEN-LAST:event_addActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Pharmacy obj = new Pharmacy();
        obj.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new Addmed();
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
            java.util.logging.Logger.getLogger(Addmed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addmed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addmed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addmed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel JLabel1;
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField medexpdate;
    private javax.swing.JTextField medid;
    private javax.swing.JTextField medmfgdate;
    private javax.swing.JTextField medname;
    private javax.swing.JTextField medprice;
    private javax.swing.JTextField medquantity;
    // End of variables declaration//GEN-END:variables
}