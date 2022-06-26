public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 90;
        double height = 180;
        double bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}
