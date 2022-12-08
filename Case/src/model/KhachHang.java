package model;

public class KhachHang extends Account{
    public KhachHang() {
    }

    public KhachHang(String name, String username, String password) {
        super(name, username, password);
    }

    @Override
    public String toString() {
        return "khách hàng: " + getName() + " Tài Khoản: " + getUsername()+ " Mật khẩu: " + getPassword();
    }
}
