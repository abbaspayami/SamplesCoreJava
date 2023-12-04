package String;

public class MemoryAddress {
    public static void main(String[] args) {
        String s = "Hello";
        String s1 = "Hello";
        String s2 = new String("Hello");
        int hashCode = s1.hashCode();
        int hashCode1 = s2.hashCode();
        System.out.println("s1.hashCode(): " + hashCode);
        System.out.println("s2.hashCode(): " + hashCode1);

        int identityHashCode = System.identityHashCode(s);
        int identityHashCode1 = System.identityHashCode(s1);
        System.out.println("S1 -- IdentityHashCode: " + identityHashCode);
        System.out.println("S2 -- IdentityHashCode : " + identityHashCode1);
    }
}
