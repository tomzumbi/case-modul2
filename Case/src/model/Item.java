package model;

import SanPham.Ao;

public class Item {
    public String name;
    public Ao ao;

    public Item(String name, Ao ao) {
        this.name = name;
        this.ao = ao;
    }

    public Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ao getAo() {
        return ao;
    }

    public void setAo(Ao ao) {
        this.ao = ao;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", ao=" + ao +
                '}';
    }
}
