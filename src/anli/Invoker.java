package anli;

import java.util.Stack;

public class Invoker {

    private Calculator calculator = new Calculator();
    private Stack<Command> undoCommand = new Stack<>();
    private Stack<Command> redoCommand = new Stack<>();

    public void redo() {
        System.out.print("redo: ");
        if (!redoCommand.isEmpty()) {
            Command command = redoCommand.pop();
            command.execute();
        }
    }

    public void undo() {
        System.out.print("undo: ");
        if (!undoCommand.empty()) {
            Command command = undoCommand.pop();
            command.unexecute();
            redoCommand.push(command);
        }
    }

    public void compute(char operator, int operand) {
        Command command = new CalculatorCommand(calculator, operator, operand);
        command.execute();
        undoCommand.push(command);
        if (!redoCommand.isEmpty()) {
            redoCommand.clear();
        }
    }
}
