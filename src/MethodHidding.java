public class MethodHidding {

    public static void method1() {
        System.out.println("Method-1 of the Demo class is executed.");
    }

    public void method2() {
        System.out.println("Method-2 of the Demo class is executed.");
    }

    //child class
    public class Sample extends MethodHidding
    {
        public void method2()
        {
            System.out.println("Method-2 of the Sample class is executed.");
        }
    }


}
