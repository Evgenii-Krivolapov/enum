public class ArithmeticCalculator {
    private int value = 6;
    private int value1 = 5;
    protected int resultAdd;
    protected int resultMultiply;
    protected int resultSubtract;

    public ArithmeticCalculator(int value1, int value) {
        this.value1 = value1;
        this.value = value;
    }

    public int calculate(Operation operation) {
        if (operation == Operation.ADD) {
            resultAdd = value + value1;
        }
        if (operation == Operation.MULTIPLY) {
            resultMultiply = value * value1;
        }
        if (operation == Operation.SUBTRACT) {
            resultSubtract = value - value1;
        }
        return resultAdd;
    }

    public String toString() {
        return "ADD " + resultAdd + "\n" +
                "MULTIPLY " + resultMultiply + "\n" +
                "SUBTRACT " + resultSubtract;
    }
}
