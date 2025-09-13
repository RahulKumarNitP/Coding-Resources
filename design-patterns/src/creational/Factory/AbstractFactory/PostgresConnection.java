package creational.Factory.AbstractFactory;

public class PostgresConnection implements DBConnection{

    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL Database");
    }
}
