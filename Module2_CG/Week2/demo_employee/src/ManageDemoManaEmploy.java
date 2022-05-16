import java.util.Scanner;

public class ManageDemoManaEmploy {
    DemoManaEmploy[] DemoManaEmploys = new DemoManaEmploy[0];
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
        System.out.println("1. Nhập thông tin parttime: ");
        System.out.println("2. Nhập thông tin fulltime: ");
        int timeWork = scanner.nextInt();
        switch (timeWork){
            case 1:
                System.out.println("nhập id: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("nhập age: ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("nhập name: ");
                String name = scanner.nextLine();
                System.out.println("nhập address: ");
                String address = scanner.nextLine();

                DemoManaEmploy[] newNVs = new DemoManaEmploy[DemoManaEmploys.length + 1];
                for (int i = 0; i < DemoManaEmploys.length; i++) {
                    newNVs[i] = DemoManaEmploys[i];
                }
                newNVs[newNVs.length - 1] = new DemoManaEmploy(id, name, age, address);
                DemoManaEmploys = newNVs;
            case 2:
                System.out.println("nhập id: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("nhập age: ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("nhập name: ");
                String name = scanner.nextLine();
                System.out.println("nhập address: ");
                String address = scanner.nextLine();

                DemoManaEmploy[] newNVs = new DemoManaEmploy[DemoManaEmploys.length + 1];
                for (int i = 0; i < DemoManaEmploys.length; i++) {
                    newNVs[i] = DemoManaEmploys[i];
                }
                newNVs[newNVs.length - 1] = new DemoManaEmploy(id, name, age, address);
                DemoManaEmploys = newNVs;
        }
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

        DemoManaEmploys[index] = new DemoManaEmploy(id, name, age, address);
    }

    public void deleteNV() {
        System.out.println("Nhập vị trí cần xóa");
        int index = Integer.parseInt(scanner.nextLine());
        DemoManaEmploy[] newNVs = new DemoManaEmploy[DemoManaEmploys.length - 1];
        for (int i = 0; i < DemoManaEmploys.length - 1; i++) {
            if (i < index) {
                newNVs[i] = DemoManaEmploys[i];
            } else {
                newNVs[i] = DemoManaEmploys[i + 1];
            }
        }
        DemoManaEmploys = newNVs;
    }

    public void show() {
        for (DemoManaEmploy nv : DemoManaEmploys) {
            System.out.println(nv.toString());
        }
    }
}
