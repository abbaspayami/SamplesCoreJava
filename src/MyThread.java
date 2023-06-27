public class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println("thread is started...");
        abbas();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void abbas() {
        System.out.println("Abbas is called...");
        try {
            riaz();
        }catch (RuntimeException e) {
            throw new RuntimeException("Abbas Exception", e);
        }
    }

    public void riaz() throws RuntimeException{
        System.out.println("Riaz is called...");
        throw new RuntimeException("Riaz Exception...");
    }

}
