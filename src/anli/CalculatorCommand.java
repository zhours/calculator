package anli;

public class CalculatorCommand extends Command {

    private Calculator calculator;
    private int operand;
    private char operator;

    CalculatorCommand(Calculator calculator, char operator, int operand) {
        this.calculator = calculator;
        this.operator = operator;
        this.operand = operand;
    }

    @Override
    public void execute() {
        calculator.operation(operator, operand);
    }

    @Override
    public void unexecute() {
        calculator.operation(this.undo(operator), operand);

    }

    private char undo(char operator) {
        char ch = 0;
        switch (operator) {
            case '+':
                ch = '-';
                break;
            case '-':
                ch = '+';
                break;
            case '*':
                ch = '/';
                break;
            case '/':
                ch = '*';
                break;
        }
        return ch;
    }
}
