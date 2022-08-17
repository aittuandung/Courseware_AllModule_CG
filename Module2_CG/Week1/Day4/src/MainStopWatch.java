public class MainStopWatch {
    public static void main(String[] args) {
        StopWatch Time = new StopWatch();
        Time.start();
        System.out.println("Hiển thị thời gian bắt đầu: " + Time.getStartTime() );
        Time.stop();
        System.out.println("Hiển thị thời gian kết thúc: " + Time.getEndTime());
        System.out.println("Thời gian đã trôi qua theo milisecond giây: " + Time.getElapsedTime());
    }
}
