public class BmiService {
    public int calculate(double kilo, double metre) {
        double index = kilo / (metre * metre);
        int ibm = (int) index;
        return ibm;
    }
}
