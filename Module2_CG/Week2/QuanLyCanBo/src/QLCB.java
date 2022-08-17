import java.util.Date;
import java.util.Scanner;

public class QLCB {
    CanBo[] canBos = new CanBo[0];

    Scanner scanner = new Scanner(System.in);

    public void Menu(){
        System.out.println("============Menu=============");
        System.out.println("1. Nhập thông tin mới cho cán bộ: ");
        System.out.println("2. Tìm kiếm theo họ tên: ");
        System.out.println("3. Hiển thị thông tin cán bộ");

        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                creatCB();
                break;
            case 2:
                findCB();
                break;
            case 3:
                showCB();
                break;
            default:
                System.out.println("Nhập lại hộ cái: ");
                break;
        }
    }


    public void creatCB(){
        System.out.println("Nhập Họ và Tên:");
        String fullName = scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String date = scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        CanBo[] newCB = new CanBo[canBos.length + 1];

        for (int i = 0; i < canBos.length; i++) {
            newCB[i] = canBos[i];
        }
        newCB[newCB.length - 1] = new CanBo(fullName, date, gender, address);
        canBos = newCB;
    }

    public void findCB(){
        System.out.println("Nhập tên cán bộ muốn tìm: ");
        String  name = scanner.nextLine();
        for (int i = 0; i < canBos.length; i++) {
            if(canBos[i].getFullName().equals(name)){
                System.out.println("Cán bộ muốn tìm là: " + canBos[i]);
                break;
            }
            else {
                System.out.println("Không có cán bộ muốn tìm!");
            }
        }
    }

    public void showCB(){
        for (CanBo cb : canBos) {
            System.out.println(cb);
        }
    }
}
