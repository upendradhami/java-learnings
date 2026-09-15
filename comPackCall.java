
import OOPs.company.feature1;

public class comPackCall {
    public static void main(String[] args) {
        feature1 f1 = new feature1();
        int sumResult = f1.sum(5, 10);
        int multiplyResult = f1.multiply(5, 10);

        System.out.println("Sum: " + sumResult);
        System.out.println("Multiply: " + multiplyResult);
    }
}