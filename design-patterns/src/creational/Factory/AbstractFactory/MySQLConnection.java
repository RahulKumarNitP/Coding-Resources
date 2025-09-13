package creational.Factory.AbstractFactory;

public class MySQLConnection implements DBConnection{

    @Override
    public void connect() {
        System.out.println("Connected to MySQL Database");
    }
}
