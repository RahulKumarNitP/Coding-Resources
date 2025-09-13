package creational.Singleton;

public class EagerSingleton {
    private static EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    // Pros: If the class is light-weight, it's the easiest way to create a singleton class.
    // also, thread-safe
    // Cons: Instance of this class is loaded at the time of class loading, even without client is using this instance.
}
