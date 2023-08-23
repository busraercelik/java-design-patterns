package dp.creational.singleton.simple_singleton_ex;

public class ResourceManager {
    public static void main(String[] args) {
        PrintSpooler spooler = PrintSpooler.getInstance();
        System.out.println(spooler.hashCode());
    }
}
