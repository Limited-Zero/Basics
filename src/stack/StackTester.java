package stack;

public class StackTester {
    public static void main (String[] args){
        GenStack stack = new GenStack(10);
        stack.push(1);
        stack.push("+");
        stack.push(3);
        stack.push("/");
        stack.push(5);
        stack.push("Hello!");
        stack.printStack();

        System.out.println("Popped Value: " + stack.pop());
        System.out.println("Popped Value: " + stack.pop());
        System.out.println("Popped Value: " + stack.pop());
        System.out.println("Popped Value: " + stack.pop());
        stack.printStack();
    }
}
