package creational.Factory.AbstractFactory;

public class MySQLCommand implements DBCommand{
    @Override
    public void execute(String query) {
        System.out.println("Executing MYSQL command");
    }
}
