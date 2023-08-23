package dp.creational.singleton.simple_singleton_ex;

public class PrintSpooler {
    private static PrintSpooler spooler;
    private static boolean isInitialized = false;

    private PrintSpooler() {}

    private void init() {}

    public static PrintSpooler getInstance() {
        if (isInitialized) return spooler;
        spooler = new PrintSpooler();
        spooler.init();
        isInitialized = true;
        return spooler;
    }
}
