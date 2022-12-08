package SanPham;

import Manager.FileIO;
import model.Item;
import model.KhachHang;

import java.util.ArrayList;
import java.util.Scanner;

public class Ao extends QuanAo {
    private String tenAo;

    public String getTenAo() {
        return tenAo;
    }

    public void setTenAo(String tenAo) {
        this.tenAo = tenAo;
    }

    KhachHang khachHang = new KhachHang();
    FileIO fileIO = new FileIO();


    Scanner scanner = new Scanner(System.in);
    static ArrayList<Ao> aos = new ArrayList<>();
    static ArrayList<Item> items = new ArrayList<>();
    public Ao(String size, int soluong, String tenAo) {
        super(size, soluong);
        this.tenAo = tenAo;
    }


    public Ao() {
    }


    public String String() {
        return "Áo: " + tenAo + " || Size: " + size + " || Số lượng: " +soluong;
    }



    public void damua() {
        for (Ao ao : aos) {
            System.out.print("Áo: " + ao.tenAo + " | ");
            System.out.print("Số Lượng: " + ao.getSoluong() + " | ");
            System.out.print("Size: " + ao.getSize() + " ");
            System.out.println("\n");
        }

    }

    public void muaAo() {
        khoAo();
        System.out.print("Nhập áo muốn mua: ");
        String tenao = scanner.nextLine();
        System.out.println("");
        System.out.println("size: X,M,L");
        String size = scanner.nextLine();
        System.out.println("");
        System.out.print("số lượng: ");
        int soluong = Integer.parseInt(scanner.nextLine());
        Ao ao = new Ao(size, soluong, tenao);
        Item item = new Item(khachHang.getName(), ao);

        aos.add(ao);
        items.add(item);
        fileIO.writeao(items);
    }
    public void giohang(){
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).name + " đã mua: " + items.get(i).getAo().String());
        }
    }


    public void xoaAo() {
        System.out.println("Bạn muốn xóa: ");
        int temp = 1;
        while (temp==1) {
            String ao = scanner.nextLine();

            for (int i = 0; i < aos.size(); i++) {
                if (ao.equals(aos.get(i).tenAo)) {
                    aos.remove(aos.get(i));
                    temp++;
                    break;
                }
                if (i == aos.size() - 1) {
                    System.out.print("bạn chưa mua sản phẩm này! Xin vui lòng chọn đúng sản phẩm đã mua: ");
                    break;
                }
            }

        }

    }
    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }
    static ArrayList<Ao> aos1 = new ArrayList<>();

    public void adThem(Ao ao) {
        aos1.add(ao);
    }

    public Ao tao() {
        Ao ao = new Ao();
        System.out.println("THÊM ÁO ");
        System.out.print("Nhập áo: ");
        String aomoi = scanner.nextLine();
        System.out.print("Số lượng: ");
        int soluongao = Integer.parseInt(scanner.nextLine());

        return ao = new Ao(" ", soluongao, aomoi);
    }

    public void xoaAD() {
        khoAo();
        System.out.println("Bạn muốn xóa: ");
        int temp = 1;
        while (temp==1) {
            String ao = scanner.nextLine();

            for (int i = 0; i < aos1.size(); i++) {
                if (ao.equals(aos1.get(i).tenAo)) {
                    aos1.remove(aos1.get(i));
                    temp++;
                    break;
                }
                if (i == aos1.size() - 1) {
                    System.out.print("bạn chưa mua sản phẩm này! Xin vui lòng chọn đúng sản phẩm đã mua: ");
                    break;
                }
            }

        }
    }

    public void khoAo() {
        for (Ao ao : aos1) {

            System.out.println("Áo: " + ao.tenAo + " | Số lượng: " + ao.getSoluong() );
        }
    }
    public void showAoo() {
        try {
            for (int i = 0; i < aos1.size(); i++) {
                for (int j = 0; j < items.size(); j++) {
                    int conlai = aos1.get(i).getSoluong() - items.get(i).getAo().getSoluong();
                    System.out.println("Áo: " + aos1.get(i).tenAo + " | Số lượng: " + conlai);
                }
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("");
        }

    }

}




