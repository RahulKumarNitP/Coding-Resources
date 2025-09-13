package creational.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestRobustSingleton {
    public static void main(String[] args) throws Exception {
        RobustSingleton s1 = RobustSingleton.getInstance();
        RobustSingleton s2 = RobustSingleton.getInstance();

        System.out.println(s1==s2); // true

        // Serialization test
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(s1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        RobustSingleton s3 = (RobustSingleton) in.readObject();
        in.close();

        // Cloning test
        RobustSingleton s4 = (RobustSingleton) s1.clone();

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // true
        System.out.println(s1 == s4); // true
    }
}
