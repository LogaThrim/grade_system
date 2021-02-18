/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade_workshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author ADMIN
 */
public class Main_gui extends javax.swing.JFrame {
    
    private int total_credit;
    private double total_score;
    
    private int total_credit_e;
    private double total_score_e;
    /**
     * Creates new form Main_gui
     */
    public Main_gui() {
        total_credit = 0;
        total_score = 0;
        
        total_credit_e = 0;
        total_score_e = 0;
        initComponents();
        Show_Subject();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_Display_Subject = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        t_term = new javax.swing.JTextField();
        t_sec = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t_subject_id = new javax.swing.JTextField();
        t_subject_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        t_credit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        b_update = new javax.swing.JButton();
        b_insert = new javax.swing.JButton();
        b_delete = new javax.swing.JButton();
        t_subject_group = new javax.swing.JComboBox<>();
        t_grade = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        r_credit = new javax.swing.JTextField();
        r_avg_all = new javax.swing.JTextField();
        r_avg = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jTable1.setFont(new java.awt.Font("CordiaUPC", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ภาคเรียน", "SEC", "รหัสวิชา", "ชื่อวิชา", "หน่วยกิต", "เกรด", "กลุ่มวิชา"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("CordiaUPC", 0, 10)); // NOI18N

        jTable_Display_Subject.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Term", "SEC", "S_ID", "S_Name", "Credit", "Grade", "S_Group"
            }
        ));
        jTable_Display_Subject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_SubjectMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_Display_Subject);
        if (jTable_Display_Subject.getColumnModel().getColumnCount() > 0) {
            jTable_Display_Subject.getColumnModel().getColumn(1).setMinWidth(30);
            jTable_Display_Subject.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTable_Display_Subject.getColumnModel().getColumn(2).setMinWidth(70);
            jTable_Display_Subject.getColumnModel().getColumn(2).setPreferredWidth(70);
            jTable_Display_Subject.getColumnModel().getColumn(3).setMinWidth(200);
            jTable_Display_Subject.getColumnModel().getColumn(3).setPreferredWidth(200);
            jTable_Display_Subject.getColumnModel().getColumn(6).setMinWidth(80);
            jTable_Display_Subject.getColumnModel().getColumn(6).setPreferredWidth(80);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ภาคเรียน :");

        t_term.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        t_sec.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("SEC :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("รหัสวิชา :");

        t_subject_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        t_subject_name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("ชื่อวิชา :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("หน่วยกิต :");

        t_credit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("เกรด :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("กลุ่มวิชา :");

        b_update.setText("Update");
        b_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_updateActionPerformed(evt);
            }
        });

        b_insert.setText("Insert");
        b_insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_insertMouseClicked(evt);
            }
        });
        b_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_insertActionPerformed(evt);
            }
        });

        b_delete.setText("Delete");
        b_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_deleteActionPerformed(evt);
            }
        });

        t_subject_group.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "e Main", "q Math", "d Science", "a Language", "d Social" }));
        t_subject_group.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_subject_groupActionPerformed(evt);
            }
        });

        t_grade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B+", "B", "C+", "C", "D+", "D", "F" }));
        t_grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_gradeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("รวมหน่วยกิต");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("ค่าคะแนนเฉลี่ย");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("ค่าคะแนนเฉลี่ยวิชาเอก");

        r_credit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        r_avg_all.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        r_avg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(b_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b_update, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(t_sec, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(t_term, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(t_subject_id, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(t_subject_name, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(t_credit, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(t_subject_group, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t_grade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(422, 422, 422)
                .addComponent(jLabel8)
                .addGap(10, 10, 10)
                .addComponent(r_credit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(r_avg_all, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(r_avg, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(t_term, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t_sec, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(t_subject_id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t_subject_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(t_credit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(t_grade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(t_subject_group, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_update, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(r_credit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r_avg_all, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r_avg, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_insertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_insertMouseClicked
        Connection dbcon = getConnection();
        
    }//GEN-LAST:event_b_insertMouseClicked

    private void jTable_Display_SubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_SubjectMouseClicked
        int i = jTable_Display_Subject.getSelectedRow();
        TableModel model = jTable_Display_Subject.getModel();
        t_term.setText(model.getValueAt(i, 0).toString());
        t_sec.setText(model.getValueAt(i, 1).toString());
        t_subject_id.setText(model.getValueAt(i, 2).toString());
        t_subject_name.setText(model.getValueAt(i, 3).toString());
        t_credit.setText(model.getValueAt(i, 4).toString());
        t_grade.setSelectedItem(model.getValueAt(i, 5).toString());
        t_subject_group.setSelectedItem(model.getValueAt(i, 6).toString());
    }//GEN-LAST:event_jTable_Display_SubjectMouseClicked

    private void b_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_insertActionPerformed
        String sql = "INSERT INTO grade_props (term, sec, subject_id, subject_name, credit, grade, subject_group) "
                + "VALUES ('"+t_term.getText()+"', '"+t_sec.getText()+"', '"+t_subject_id.getText()+"', '"+t_subject_name.getText()+"',"
                + "'"+t_credit.getText()+"', '"+t_grade.getSelectedItem().toString()+"', '"+t_subject_group.getSelectedItem().toString()+"' )";
        
        executeSQLQuery(sql, "Inserted");
    }//GEN-LAST:event_b_insertActionPerformed

    private void t_subject_groupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_subject_groupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_subject_groupActionPerformed

    private void t_gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_gradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_gradeActionPerformed

    private void b_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_updateActionPerformed
        String sql = "UPDATE grade_props SET sec = '"+t_sec.getText()+"', subject_name = '"+t_subject_name.getText()+"', "
                + "credit = '"+t_credit.getText()+"', grade = '"+t_grade.getSelectedItem().toString()+"', "
                + "subject_group = '"+t_subject_group.getSelectedItem().toString()+"' WHERE subject_id = '"+t_subject_id.getText()+"' ";
        
        executeSQLQuery(sql, "Updated");
    }//GEN-LAST:event_b_updateActionPerformed

    private void b_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_deleteActionPerformed
        String sql = "DELETE FROM grade_props WHERE subject_id = '"+t_subject_id.getText()+"' ";
        
        executeSQLQuery(sql, "Deleted");        // TODO add your handling code here:
    }//GEN-LAST:event_b_deleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        r_credit.setText(total_credit + "");
        r_avg_all.setText(String.format("%.2f", total_score/total_credit));
        r_avg.setText(String.format("%.2f", total_score_e/total_credit_e));
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Main_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_gui().setVisible(true);
            }
        });
    }
    
    public Connection getConnection(){
        Connection dbcon;
        ResultSet query;
        
        try{
            dbcon = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/grade", "root", "godframedark8654");
            
            return dbcon;
        } catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    public ArrayList<Subject> getGradeList(){
        ArrayList<Subject> usersList = new ArrayList<Subject>();
        Connection dbcon = getConnection();
        
        Statement st;
        ResultSet rs;
        String sql = "SELECT * FROM grade_props";
        try{
            st = dbcon.createStatement();
            rs = st.executeQuery(sql);
            Subject subject;
            
            while(rs.next()){
                total_score += Integer.parseInt(rs.getString("credit").substring(0, 1)) * getGrade(rs.getString("grade"));
                total_credit += Integer.parseInt(rs.getString("credit").substring(0, 1));
                
                if(rs.getString("subject_group").substring(0, 1).equals("e")){
                    total_credit_e += Integer.parseInt(rs.getString("credit").substring(0, 1));
                    total_score_e += Integer.parseInt(rs.getString("credit").substring(0, 1)) * getGrade(rs.getString("grade"));
                }
                subject = new Subject(rs.getString("term"), rs.getString("sec"), rs.getString("subject_id"), rs.getString("subject_name"), rs.getString("credit"), rs.getString("grade"), rs.getString("subject_group"));
                usersList.add(subject);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return usersList;
    }
    
    public void Show_Subject(){
        ArrayList<Subject> list = getGradeList();
        DefaultTableModel model = (DefaultTableModel)jTable_Display_Subject.getModel();
        Object[] row = new Object[7];
        for(int i=0;i<list.size();++i){
            row[0] = list.get(i).getTerm();
            row[1] = list.get(i).getSec();
            row[2] = list.get(i).getSubjectId();
            row[3] = list.get(i).getSubjectName();
            row[4] = list.get(i).getCredit();
            row[5] = list.get(i).getGrade();
            row[6] = list.get(i).getSubjectGroup();
            
            model.addRow(row);
        }
    }
    
    public void executeSQLQuery(String query, String message){
        Connection dbcon = getConnection();
        Statement st;
        try{
            st = dbcon.createStatement();
            if(st.executeUpdate(query) == 1){
                DefaultTableModel model = (DefaultTableModel) jTable_Display_Subject.getModel();
                
                total_credit = 0;
                total_credit_e = 0;
                total_score = 0;
                total_score_e = 0;
                model.setRowCount(0);
                Show_Subject();
                
                JOptionPane.showMessageDialog(null, "Data " + message + " Succefuly");
            } else{
                JOptionPane.showMessageDialog(null, "Data Not " + message);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private double getGrade(String grade){
        if(grade.toLowerCase().equals("a")) return 4.0;
        else if(grade.toLowerCase().equals("b+"))  return 3.5;
        else if(grade.toLowerCase().equals("b"))  return 3.0;
        else if(grade.toLowerCase().equals("c+"))  return 2.5;
        else if(grade.toLowerCase().equals("c"))  return 2.0;
        else if(grade.toLowerCase().equals("d+"))  return 1.5;
        else if(grade.toLowerCase().equals("d"))  return 1.0;
        else if(grade.toLowerCase().equals("f"))  return 0.0;
        else return -1.0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_delete;
    private javax.swing.JButton b_insert;
    private javax.swing.JButton b_update;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable_Display_Subject;
    private javax.swing.JTextField r_avg;
    private javax.swing.JTextField r_avg_all;
    private javax.swing.JTextField r_credit;
    private javax.swing.JTextField t_credit;
    private javax.swing.JComboBox<String> t_grade;
    private javax.swing.JTextField t_sec;
    private javax.swing.JComboBox<String> t_subject_group;
    private javax.swing.JTextField t_subject_id;
    private javax.swing.JTextField t_subject_name;
    private javax.swing.JTextField t_term;
    // End of variables declaration//GEN-END:variables
}
