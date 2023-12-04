package ShallowAndDeepCopy;

import java.util.Arrays;

public class DeepCopyExample {
    public static void main(String[] args) {

        String[] authors = {"John Doe", "Jane Smith"};
        Book book = new Book("Java Programming", authors);

        Book deepCopy = book.deepCopy();

        deepCopy.setTitle("JavaScript Programming");
        deepCopy.getAuthors()[1] = "Emily Brown";

        System.out.println(book.getTitle());              // Output: Java Programming
        System.out.println(Arrays.toString(book.getAuthors()));  // Output: [John Doe, Jane Smith]

        System.out.println(deepCopy.getTitle());          // Output: JavaScript Programming
        System.out.println(Arrays.toString(deepCopy.getAuthors()));  // Output: [John Doe, Emily Brown]
    }
}
