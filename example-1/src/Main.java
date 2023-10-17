

public class Main {
    public static void main(String[] args) {
        Statuss status1 = Statuss.getStatus("ACTIVE");
        Statuss status2 = Statuss.getStatus("active");
        Statuss status3 = Statuss.getStatus("test");
        System.out.println(status1.name());
        System.out.println(status2.name());
        System.out.println(status3.name());
    }
}