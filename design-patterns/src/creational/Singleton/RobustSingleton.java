package creational.Singleton;

import java.io.Serializable;

final public class RobustSingleton implements Serializable, Cloneable {

    private static volatile RobustSingleton instance = null;

    RobustSingleton(){
        if(instance != null) {
            throw new RuntimeException("Exception occurred while creating an instance");
        }
    }

    public static RobustSingleton getInstance() {
        if(instance == null) {
            synchronized (RobustSingleton.class) {
                if(instance == null) {
                    instance = new RobustSingleton();
                }
            }
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }

    protected Object readResolve() {
        return getInstance();
    }
}
