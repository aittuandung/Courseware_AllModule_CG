import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class QuanLyHSHocSinh {
    Scanner sc = new Scanner(System.in);
    ArrayList<HSHocSinh> hsHocSinhs = new ArrayList<>();
    public void main(){
        System.out.println("=========MENU=========");
        System.out.println("1. Nhập danh sách học sinh");
        System.out.println("2. Nhập thông tin học sinh");
        System.out.println("3. HIển thị toàn bộ học sinh");
        System.out.println("4. Hiển thị học sinh sinh năm 1985 quê Thái Nguyên");
        System.out.println("5. Hiển thị học sinh lớp 10A1.");

        switch (Integer.parseInt(sc.nextLine())){
            case 1:
                nhapDS();
                break;
            case 2:
                themHS();
                break;
            case 3:
                hienThi();
                break;
            case 4:
                hienThiQue();
                break;
            case 5:
                hienThiLop;
                break;
            case 6:
                System.exit(0);
        }
    }

    public void nhapDS(){
        System.out.println("Nhập vào số học sinh: ");
        int soHS = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < hsHocSinhs.size(); i++) {
            System.out.println("Nhập vào tên học sinh thứ " + (i+1));
            String ten = sc.nextLine();
            System.out.println("Nhập vào ngày sinh: ");
            Date ngaySinh = SimpleDateFormat
        }
    }
}
