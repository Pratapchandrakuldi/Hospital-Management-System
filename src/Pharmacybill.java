///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//
///**
// *
// * @author PC
// */
//class Pharmacybill {
//
//    void setVisible(boolean b) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    
//}






import java.awt.print.PrinterException;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.table.TableModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Zainab
 */

public class Pharmacybill extends javax.swing.JFrame {
              JFrame frame;
    /**
     * Creates new form Pharmacybill
     */
    Connection conn = null;
    public Pharmacybill() {
        super("PharmacyBill");
        initComponents();
        conn = Databaseconnection.connection();
        area.setText("            ***********************************************\n");
        area.setText(area.getText()+"                  CUTM HOSPITAL PHARMACY\n");
        area.setText(area.getText()+"            ***********************************************\n");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        
        frame=new JFrame("Pharmacybill");
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buyerno = new javax.swing.JTextField();
        medid = new javax.swing.JTextField();
        buyername = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        print = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        generate = new javax.swing.JButton();
        back = new javax.swing.JButton();
        viewrecord = new javax.swing.JButton();

//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//
//        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setAlwaysOnTop(true);
        frame.setLocation(50, 50);
        frame.setSize(1200,1030);
        frame.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
         jScrollPane1.setBounds(80, 540, 950, 90);
        frame.add(jScrollPane1);

        buyerno.addActionListener(this::buyernoActionPerformed);
        buyerno.setBounds(390, 280, 260, 30);
        frame.add(buyerno);

        medid.addActionListener(this::medidActionPerformed);
         medid.setBounds(390, 360, 260, 30);
        frame.add(medid);

        buyername.addActionListener(this::buyernameActionPerformed);
         buyername.setBounds(390, 210, 260, 30);
        frame.add(buyername);

        area.setColumns(20);
        area.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        area.setRows(5);
        jScrollPane2.setViewportView(area);
         jScrollPane2.setBounds(680, 110, 370, 340);
        frame.add(jScrollPane2);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("Pic/pharmacybill.jpg"))); // NOI18N
        jLabel1.setBounds(0, -50, 1200, 900);
        frame.add(jLabel1);

        print.setText("jButton1");
        print.addActionListener(this::printActionPerformed);
        print.setBounds(570, 480, 190, 40);
        frame.add(print);

        reset.setText("jButton1");
        reset.addActionListener(this::resetActionPerformed);
         reset.setBounds(360, 480, 180, 40);
        frame.add(reset);

        generate.setText("jButton1");
        generate.addActionListener(this::generateActionPerformed);
        generate.setBounds(140, 480, 190, 40);
        frame.add(generate);

        back.setText("jButton1");
        back.addActionListener(this::backActionPerformed);
        back.setBounds(780, 650, 180, 40);
        frame.add(back);

        viewrecord.setText("jButton1");
        viewrecord.addActionListener(this::viewrecordActionPerformed);
        viewrecord.setBounds(780, 480, 190, 40);
        frame.add(viewrecord);

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
//
//        pack();
        frame.setVisible(true);
    }// </editor-fold>//GEN-END:initComponents

    private void viewrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewrecordActionPerformed
        // TODO add your handling code here:
         try{
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM pharmacybilling ";
        ResultSet rs = stmt.executeQuery(sql);
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(NumberFormatException | SQLException e){
            JOptionPane.showMessageDialog(frame,e);
        }

    }//GEN-LAST:event_viewrecordActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        frame.setVisible(false);
        Billing obj = new Billing();
        obj.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void buyernoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyernoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buyernoActionPerformed

    private void medidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medidActionPerformed

    private void buyernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buyernameActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
        try {
           area.print();
       } catch (PrinterException ex) {
            
        }
    }//GEN-LAST:event_printActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        medid.setText("");
        buyername.setText("");
        buyerno.setText("");
        
    }//GEN-LAST:event_resetActionPerformed

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        // TODO add your handling code here:
        try{
        
        
        Date obj = new Date();
        String date = obj.toString();
        area.setText(area.getText()+"\n\t"+date);
        String buyerName = buyername.getText();
        String buyerNo = buyerno.getText();
        area.setText(area.getText()+"\n\n\tName:"+buyerName);
        area.setText(area.getText()+"\n\tNumber:"+buyerNo);
       
            Statement stmt = conn.createStatement();
            int id = Integer.parseInt(medid.getText());
            String sql = "SELECT * FROM pharmacy WHERE medid = '"+id+"'";
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next())
            {
                String name = rs.getString("medname");
                int price = Integer.parseInt(rs.getString("medprice"));
                area.setText(area.getText()+"\n\n\tMedicine: "+name);
                area.setText(area.getText()+"\n\tPrice:"+price);
                String sql1 = "INSERT INTO pharmacybilling(medname, medprice, buyername,buyerno) VALUES('"+name+"','"+price+"','"+buyerName+"','"+buyerNo+"')";
                stmt.executeUpdate(sql1);
            }
            
            

        }catch(NumberFormatException | SQLException e){
            JOptionPane.showMessageDialog(frame,e);
        }
    }//GEN-LAST:event_generateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         new Pharmacybill();
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
            java.util.logging.Logger.getLogger(Pharmacybill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pharmacybill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pharmacybill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pharmacybill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton back;
    private javax.swing.JTextField buyername;
    private javax.swing.JTextField buyerno;
    private javax.swing.JButton generate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField medid;
    private javax.swing.JButton print;
    private javax.swing.JButton reset;
    private javax.swing.JButton viewrecord;
    // End of variables declaration//GEN-END:variables

    private static class DbUtils {

        private static TableModel resultSetToTableModel(ResultSet rs) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public DbUtils() {
        }
    }
}
