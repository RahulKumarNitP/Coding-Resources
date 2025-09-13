package creational.Factory.AbstractFactory;

public class PostgresCommand implements DBCommand{

    @Override
    public void execute(String query) {
        System.out.println("Executing Postgres Command");
    }
}
