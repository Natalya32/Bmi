public class BmiService {
    public double calculate (int weight, double height) {
        double heightInM = height / 100;
        double result = weight / (heightInM * heightInM);
        return result;
    }
}
