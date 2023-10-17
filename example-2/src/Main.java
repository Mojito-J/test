public class Main {
    public static void main(String[] args) {


        Ressult r = new Ressult(4,7,1);
        int value1 = Ressult.getCountByStatus(Statuss.DELETED, r); // =1
        int value2 = Ressult.getCountByStatus(Statuss.ACTIVE, r); // =4


        System.out.println(value1);
        System.out.println(value2);
    }
}