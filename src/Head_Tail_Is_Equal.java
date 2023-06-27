public class Head_Tail_Is_Equal {

    public static void main(String[] args) {
        String A = "madan";

        Character head = A.charAt(0);
        Character tail = A.charAt(A.length()-1);
        if (head.equals(tail)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }


}
