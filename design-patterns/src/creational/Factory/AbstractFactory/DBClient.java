package creational.Factory.AbstractFactory;

public class DBClient {
    private DBConnection dbConnection;
    private DBCommand dbCommand;

    public DBClient(DBFactory dbFactory) {
        dbConnection = dbFactory.createConnection();
        dbCommand = dbFactory.createCommand();
    }

    public void executeQuery(String query) {
        dbConnection.connect();
        dbCommand.execute(query);
    }
}
