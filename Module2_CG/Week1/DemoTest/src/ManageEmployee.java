import java.util.Scanner;

public class ManageEmployee {
    Employee[] Employees = new Employee[0];
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

        Employee[] newNVs = new Employee[Employees.length + 1];
        for (int i = 0; i < Employees.length; i++) {
            newNVs[i] = Employees[i];
        }
        newNVs[newNVs.length - 1] = new Employee(id, name, age, address);
        Employees = newNVs;

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

        Employees[index] = new Employee(id, name, age, address);
    }

    public void deleteNV() {
        System.out.println("Nhập vị trí cần xóa");
        int index = Integer.parseInt(scanner.nextLine());
        Employee[] newNVs = new Employee[Employees.length - 1];
        for (int i = 0; i < Employees.length - 1; i++) {
            if (i < index) {
                newNVs[i] = Employees[i];
            } else {
                newNVs[i] = Employees[i + 1];
            }
        }
        Employees = newNVs;
    }

    public void show() {
        for (Employee nv : Employees) {
            System.out.println(nv.toString());
        }
    }
}
