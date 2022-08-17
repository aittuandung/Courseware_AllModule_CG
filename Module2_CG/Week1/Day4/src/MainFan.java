public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, 10, "yellow", true);
        Fan fan2 = new Fan(3, 5, "blue", false);

        System.out.println("Trạng thái quạt 1 là: " + fan1.toString());
        System.out.println("Trạng thái quạt 1 là: " + fan2.toString());
    }
}
