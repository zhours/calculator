package anli;

public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.compute('+', 8);
        invoker.compute('-', 2);
        invoker.compute('*', 3);
        invoker.compute('/', 2);

        invoker.undo();
        invoker.undo();
        invoker.redo();

        invoker.compute('/', 3);

    }
}
