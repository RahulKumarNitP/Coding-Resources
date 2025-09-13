package creational.Singleton;

public class LazyInitializationSingleton {
    private static LazyInitializationSingleton INSTANCE = null;

    private LazyInitializationSingleton(){}

    public static LazyInitializationSingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new LazyInitializationSingleton();
        }
        return INSTANCE;
    }

    // Pros: Instance is created when client has started using this class.
    // Cons: not thread safe
}
