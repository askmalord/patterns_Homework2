public class IntsCalculator implements Ints {
    protected final Calculator target;
    protected int result;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        result = (int) target.newFormula()
            .addOperand(arg0)
            .addOperand(arg1)
            .calculate(Calculator.Operation.SUM)
            .result();
        return result;
    }

    @Override
    public int mult(int arg0, int arg1) {
        result = (int) target.newFormula()
            .addOperand(arg0)
            .addOperand(arg1)
            .calculate(Calculator.Operation.MULT)
            .result();
        return result;
    }

    @Override
    public int pow(int arg0, int arg1) {
        result = (int) target.newFormula()
            .addOperand(arg0)
            .addOperand(arg1)
            .calculate(Calculator.Operation.POW)
            .result();
        return result;
    }
}