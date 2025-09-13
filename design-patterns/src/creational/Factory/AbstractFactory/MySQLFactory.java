package creational.Factory.AbstractFactory;

public class MySQLFactory implements DBFactory{
    @Override
    public DBConnection createConnection() {
        return new MySQLConnection();
    }

    @Override
    public DBCommand createCommand() {
        return new MySQLCommand();
    }
}
