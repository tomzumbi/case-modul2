package Manager;

import model.KhachHang;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerKH {
    Scanner scanner = new Scanner(System.in);
    ArrayList<KhachHang> khachHangs = new ArrayList<>();
    FileIO fileIO = new FileIO();



    private KhachHang khachHang = new KhachHang();

    public void dangki(KhachHang khachHang1) {
        khachHangs.add(khachHang1);
        fileIO.write(khachHangs);

    }

    public KhachHang ktraTK(String username) {
        for (KhachHang hang : khachHangs) {
            if (username.equals(hang.getUsername())) {
                return hang;
            }
        }
        return null;
    }


    public KhachHang create() {
        System.out.print("Họ tên của bạn: ");
        String name = scanner.nextLine();
        System.out.print("Tài khoản: ");
        String username = scanner.nextLine();
        System.out.print("Mật khẩu: ");
        String password = String.valueOf(scanner.nextLine());
        while (password.length() < 6){
            System.out.println("Mật khẩu phải lớn hơn 6 kí tự! vui lòng nhập lại dùm: ");
            password = String.valueOf(scanner.nextLine());
        }
        while (ktraTK(username) != null) {
            System.out.println("tài khoản đã tồn tại vui lòng đăng kí lại: ");
            System.out.print("Họ tên của bạn: ");
            name = scanner.nextLine();
            System.out.print("Tài khoản: ");

            username = scanner.nextLine();
            System.out.print("Mật khẩu: ");
            password = String.valueOf(scanner.nextLine());
        }

        System.out.print("bạn đã đăng kí thành công! ");

        return khachHang = new KhachHang(name, username, password);

    }

    public boolean dangnhap() {
        System.out.print("Nhập tài khoản: ");
        String username = scanner.nextLine();
        System.out.print("Nhập mật khẩu: ");
        String password = String.valueOf(scanner.nextLine());
        if (ktraTK(username) != null) {
            khachHang = ktraTK(username);
            while (!password.equals(khachHang.getPassword())) {
                System.out.print("sai mật khẩu vui lòng nhập lại: ");
                password = String.valueOf(scanner.nextLine());
            }

            System.out.println("Đăng nhập thành công!");
            return true;
        } else {
            System.out.println("Tài khoản không tồn tại vui lòng đăng kí! ");
            return false;
        }
    }
    public void quenMk(){
        System.out.print("Vui long điền tài khoản: ");
        String username = scanner.nextLine();
        if (ktraTK(username) != null){
            String password = ktraTK(username).getPassword();
            khachHang = ktraTK(username);
            System.out.println("Nhập mật khẩu mới");
            khachHang.setPassword(scanner.nextLine());

        }
        else {
            System.out.println("tài khoản không tồn tại!");
        }
    }
    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }
}


