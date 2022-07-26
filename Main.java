public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator add = new ArithmeticCalculator(5,6);
        add.calculate(Operation.ADD);
        add.calculate(Operation.MULTIPLY);
        add.calculate(Operation.SUBTRACT);
        System.out.println(add);

    }
}
