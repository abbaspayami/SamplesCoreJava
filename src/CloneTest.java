public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Human abbas = new Human("Abbas", "Payami", 37);
        System.out.println(abbas);

        Human abbas2 = (Human) abbas.clone();
        abbas2.setName("Riaz");

        System.out.println(abbas);

        System.out.println(abbas2);


    }

}
