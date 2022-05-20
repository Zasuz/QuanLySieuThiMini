/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.ManageGroup.ComponentPanel;

import BUS.BusAccessor.NhaCungCapBUS;
import DAL.DataModels.SanPham;

/**
 *
 * @author huykh
 */
public class ProductDetailPanel extends PanelAdd {
    private SanPham sanpham;
    private static final NhaCungCapBUS nhaccBus = new NhaCungCapBUS();
//    private static final MaLoai
    
    /**
     * Creates new form ProductDetailPanel
     */
    public ProductDetailPanel() {
        initComponents();
    }

    public ProductDetailPanel(SanPham sanpham) {
        initComponents();
        this.sanpham = sanpham;
        initInfo();
    }

    public SanPham getSanpham() {
        return sanpham;
    }

    public void setSanpham(SanPham sanpham) {
        this.sanpham = sanpham;
        initInfo();
        System.out.println("Show sanpham: "+sanpham.getTenSP());
    }
    
    private void initInfo(){
        String tenNhaCC = nhaccBus.get(sanpham.getMaNCC()).getTenNCC();
        imagePanel.setImagePath(sanpham.getHinhAnh());
        lbName.setText("<html>"+sanpham.getTenSP());
        lbMaSp.setText(Integer.toString(sanpham.getMaSP()));
        lbDonGia.setText(Long.toString(sanpham.getGiaTien()));
        lbLoai.setText(sanpham.getMaLoai()+"");
        lbSoLuong.setText(sanpham.getSoLuong()+"");
        lbNhaCC.setText(tenNhaCC);
        String mota = "<html>"+sanpham.getMoTa();
        if (mota.length()>270){
            mota = "<html>" +sanpham.getMoTa().substring(0, 268);
            mota += "...";
        }
        lbMoTa.setText(mota);
        imagePanel.setToolTipText("<html> <div style='width:200px'>"+sanpham.getMoTa());
        this.revalidate();
        this.repaint();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbName = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        lbMoTa = new javax.swing.JLabel();
        lbMaSp = new javax.swing.JLabel();
        lbDonGia = new javax.swing.JLabel();
        lbLoai = new javax.swing.JLabel();
        lbSoLuong = new javax.swing.JLabel();
        lbNhaCC = new javax.swing.JLabel();
        imagePanel = new GUI.ManageGroup.ComponentPanel.ImagePanel();

        setBackground(new java.awt.Color(245, 245, 245));

        lbName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbName.setForeground(new java.awt.Color(255, 255, 255));
        lbName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbName.setText("CocaCoLa");

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Loại sản phẩm:");

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Mã sản phẩm:");

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Đơn giá:");

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Số lượng:");

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Nhà cung cấp:");

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Mô tả:");

        lbMoTa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMoTa.setForeground(new java.awt.Color(17, 86, 125));
        lbMoTa.setText("<html> Là sản phẩm nước ngọt có gas của thương hiệu Fanta nổi tiếng giúp giải khát sau khi hoạt động ngoài trời, giải tỏa căng thẳng, mệt mỏi khi học tập, làm việc. 6 lon nước ngọt Fanta hương cam lon 330ml thơm ngon kích thích vị giác, chứa nhiều vitamin C sẽ cung cấp năng lượng cho cơ thể khỏe mạnh.");
        lbMoTa.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lbMaSp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbMaSp.setForeground(new java.awt.Color(17, 86, 125));
        lbMaSp.setText("1");

        lbDonGia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbDonGia.setForeground(new java.awt.Color(17, 86, 125));
        lbDonGia.setText("10.000");

        lbLoai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbLoai.setForeground(new java.awt.Color(17, 86, 125));
        lbLoai.setText("Nuoc ngot");

        lbSoLuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbSoLuong.setForeground(new java.awt.Color(17, 86, 125));
        lbSoLuong.setText("10");

        lbNhaCC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNhaCC.setForeground(new java.awt.Color(17, 86, 125));
        lbNhaCC.setText("PEPSI INC");

        imagePanel.setBackground(new java.awt.Color(255, 255, 255));
        imagePanel.setImage(new javax.swing.ImageIcon(getClass().getResource("/Assets/Image/7up.png"))); // NOI18N

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 157, Short.MAX_VALUE)
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel55)
                                .addGap(12, 12, 12)
                                .addComponent(lbMaSp)
                                .addGap(65, 65, 65)
                                .addComponent(jLabel54)
                                .addGap(8, 8, 8)
                                .addComponent(lbLoai)
                                .addGap(78, 78, 78)
                                .addComponent(jLabel57)
                                .addGap(15, 15, 15)
                                .addComponent(lbSoLuong))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel56)
                                .addGap(12, 12, 12)
                                .addComponent(lbDonGia)
                                .addGap(67, 67, 67)
                                .addComponent(jLabel58)
                                .addGap(12, 12, 12)
                                .addComponent(lbNhaCC))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel59)
                                .addGap(16, 16, 16)
                                .addComponent(lbMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbName)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55)
                            .addComponent(lbMaSp)
                            .addComponent(jLabel54)
                            .addComponent(lbLoai)
                            .addComponent(jLabel57)
                            .addComponent(lbSoLuong))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56)
                            .addComponent(lbDonGia)
                            .addComponent(jLabel58)
                            .addComponent(lbNhaCC))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59)
                            .addComponent(lbMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.ManageGroup.ComponentPanel.ImagePanel imagePanel;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel lbDonGia;
    private javax.swing.JLabel lbLoai;
    private javax.swing.JLabel lbMaSp;
    private javax.swing.JLabel lbMoTa;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbNhaCC;
    private javax.swing.JLabel lbSoLuong;
    // End of variables declaration//GEN-END:variables
}
