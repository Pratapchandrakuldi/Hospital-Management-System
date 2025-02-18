




import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;



/**
 *
 * @author Zainab
 */
public class Nurseview extends javax.swing.JFrame {
        JFrame frame;
    /**
     * Creates new form Nurseview
     */
    Connection conn = null;
//    private Object DbUtils;
    public Nurseview() {
        super("NurseView");
        initComponents();
        conn = Databaseconnection.connection();
        showRecord();
    }
    public final void showRecord(){
        try{
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM p";   //write whatever ur table name is
        ResultSet rs = stmt.executeQuery(sql);
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(NumberFormatException | SQLException e){
            JOptionPane.showMessageDialog(frame,e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frame=new JFrame("Nurseview");
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        search = new javax.swing.JButton();
        returnrecords = new javax.swing.JButton();
        patientid = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        jlabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        logout = new javax.swing.JMenuItem();

//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//
//        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setAlwaysOnTop(true);
        frame.setLocation(50, 50);
        frame.setSize(1250,1000);
        frame.setLayout(null);


        jTable1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
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
        jScrollPane1.setBounds(70, 190, 980, 440);
        frame.add(jScrollPane1);

        search.setBackground(new java.awt.Color(10, 153, 153));
        search.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("SEARCH");
        search.addActionListener(this::searchActionPerformed);
        search.setBounds(680, 130, 150, 30);
        frame.add(search);

        returnrecords.setBackground(new java.awt.Color(10, 153, 153));
        returnrecords.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        returnrecords.setForeground(new java.awt.Color(255, 255, 255));
        returnrecords.setText("BACK");
        returnrecords.addActionListener(this::returnrecordsActionPerformed);
        returnrecords.setBounds(840, 130, 150, 30);
        frame.add(returnrecords);

        patientid.addActionListener(this::patientidActionPerformed);
        patientid.setBounds(480, 130, 130, 30);
        frame.add(patientid);

        back.setBackground(new java.awt.Color(0, 102, 102));
        back.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("Pic/backpt2.png"))); // NOI18N
        back.setText("BACK");
        back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 60, 153), 0));
        back.addActionListener(this::backActionPerformed);
        back.setBounds(480, 640, 240, 70);
        frame.add(back);

        jlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("Pic/nurseview.png"))); // NOI18N
        jlabel.setBounds(0, -50, 1200, 900);
        frame.add(jlabel);

        jMenu1.setText("Logout");

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("Pic/logout.png"))); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(this::logoutActionPerformed);
        jMenu1.add(logout);

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

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "SELECT * FROM p ";  //write whatever ur table name is
            PreparedStatement pstmt = conn.prepareCall(sql);
            ResultSet rs = pstmt.executeQuery();
            DefaultTableModel tm= (DefaultTableModel) jTable1.getModel();
            tm.setRowCount(0);
            while(rs.next())
            {
                if(patientid.getText().equals(rs.getString("id"))){  //chane to patient id name in ur table
                    Object o[] = {rs.getString("id"),rs.getString("name"),rs.getString("f_name"),rs.getString("address"),rs.getString("contact"),rs.getString("age"),rs.getString("gender"),rs.getString("days"),rs.getString("blood"),rs.getString("instructions"),rs.getString("room"),rs.getString("cost")};
                    tm.addRow(o);    
                }
                else if(patientid.getText().equals(rs.getString("name"))){
                   Object o[] = {rs.getString("id"),rs.getString("name"),rs.getString("f_name"),rs.getString("address"),rs.getString("contact"),rs.getString("age"),rs.getString("gender"),rs.getString("days"),rs.getString("blood"),rs.getString("instructions"),rs.getString("room"),rs.getString("cost")};
                    tm.addRow(o);
                }
            }

        }
        catch(NumberFormatException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }

    }//GEN-LAST:event_searchActionPerformed

    private void returnrecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnrecordsActionPerformed
        // TODO add your handling code here:
        patientid.setText("");
        showRecord();
    }//GEN-LAST:event_returnrecordsActionPerformed

    private void patientidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientidActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Login obj = new Login();
        obj.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Home obj = new Home();
        obj.setVisible(true);
        

    }//GEN-LAST:event_backActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new Nurseview();
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
            java.util.logging.Logger.getLogger(Nurseview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nurseview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nurseview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nurseview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton back;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlabel;
    private javax.swing.JMenuItem logout;
    private javax.swing.JTextField patientid;
    private javax.swing.JButton returnrecords;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables

    private static class DbUtils {

        private static TableModel resultSetToTableModel(ResultSet rs) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public DbUtils() {
        }
    }
}
