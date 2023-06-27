package DataStructure;

import java.util.Stack;

public class StackExample{

    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        while (!stack.empty()) {
            System.out.print(stack.pop());
            System.out.print(",");
            System.out.println(stack.peek());
        }
        System.out.print("Lift-OFF!");
    }

}
