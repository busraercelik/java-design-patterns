package dp.creational.singleton.collection_singleton_ex;

import java.util.Collections;
import java.util.List;

public class ResourceManager {

    public static void main(String[] args) {
        PrintSpooler printSpooler = new PrintSpooler();
        // Collections.singletonList() contains only one object
        List<PrintSpooler> spoolers = Collections.singletonList(printSpooler); // immutable collection
        processResources(spoolers);

        PrintSpooler printSpooler2 = new PrintSpooler();
        spoolers.add(printSpooler2); // UnsupportedOperationException
    }

    private static <Type> void processResources(List<Type> list) {
        for (Type type : list) {
            // Code to process resources
        }
    }
}
