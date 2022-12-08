package Mainnn;

import SanPham.Ao;
import SanPham.Quan;

import java.util.Scanner;

public class MainAd {
    Scanner scanner = new Scanner(System.in);
    Ao ao = new Ao();
    Quan quan = new Quan();

    public void Ao() {
        ao.adThem(ao.tao());
    }

    public void Quan() {
        quan.themQuan(quan.tao());
    }
    public void xoaAo(){
        ao.xoaAD();
    }
    public void xoaQuan(){
        quan.xoaAD();
    }
    public void themquanao(){
        try {
            System.out.println("1. ÁO");
            System.out.println("2. Quần");
            System.out.print("lựa chọn: ");
            int choice1 = Integer.parseInt(scanner.nextLine());
            while (choice1 > 2 || choice1 < 1) {
                System.out.println("Làm ơn nhập đúng được không!");
                choice1 = Integer.parseInt(scanner.nextLine());
            }
            switch (choice1) {
                case 1:
                    Ao();
                    break;
                case 2:
                    Quan();
                    break;
                case 3:
                    break;
            }
        }catch (NumberFormatException e) {
            System.out.println("Đừng nhập chữ mà :((! Đây là 1 bài học nhé! ");
            System.exit(0);
        }
    }
    public void xoaquanao() {
        try {
            System.out.println("Bạn muốn xóa ? ");
            System.out.println("1. Quần");
            System.out.println("2. Áo");
            int choice2 = Integer.parseInt(scanner.nextLine());
            while (choice2 > 2 || choice2 < 1) {
                System.out.println("Làm ơn nhập đúng được không!");
                choice2 = Integer.parseInt(scanner.nextLine());
            }
            switch (choice2) {
                case 1 -> xoaQuan();
                case 2 -> xoaAo();
            }
        } catch (NumberFormatException e) {
            System.out.println("Đừng nhập chữ mà :((! Đây là 1 bài học nhé! ");
            System.exit(0);
        }
    }
    public void hienthi(){

        System.out.println("Trong sốp đang có: ");
        System.out.println("Áo: ");
        ao.khoAo();
        System.out.println("Quần: ");
        quan.khoQuan();
    }

    public void AD() {
        MainDKDN ad = new MainDKDN();
        try {
            System.out.println("ADMIN: Nguyễn Văn Mạnh");
            System.out.println("-----------------");
            while (true) {
                System.out.println("1. Thêm hàng vào sốp");
                System.out.println("2. Xóa hàng khỏi sốp");
                System.out.println("3. Hiển Thị");
                System.out.println("4. Kiểm tra");
                System.out.println("5. Đăng xuất");
                System.out.print("Lựa chọn: ");
                int choice = Integer.parseInt(scanner.nextLine());
                while (choice > 5 || choice < 1) {
                    System.out.println("Làm ơn nhập đúng được không!");
                    choice = Integer.parseInt(scanner.nextLine());
                }
                switch (choice) {
                    case 1:
                        System.out.println("-----------------");
                        themquanao();
                        break;
                    case 2:
                        System.out.println("-----------------");
                        xoaquanao();
                        break;
                    case 3:
                        System.out.println("-----------------");
                        hienthi();
                        break;
                    case 4:
                        System.out.println("-----------------");
                        ao.giohang();
                        quan.giohang();
                        break;
                    case 5:
                        ad.form();
                        break;
                }
            }
        }catch (NumberFormatException e) {
            System.out.println("Đừng nhập chữ mà :((! Đây là 1 bài học nhé! ");
            System.exit(0);
        }
    }
}
