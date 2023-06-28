package String;

public class MemoryAddress {
    public static void main(String[] args) {
        String s = "Hello";
        String s1 = "Hello";
        String s2 = new String("Hello");
        int hashCode = s1.hashCode();
        int hashCode1 = s2.hashCode();
        System.out.println("HashCode: " + hashCode);
        System.out.println("HashCode: " + hashCode1);

        int identityHashCode = System.identityHashCode(s);
        int identityHashCode1 = System.identityHashCode(s1);
        System.out.println("IdentityHashCode: " + identityHashCode);
        System.out.println("IdentityHashCode: " + identityHashCode1);
    }
}
