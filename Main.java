public class Main {

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);

        stack.push(5);
        stack.printStack();

        System.out.println("");

        stack.pop();
        stack.printStack();
    }
}