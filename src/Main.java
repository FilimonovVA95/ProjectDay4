

public class Main {

    public static void main(String[] args) {

        System.out.println(integrate(x -> 1, 1, 10));
    }

    public static double integrate(Func func, double x1, double x2) {
        double result = 0;
        double step = 0.1;

        for(double i = x1; i < x2+1; i+=step)
        {
            result += func.call(i) * ((i + step) - i);
        }
        return result;
    }
}
