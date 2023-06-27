import javax.sound.midi.Soundbank;
import java.util.Stack;

public class Task3 {
    public String solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && canRemove(stack.peek(), c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        System.out.println(sb);
        return sb.toString();
    }

    private boolean canRemove(char a, char b) {
        return (a == 'A' && b == 'B') || (a == 'C' && b == 'D');
    }
}
