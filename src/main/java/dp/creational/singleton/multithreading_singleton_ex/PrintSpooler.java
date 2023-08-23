package dp.creational.singleton.multithreading_singleton_ex;

// Java uses lazy loading
public class PrintSpooler {
    private static final PrintSpooler spooler = new PrintSpooler(); // eager initialization
    private static boolean isInitialized = false;

    private PrintSpooler() {}

    private void init() {
        System.out.println("Initialized by " + Thread.currentThread().getName());
    }

    public static synchronized PrintSpooler getInstance() {
        if (isInitialized) return spooler;
//        spooler = new PrintSpooler();  // lazy initialization
//        System.out.println("New object is created by thread " + Thread.currentThread().getName());
        spooler.init();
        isInitialized = true;
        return spooler;
    }
}
