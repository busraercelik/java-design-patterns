package dp.creational.singleton.multithreading_singleton_ex;

public class ResourceManager {
    public static void main(String[] args) {
        Thread threadOne = new Thread( () -> {
            PrintSpooler ps = PrintSpooler.getInstance();
        });


        Thread threadTwo = new Thread( () -> {
            PrintSpooler ps = PrintSpooler.getInstance();
        });

        threadOne.setName("thread-1");
        threadOne.start();
        threadTwo.setName("thread-2");
        threadTwo.start();

        PrintSpooler spooler = PrintSpooler.getInstance();
    }
}
