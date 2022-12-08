package model;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends Account {
    public Admin() throws IOException {
    }

    public Admin(String name, String username, String password) throws IOException {
        super("Nguyễn Văn Mạnh", "Admin", "Admin");
    }
    Scanner scanner = new Scanner(System.in);
    public void dangnhap(){

        System.out.print("nhập tên đăng nhập: ");
        String username = scanner.nextLine();
        System.out.print("mật khẩu: ");
        String password = String.valueOf(scanner.nextLine());
        while (!username.equals("Admin") || !password.equals("Admin")){
            System.out.println("sai tên đăng nhập hoặc mật khẩu vui lòng nhập lại: ");
            System.out.print("Tên đăng nhập: ");
            username = scanner.nextLine();
            System.out.print("Mật khẩu: ");
            password = String.valueOf(scanner.nextLine());
        }
//            while (!password.equals("Admin")){
//                System.out.print("sai mật khẩu mời nhập lại: ");
//                password = String.valueOf(scanner.nextLine());
//            }
            System.out.println("đăng nhập thành công");
        }

    }

