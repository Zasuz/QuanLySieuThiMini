/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.ManageGroup.ManageItem.ManagerPanel;

/**
 *
 * @author ACER
 */
public class NhanVienPanel extends javax.swing.JPanel {

    /**
     * Creates new form NhanVienPanel
     */
    public NhanVienPanel() {
        initComponents();
    }



    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        button10 = new GUI.SaleGroup.LoginGui.Component.Button();
        button11 = new GUI.SaleGroup.LoginGui.Component.Button();
        button12 = new GUI.SaleGroup.LoginGui.Component.Button();
        button13 = new GUI.SaleGroup.LoginGui.Component.Button();
        shape13 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        shape3 = new GUI.ManageGroup.BackgroundShape.Shape();
        jLabel91 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel82.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(42, 148, 208));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/info.png"))); // NOI18N
        jLabel82.setText("Thông tin chi tiết");
        add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1030, -1));

        jLabel83.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(42, 148, 208));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setText("Danh sách nhân viên");
        add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 300, 30));

        jTextField7.setBackground(new java.awt.Color(255, 255, 255));
        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 190, 30));

        jLabel84.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(42, 148, 208));
        jLabel84.setText("QUẢN LÝ NHÂN VIÊN");
        add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 50));

        jPanel19.setBackground(new java.awt.Color(42, 148, 208));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 10, 30));

        button10.setBackground(new java.awt.Color(118, 199, 150));
        button10.setForeground(new java.awt.Color(255, 255, 255));
        button10.setText("XUẤT EXCEL");
        button10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(button10, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 110, 30));

        button11.setBackground(new java.awt.Color(118, 199, 150));
        button11.setForeground(new java.awt.Color(255, 255, 255));
        button11.setText("+THÊM NHÂN VIÊN");
        button11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(button11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 150, 30));

        button12.setBackground(new java.awt.Color(118, 199, 150));
        button12.setForeground(new java.awt.Color(255, 255, 255));
        button12.setText("SEARCH");
        button12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(button12, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 410, 90, 30));

        button13.setBackground(new java.awt.Color(118, 199, 150));
        button13.setForeground(new java.awt.Color(255, 255, 255));
        button13.setText("NHẬP EXCEL");
        button13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(button13, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 110, 30));

        shape13.setBackground(new java.awt.Color(119, 176, 210));
        shape13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel92.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText("Mã nhân viên");
        shape13.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 220, -1));

        jLabel93.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setText("Giới tính :");
        shape13.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 110, -1));

        jLabel94.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("Địa chỉ :");
        shape13.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 120, -1));

        jLabel95.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setText("E-Mail :");
        shape13.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 120, -1));

        jLabel96.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(255, 255, 255));
        jLabel96.setText("CMND :");
        shape13.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 60, -1));

        jPanel22.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        shape13.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 156, 122, -1));

        jLabel97.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setText("Ngày tham gia :");
        shape13.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 120, -1));

        jLabel98.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setText("Ngày sinh :");
        shape13.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 80, -1));

        jLabel100.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(0, 0, 0));
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setText("CHỨC VỤ");
        shape13.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 220, -1));

        jPanel23.setBackground(new java.awt.Color(119, 176, 210));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        shape13.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 220, 3));

        shape3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel91.setBackground(new java.awt.Color(0, 0, 0));
        jLabel91.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(0, 0, 0));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("TÊN NHÂN VIÊN");

        javax.swing.GroupLayout shape3Layout = new javax.swing.GroupLayout(shape3);
        shape3.setLayout(shape3Layout);
        shape3Layout.setHorizontalGroup(
            shape3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shape3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        shape3Layout.setVerticalGroup(
            shape3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shape3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel91)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        shape13.add(shape3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 220, 200));

        add(shape13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 960, 240));

        jTable1.setBackground(new java.awt.Color(119, 176, 210));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Chức vụ", "SĐT", "Số đơn đã bán", "Tổng tiền thu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 960, 270));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.SaleGroup.LoginGui.Component.Button button10;
    private GUI.SaleGroup.LoginGui.Component.Button button11;
    private GUI.SaleGroup.LoginGui.Component.Button button12;
    private GUI.SaleGroup.LoginGui.Component.Button button13;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField7;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape13;
    private GUI.ManageGroup.BackgroundShape.Shape shape3;
    // End of variables declaration//GEN-END:variables
}
