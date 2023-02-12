package anli;

/**
 * Receiver, 真正实现具体业务逻辑操作
 */
public class Calculator {

    private int total = 0;

    public void operation(char operator, int operand) {
        int tmpTotal = total;
        switch (operator) {
            case '+':
                total += operand;
                break;
            case '-':
                total -= operand;
                break;
            case '*':
                total *= operand;
                break;
            case '/':
                total /= operand;
                break;
        }
        System.out.println(tmpTotal + " " + operator + " " + operand + " = " + total);
    }
}
