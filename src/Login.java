///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//
///**
// *
// * @author PC
// */
//public class Login {
//
//    public Login() {
//    }
//
//    void setVisible(boolean b) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    
//}


import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DELL
 */
@SuppressWarnings("unused")
public class Login extends javax.swing.JFrame {
          JFrame frame;
//          Connection conn = null;
    /**
     * Creates new form login
     */
    public Login() {
        initComponents();
//           conn = Databaseconnection.connection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
           frame=new JFrame(" Login Panel");
//        jPanel1 = new javax.swing.JPanel();
        password = new javax.swing.JPasswordField();
        userame = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        close_ = new javax.swing.JButton();
        login_ = new javax.swing.JButton();

//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//
//        jPanel1.setLayout(null);

         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setAlwaysOnTop(true);
        frame.setLocation(50, 50);
        frame.setSize(1120,1000);
        frame.setLayout(null);

        password.setFont(new java.awt.Font("Artifakt Element Black", 0, 18)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        password.setBounds(330, 600, 340, 60);
        frame.add(password);

        userame.setFont(new java.awt.Font("Artifakt Element Black", 0, 18)); // NOI18N
        userame.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userame.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userame.setBounds(330, 490, 340, 60);
        frame.add(userame);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("Pic/LL.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBounds(0, 0, 1100, 790);
        frame.add(jLabel1);

        close_.setBackground(new java.awt.Color(51, 102, 255));
        close_.setFont(new java.awt.Font("Artifakt Element Black", 1, 18)); // NOI18N
        close_.setForeground(new java.awt.Color(255, 255, 255));
        close_.setText("close");
         close_.addActionListener(this::close_ActionPerformed);
        close_.setBounds(570, 690, 220, 70);
        frame.add(close_);

        login_.setBackground(new java.awt.Color(0, 102, 255));
        login_.setFont(new java.awt.Font("Artifakt Element Heavy", 0, 18)); // NOI18N
        login_.setForeground(new java.awt.Color(255, 255, 255));
        login_.setText("login");
        login_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
         login_.addActionListener(this::login_ActionPerformed);
        login_.setBounds(290, 690, 210, 60);
        frame.add(login_);

//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addComponent(frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//        );
//        layout.setVerticalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addComponent(frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//        );

        pack();
//         close_.addActionListener(this);
     frame.setVisible(true);
    }// </editor-fold>//GEN-END:initComponents

    private void close_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_ActionPerformed
        // TODO add your handling code here:
        int a =JOptionPane.showConfirmDialog(frame,"Do u really want to go back","Select",JOptionPane.YES_NO_OPTION);
        if (a==0){
            frame.setVisible(false);
            new Home().setVisible(true); 
             
        }
        
    }//GEN-LAST:event_close_ActionPerformed

     private void login_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_ActionPerformed
         //admin
         if (userame.getText().equals("Pratap")&& password.getText().equals("9937")){
             frame.setVisible(false);
             new Admin().setVisible(true);
             
//             try {
//             
//         }catch(Exception e){
//             
//         }
             
         }
         
          
         //doctor
         else if(password.getText().equals("1111")&& userame.getText().equals("Chinu")){
         frame.setVisible(false);
             new Patient().setVisible(true);
         } 
         //nurse
         else if(password.getText().equals("2222")&& userame.getText().equals("Ritu")){
            frame.setVisible(false);
             new Nurseview().setVisible(true);
         } 
         //pharmacy
         else if(password.getText().equals("3333")&& userame.getText().equals("Ani")){
              frame.setVisible(false);
             new Pharmacy().setVisible(true);
         } 
         else
         {
             JOptionPane.showMessageDialog(frame, "Incorrect username or passward ;(");
         }
     }//GEN-LAST:event_login_ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
              new Login();
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
              //</editor-fold>
              /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//
//            }
//        });
              
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                 
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close_;
    private javax.swing.JLabel jLabel1;
//    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField userame;
    // End of variables declaration//GEN-END:variables
    public void setVisible() {
        
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setVisible'");
    }
}
