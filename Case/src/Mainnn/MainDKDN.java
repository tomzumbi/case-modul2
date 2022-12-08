package Mainnn;

import Manager.ManagerKH;
import model.Admin;
import model.KhachHang;

import java.io.IOException;
import java.util.Scanner;

public class MainDKDN {
    ManagerKH managerKH = new ManagerKH();
    Scanner scanner = new Scanner(System.in);
    Admin admin;

    {
        try {
            admin = new Admin();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    MainAd Ad = new MainAd();
    MainKH Kh = new MainKH();



    public void form() {
        while (true) {
            System.out.println("1. Đăng kí");
            System.out.println("2. Đăng nhập");
            System.out.println("3. Quên mật khẩu");
            System.out.println("4. Thoát");
            int choice1 = Integer.parseInt(scanner.nextLine());
            while (choice1 > 4 || choice1 < 1) {
                System.out.println("Làm ơn nhập đúng được không!");
                choice1 = Integer.parseInt(scanner.nextLine());
            }
            switch (choice1) {
                case 1:
                    sigin();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    managerKH.quenMk();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }


    }
    public void sigin(){
        managerKH.dangki(managerKH.create());
    }

    public void login() {
        System.out.println("Bạn là? ");
        System.out.println("1. ADMIN");
        System.out.println("2. Khách Hàng");
        int choice = Integer.parseInt(scanner.nextLine());
        while (choice > 2 || choice < 1){
            System.out.println("Làm ơn nhập đúng được không!");
            choice = Integer.parseInt(scanner.nextLine());
        }
        switch (choice) {
            case 1 -> {
                admin.dangnhap();
                Ad.AD();
            }
            case 2 -> {
                if(managerKH.dangnhap()) {
                    Kh.setKhachHang(managerKH.getKhachHang());
                    Kh.SetKhachHang(managerKH.getKhachHang());
                    Kh.KH();
                }else {
                    form();
                }
            }
        }
    }

}
