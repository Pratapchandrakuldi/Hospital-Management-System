///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//
///**
// *
// * @author PC
// */
//class AddDoctor {
//    
//}




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


 
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

/**
 *
 * @author HP
 */
public class AddDoctor extends javax.swing.JFrame {
         JFrame frame2;
    /**
     * Creates new form AddDoctor
     */
     Connection conn = null;
    public AddDoctor() {
        super("AddDoctor");
        initComponents();
        conn = Databaseconnection.connection();
    }
    
        public void reset(){
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
            jTextField9.setText("");
            jTextField10.setText("");       
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

         frame2=new JFrame("Doctor Module");
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setAlwaysOnTop(true);
        frame2.setLocation(50, 50);
        frame2.setSize(1250,1000);

//             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setAlwaysOnTop(true);
//        setLocation(50, 50);
//        setSize(1250,1000);
//         setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
         
        frame2.setLayout(null);
        jPanel1.setLayout(new FlowLayout(FlowLayout.CENTER,500,800));
        frame2.add(jPanel1);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("Pic/add.png"))); // NOI18N
        jButton1.setText("ADD");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 60, 153), 0));
        jButton1.addActionListener(this::jButton1ActionPerformed);
        jButton1.setBounds(260, 600, 240, 60);
        frame2.add(jButton1);

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("Pic/backpt2.png"))); // NOI18N
        jButton2.setText("BACK");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 60, 153), 0));
        jButton2.addActionListener(this::jButton2ActionPerformed);
         jButton2.setBounds(530, 590, 240, 70);
        frame2.add(jButton2);
        jTextField1.setBounds(290, 120, 180, 30); 
        frame2.add(jTextField1);
        jTextField2.setBounds(290, 160, 180, 30);
        frame2.add(jTextField2);
        jTextField3.setBounds(290, 210, 180, 30);
        frame2.add(jTextField3);
        jTextField5.setBounds(290, 310, 180, 30);
        frame2.add(jTextField5);
        jTextField6.setBounds(290, 360, 180, 30);
        frame2.add(jTextField6);
        jTextField8.setBounds(290, 460, 180, 30);
        frame2.add(jTextField8);
        jTextField9.setBounds(300, 510, 170, 30);
        frame2.add(jTextField9);
         jTextField10.setBounds(500, 390, 330, 150);
        frame2.add(jTextField10);
        jTextField4.setBounds(290, 260, 180, 30);
        frame2.add(jTextField4);
        jTextField7.setBounds(290, 410, 180, 30);
        frame2.add(jTextField7);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("Pic/ADDDOC (2).gif"))); // NOI18N
         jLabel1.setBounds(560, 90, 320, 260);
        frame2.add(jLabel1);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("Pic/ADDDOC.jpg"))); // NOI18N
         jLabel3.setBounds(0, 0, 1000, 710);
        frame2.add(jLabel3);

//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addGap(0, 0, Short.MAX_VALUE))
//        );
//        layout.setVerticalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addGap(0, 0, Short.MAX_VALUE))
//        );

        pack();
//         setVisible(false);
         frame2.setVisible(true);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                try{
//                Class.forName("com.mysql.cj.jdbc.Driver");
           String sql= "insert into doctor values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ptst=conn.prepareCall(sql);
                if (jTextField1.getText().equals("")) {
                JOptionPane.showMessageDialog( frame2, "Please enter doctor id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (jTextField2.getText().equals("")) {
                JOptionPane.showMessageDialog( frame2, "Please enter doctor's full name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (jTextField3.getText().equals("")) {
                JOptionPane.showMessageDialog( frame2, "Please enter Doctor's Email ID","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (jTextField4.getText().equals("")) {
                JOptionPane.showMessageDialog( frame2, "Please enter Contact no","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           if (jTextField5.getText().equals("")) {
                JOptionPane.showMessageDialog( frame2, "Please enter Address","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         
            if (jTextField6.getText().equals("")) {
                JOptionPane.showMessageDialog( frame2, "Please enter qualifications","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
              if (jTextField7.getText().equals("")) {
                JOptionPane.showMessageDialog( frame2, "Please select gender","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (jTextField8.getText().equals("")) {
                JOptionPane.showMessageDialog( frame2, "Please select blood group","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           
            if (jTextField9.getText().equals("")) {
                JOptionPane.showMessageDialog( frame2, "Please enter joining date","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
                     if (jTextField10.getText().equals("")) {
                JOptionPane.showMessageDialog( frame2, "Please enter available slots","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
                     else{
              
            ptst.setString(1,jTextField1.getText());
            ptst.setString(2,jTextField2.getText());
            ptst.setString(3,jTextField3.getText());
            ptst.setString(4,jTextField4.getText());
            ptst.setString(5,jTextField5.getText());
            ptst.setString(6,jTextField6.getText());
            ptst.setString(7,jTextField7.getText());
            ptst.setString(8,jTextField8.getText());
            ptst.setString(9,jTextField9.getText());
            ptst.setString(10,jTextField10.getText());  
            ptst.executeUpdate();
            JOptionPane.showMessageDialog(frame2,"Data Added Successfully");
            reset();
                     }
            
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(frame2, e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        DoctorModule obj = new DoctorModule();
        obj.setVisible(true);
        dispose();
      
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         new AddDoctor();
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
       
        
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddDoctor().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

//         @Override
//    public void setVisible(boolean b) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from 
//    }
}
