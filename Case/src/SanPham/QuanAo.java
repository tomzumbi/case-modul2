package SanPham;

public class QuanAo {
    String size;
    int soluong;

    public QuanAo(String size, int soluong) {
        this.size = size;
        this.soluong = soluong;
    }

    public QuanAo() {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

}
