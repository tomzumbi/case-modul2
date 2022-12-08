package Mainnn;

import SanPham.Ao;
import SanPham.Quan;
import model.KhachHang;

import java.io.IOException;
import java.util.Scanner;

public class MainKH {
    Scanner scanner = new Scanner(System.in);
    KhachHang khachHang = new KhachHang();
    Ao ao = new Ao();
    Quan quan = new Quan();

    public void KH() {
        try {
            MainDKDN kh = new MainDKDN();
            System.out.println("Xin Chào Khách Hàng: " + khachHang.getName());
            while (true) {
                System.out.println("1. Mua");
                System.out.println("2. Xóa");
                System.out.println("3. Đã mua");
                System.out.println("4. Đăng xuất");
                int choice = Integer.parseInt(scanner.nextLine());
                while (choice > 4 || choice < 1) {
                    System.out.println("Làm ơn nhập đúng được không!");
                    choice = Integer.parseInt(scanner.nextLine());
                }
                switch (choice) {
                    case 1 -> {
                        System.out.println("chúng tôi hiện đang có: ");
                        System.out.println("1. Quần: ");
                        quan.khoQuan();
                        System.out.println("2. Áo: ");
                        ao.khoAo();
                        muaQuanAo();
                    }
                    case 2 -> xoaQuanAo();
                    case 3 -> {
                        quan.hienthi();
                        System.out.println(" ");
                        ao.damua();
                    }
                    case 4 -> {
                        System.out.println("Đăng xuất thành công! ");
                        kh.form();
                    }
                }
            }
        }catch (NumberFormatException e) {
            System.out.println("Đừng nhập chữ mà :((! Đây là 1 bài học nhé! ");
            System.exit(0);
        }
    }
    public void muaAo(){
        ao.muaAo();
    }
    public void muaQuan(){
        quan.muaQuan();
    }
    public void muaQuanAo(){
        try {
            System.out.println("Bạn muốn mua gì? ");
            System.out.println("1. Quần");
            System.out.println("2. Áo");
            int choice2 = Integer.parseInt(scanner.nextLine());
            while (choice2 > 2 || choice2 < 1) {
                System.out.println("Làm ơn nhập đúng được không!");
                choice2 = Integer.parseInt(scanner.nextLine());
            }
            switch (choice2) {
                case 1 -> muaQuan();
                case 2 -> muaAo();

            }
        }catch (NumberFormatException e) {
            System.out.println("Đừng nhập chữ mà :((! Đây là 1 bài học nhé! ");
            System.exit(0);
        }
    }
    public void xoaQuanAo() {
        try {
            System.out.println("Bạn đã mua: ");
            ao.damua();
            quan.hienthi();
            System.out.println("Bạn muốn hủy bỏ ?");
            System.out.println("1. Áo");
            System.out.println("2. Quần");
            int choice3 = Integer.parseInt(scanner.nextLine());
            while (choice3 > 2 || choice3 < 1) {
                System.out.println("Làm ơn nhập đúng được không!");
                choice3 = Integer.parseInt(scanner.nextLine());
            }
            switch (choice3) {
                case 1 -> {
                    System.out.println("Bạn đã mua: ");
                    ao.damua();
                    ao.xoaAo();
                }
                case 2 -> {
                    System.out.println("Bạn đã mua: ");
                    quan.hienthi();
                    quan.xoaQuan();
                }
            }

        } catch (NumberFormatException e){
            System.out.println("Đừng nhập chữ mà :((! Đây là 1 bài học nhé! ");
            System.exit(0);
        }
    }


    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.ao.setKhachHang(khachHang);
        this.khachHang = khachHang;
    }
    public void SetKhachHang(KhachHang khachHang) {
        this.quan.setKhachHang(khachHang);
        this.khachHang = khachHang;
    }



}
