public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double kilo = 98;
        double metre = 1.87;
        int ibm =  service.calculate(kilo, metre);
        System.out.println(ibm);
    }
}