/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.Component;

import DAL.DataModels.ChiTietHoaDon;
import DAL.DataModels.SanPham;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author huykh
 */
public class OrderPanel extends ScrollPanel<SanPham>{
    
    public OrderPanel(int width, int height){
        super(width, height);
    }
    
    @Override
    public void addToPanel(SanPham sp) {
        OrderItem item = new OrderItem(sp);
        this.panel.add(item);
        this.panel.revalidate();
        this.panel.repaint();
        System.out.println("Calculate height");
        this.panel.setPreferredSize(new Dimension((int)this.panel.getPreferredSize().getWidth(),calculateHeight()));
    }

    @Override
    public void addToPanel(List<SanPham> list) {
        for (SanPham sp: list){
            addToPanel(sp);
        }
    }

    @Override
    public List<SanPham> getListData() {
        return new ArrayList<>();
    }
    
    public List<ChiTietHoaDon> getListChiTietHoaDon(int maHD){
        List<ChiTietHoaDon> listCTHD = new ArrayList<>();
        Component[] list = this.panel.getComponents();
        for (Component item : list){
            if (item instanceof OrderItem orderitem){
                listCTHD.add(orderitem.getChiTietHoaDon(maHD));
            }
        }
        return listCTHD;
    }
    
    public OrderItem getOrderItem(int maSP){
        Component[] list = this.panel.getComponents();
        for (Component item : list){
            if (item instanceof OrderItem orderitem){
                if (orderitem.getMaSP() == maSP){
                    return orderitem;
                } 
            }
        }
        return null;
    }
    
    public boolean removeOrderItemHasProductId(int maSP){
        OrderItem orderitem = getOrderItem(maSP);
        if (orderitem == null){
            return false;
        }
        this.panel.remove(orderitem);
        this.revalidate();
        this.repaint();
        return true;
    }
    
    public boolean changeOrderItemQuantity(int maSP, int amout){
        OrderItem orderitem = getOrderItem(maSP);
        if (orderitem == null){
            return false;
        }
        orderitem.changeQuantity(amout);
        return true;
    }
}
