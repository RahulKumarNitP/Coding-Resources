package creational.Singleton;

public enum EnumSingleton {
    INSTANCE;

    public void showMessage(){
        System.out.println("From Enum Singleton");
    }
    /*
    Thread-safe → JVM handles it.
    Serialization safe → Enum doesn’t create new instance when deserialized.
    Reflection safe → JVM prevents creating another instance of enum.
    Simple & clean → One-liner definition.
     */
}
