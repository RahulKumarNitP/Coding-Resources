package creational.Factory.AbstractFactory;

public interface DBFactory {
    DBConnection createConnection();
    DBCommand createCommand();
}
