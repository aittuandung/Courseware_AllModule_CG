import java.util.Scanner;

public class ManageNhanVien {
    NhanVien[] nhanViens = new NhanVien[0];
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println("Menu");
        System.out.println("1. Thêm");
        System.out.println("2. Sửa");
        System.out.println("3. Xóa");
        System.out.println("4. Hiển thị");
        System.out.println("5. Thoát");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                create();
                break;
            case 2:
                editByIndex();
                break;
            case 3:
                deleteNV();
                break;
            case 4:
                show();
                break;
            case 5:
                System.exit(0);
        }
    }

    public void create() {
        System.out.println("nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập name: ");
        String name = scanner.nextLine();
        System.out.println("nhập address: ");
        String address = scanner.nextLine();

        NhanVien[] newNVs = new NhanVien[nhanViens.length + 1];
        for (int i = 0; i < nhanViens.length; i++) {
            newNVs[i] = nhanViens[i];
        }
        newNVs[newNVs.length - 1] = new NhanVien(id, name, age, address);
        nhanViens = newNVs;

    }


    public void editByIndex() {
        System.out.println("Nhập vị trí cần sửa");
        int index = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập name: ");
        String name = scanner.nextLine();
        System.out.println("nhập address: ");
        String address = scanner.nextLine();

        nhanViens[index] = new NhanVien(id, name, age, address);
    }

    public void deleteNV() {
        System.out.println("Nhập vị trí cần xóa");
        int index = Integer.parseInt(scanner.nextLine());
        NhanVien[] newNVs = new NhanVien[nhanViens.length - 1];
        for (int i = 0; i < nhanViens.length - 1; i++) {
            if (i < index) {
                newNVs[i] = nhanViens[i];
            } else {
                newNVs[i] = nhanViens[i + 1];
            }
        }
        nhanViens = newNVs;
    }

    public void show() {
        for (NhanVien nv : nhanViens) {
            System.out.println(nv.toString());
        }
    }
}
