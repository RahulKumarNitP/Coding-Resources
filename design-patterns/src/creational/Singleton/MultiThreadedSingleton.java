package creational.Singleton;

public class MultiThreadedSingleton {
    private static MultiThreadedSingleton INSTANCE = null;
    private MultiThreadedSingleton(){}

    public static MultiThreadedSingleton getInstance() {
        if(INSTANCE == null) {
            synchronized(MultiThreadedSingleton.class) {
                if(INSTANCE == null) {
                    INSTANCE = new MultiThreadedSingleton();
                }
            }
        }

        return INSTANCE;
    }

    // Pros: Thread safe along with lazy initialisation
    // Cons: It can be break using reflection or serlisation
}
