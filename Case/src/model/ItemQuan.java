package model;

import SanPham.Quan;

public class ItemQuan {
    public String name;
    private Quan quan;

    public ItemQuan(String name, Quan quan) {
        this.name = name;
        this.quan = quan;
    }

    public ItemQuan() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Quan getQuan() {
        return quan;
    }

    public void setQuan(Quan quan) {
        this.quan = quan;
    }
    public String toString(){
        return "Quần: " + getQuan().getTenQuan() + " | Size: " + getQuan().getSize()+ " | Số Lượng: " + getQuan().getSoluong();
    }
}
