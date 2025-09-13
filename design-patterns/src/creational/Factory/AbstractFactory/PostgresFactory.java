package creational.Factory.AbstractFactory;

public class PostgresFactory implements DBFactory{
    @Override
    public DBConnection createConnection() {
        return new PostgresConnection();
    }

    @Override
    public DBCommand createCommand() {
        return new PostgresCommand();
    }
}
