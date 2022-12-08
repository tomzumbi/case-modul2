package SanPham;

import Manager.FileIO;
import model.ItemQuan;
import model.KhachHang;

import java.util.ArrayList;
import java.util.Scanner;

public class Quan extends QuanAo {
    private String tenQuan;
    KhachHang khachHang = new KhachHang();

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public Quan(String size, int soluong, String tenQuan) {
        super(size, soluong);
        this.tenQuan = tenQuan;
    }

    public String getTenQuan() {
        return tenQuan;
    }

    public void setTenQuan(String tenQuan) {
        this.tenQuan = tenQuan;
    }


    public Quan() {
    }

    Scanner scanner = new Scanner(System.in);
    static ArrayList<Quan> quan1s = new ArrayList<>();
    static ArrayList<ItemQuan> itemQuans = new ArrayList<>();
    FileIO fileIO = new FileIO();

    public void hienthi() {
        for (Quan quan : quan1s) {
            System.out.print("Quần: " + quan.tenQuan + " | ");
            System.out.print("size: " + quan.size + " | ");
            System.out.print("số lượng: " + quan.soluong + " | ");
            System.out.println("\n");
        }
    }
    public String String() {
        return "Quần: " + tenQuan + " || Size: " + size + " || Số lượng: " +soluong;
    }

    public void muaQuan() {
        khoQuan();
        System.out.print("Nhập quần muốn mua: ");
        String tenquan = scanner.nextLine();
        System.out.println("");
        System.out.print("size: X,M,L");
        String size = scanner.nextLine();
        System.out.println("");
        System.out.print("số lượng: ");
        int soluong = Integer.parseInt(scanner.nextLine());


        Quan quan = new Quan(size, soluong, tenquan);
        ItemQuan itemQuan = new ItemQuan(khachHang.getName(), quan);
        quan1s.add(quan);
        itemQuans.add(itemQuan);
        fileIO.writequan(itemQuans);
    }
    public void giohang(){
        for (int i = 0; i < itemQuans.size(); i++) {
            System.out.println(itemQuans.get(i).name + " đã mua: " + itemQuans.get(i).getQuan().String());
        }
    }

    public void xoaQuan() {
        System.out.println("bạn muốn xóa: ");
        int temp = 1;
        while (temp == 1) {
            String ao = scanner.nextLine();

            for (int i = 0; i < quan1s.size(); i++) {
                if (ao.equals(quan1s.get(i).tenQuan)) {
                    quan1s.remove(quan1s.get(i));
                    temp++;
                    break;
                }
                if (i == quan1s.size() - 1) {
                    System.out.print("bạn chưa mua sản phẩm này! Vui lòng chọn sản phẩm đã mua: ");
                    break;
                }
            }

        }

    }

    static ArrayList<Quan> quans = new ArrayList<>();

    public void themQuan(Quan quan) {
        quans.add(quan);
    }

    public Quan tao() {
        Quan quan = new Quan();
        System.out.println("THÊM QUẦN ");
        System.out.print("nhập quần: ");
        String quanmoi = scanner.nextLine();
        System.out.println("số lượng: ");

        int soluongquan = Integer.parseInt(scanner.nextLine());

        return quan = new Quan(" ", soluongquan, quanmoi);
    }

    public void xoaAD() {
        khoQuan();
        System.out.println("bạn muốn xóa: ");
        int temp = 1;
        while (temp == 1) {
            String quan = scanner.nextLine();

            for (int i = 0; i < quans.size(); i++) {
                if (quan.equals(quans.get(i).tenQuan)) {
                    quans.remove(quans.get(i));
                    temp++;
                    break;
                }
                if (i == quans.size() - 1) {
                    System.out.print("bạn chưa mua sản phẩm này! Vui lòng chọn sản phẩm đã mua: ");
                    break;
                }
            }

        }
    }


    public void khoQuan() {
        for (Quan quan1 : quans) {
            System.out.println("Quần " + quan1.tenQuan + " | Số lượng: " + quan1.getSoluong());
        }
    }

    public void showQuan() {
//        for (Ao ao : aos1) {
//            System.out.println("Áo: " + ao.tenAo + " | Số lượng: " + ao.getSoluong() );
//        }
            try {
                for (int i = 0; i < quans.size(); i++) {
                    for (int j = 0; j < itemQuans.size(); j++) {
                        int conlai = quans.get(i).getSoluong() - itemQuans.get(i).getQuan().getSoluong();
                        System.out.println("Quần: " + quans.get(i).tenQuan + " | Số lượng: " + conlai);
                    }
                }
            }catch (IndexOutOfBoundsException e){
                System.out.println("");
            }

        }
    }



