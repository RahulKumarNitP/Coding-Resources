package creational.Factory.AbstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        DBClient sqlDBClient = new DBClient(new MySQLFactory());
        sqlDBClient.executeQuery("SELECT * From Users");

        DBClient pgsDBClient = new DBClient(new PostgresFactory());
        pgsDBClient.executeQuery("SELECT * From Users");
    }
}
