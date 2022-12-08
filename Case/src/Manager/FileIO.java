package Manager;

import model.Item;
import model.ItemQuan;
import model.KhachHang;

import java.io.*;
import java.util.ArrayList;

public class FileIO {
    public void write(ArrayList<KhachHang> arrayList) {
        read();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\codegym\\CuoiModul2\\Case\\KhachHang.txt"))){
            for (KhachHang khachHang : arrayList) {
                writer.write("Họ tên: "+ khachHang.getName());
                writer.write('\n');
                writer.write("Tài Khoản: "+khachHang.getUsername());
                writer.write('\n');
                writer.write("Mật Khẩu: "+khachHang.getPassword());
                writer.write('\n');
                writer.write('\n');

            }
        } catch (IOException e) {
            System.out.println("đã xảy ra lỗi");
        }
    }
    public ArrayList<KhachHang> read(){
        try (BufferedReader reader = new BufferedReader(new FileReader("KhachHang.txt"))){
            ArrayList<KhachHang> list = new ArrayList<>();
            while (true) {
                String name = reader.readLine();
                String username = reader.readLine();
                String password = reader.readLine();
                if (name == null || username == null || password == null) break;
                KhachHang khachHang = new KhachHang(name, username, password);
                list.add(khachHang);
            }
            return list;
        }catch (IOException e){
            System.out.println("");
        }
        return null;
    }
    public void writequan(ArrayList<ItemQuan> arrayList) {
        read();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\codegym\\CuoiModul2\\Case\\Giohang.txt"))){
            for (ItemQuan itemQuan : arrayList) {
                writer.write('\n');
                writer.write("Họ tên: "+ itemQuan.getName());
                writer.write('\n');
                writer.write("Đã mua: " + "Quần: "+ itemQuan.getQuan().getTenQuan());
                writer.write( " | Size: " + itemQuan.getQuan().getSize());
                writer.write( " | Số Lượng: " + itemQuan.getQuan().getSoluong());
                writer.write('\n');

            }
        } catch (IOException e) {
            System.out.println("đã xảy ra lỗi");
        }
    }
    public void writeao(ArrayList<Item> arrayList) {
        read();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\codegym\\CuoiModul2\\Case\\Giohang.txt"))){
            for (Item item : arrayList) {
                writer.write('\n');
                writer.write("Họ tên: "+ item.getName());
                writer.write('\n');
                writer.write("Đã mua: " + "Áo: "+ item.getAo().getTenAo());
                writer.write( " | Size: " + item.getAo().getSize());
                writer.write( " | Số Lượng: " + item.getAo().getSoluong());
                writer.write('\n');

            }
        } catch (IOException e) {
            System.out.println("đã xảy ra lỗi");
        }
    }

}
