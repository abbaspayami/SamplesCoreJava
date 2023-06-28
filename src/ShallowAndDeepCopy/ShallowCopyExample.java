package ShallowAndDeepCopy;

import java.util.Arrays;

public class ShallowCopyExample {
    public static void main(String[] args) {
        String[] authors = {"John Doe", "Jane Smith"};
        Book book = new Book("Java Programming", authors);

        // Shallow copy
        Book shallowCopy = book.shallowCopy();
        shallowCopy.setTitle("Python Programming");
        shallowCopy.getAuthors()[0] = "Bob Johnson";


        System.out.println(book.getTitle());              // Output: Python Programming
        System.out.println(Arrays.toString(book.getAuthors()));  // Output: [Bob Johnson, Jane Smith]

        System.out.println(shallowCopy.getTitle());       // Output: Python Programming
        System.out.println(Arrays.toString(shallowCopy.getAuthors()));   // Output: [Bob Johnson, Jane Smith]

    }
}
