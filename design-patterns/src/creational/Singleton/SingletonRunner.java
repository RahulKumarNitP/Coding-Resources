package creational.Singleton;

public class SingletonRunner {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        if(eagerSingleton1.hashCode() == eagerSingleton2.hashCode()){
            System.out.println(eagerSingleton1.hashCode() + " " + eagerSingleton2.hashCode());
            System.out.println("Same instance");
        } else {
            System.out.println("Different instance");
        }

        LazyInitializationSingleton lazyInitializationSingleton1 = LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton lazyInitializationSingleton2 = LazyInitializationSingleton.getInstance();
        if(lazyInitializationSingleton1.hashCode() == lazyInitializationSingleton2.hashCode()){
            System.out.println(lazyInitializationSingleton1.hashCode() + " " + lazyInitializationSingleton2.hashCode());
            System.out.println("Same instance");
        } else {
            System.out.println("Different instance");
        }

        MultiThreadedSingleton multiThreadedSingleton1 = MultiThreadedSingleton.getInstance();
        MultiThreadedSingleton multiThreadedSingleton2 = MultiThreadedSingleton.getInstance();
        if(multiThreadedSingleton1.hashCode() == multiThreadedSingleton2.hashCode()){
            System.out.println(multiThreadedSingleton1.hashCode() + " " + multiThreadedSingleton2.hashCode());
            System.out.println("Same instance");
        } else {
            System.out.println("Different instance");
        }

        // Let's break the multi-thread Singleton
        /*
            Ways to break:
            1) Cloning:- implement clone() method to return the same instance
            2) Reflection:- Add a validation in constructor, if instance exist then through exception
            3) Serialisation:- implement the readResolve()

            All are handled in RobustSingleton class.
         */


        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;

        System.out.println(enumSingleton1 == enumSingleton2);
        enumSingleton1.showMessage();

    }
}
