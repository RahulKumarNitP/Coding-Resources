package creational.ProtoType;

public class ProtoTypeRunner {
    public static void main(String[] args) {
        QueryConfig queryConfig = new QueryConfig(
                "jdbc:mysql://localhost:3306/appdb",
                6000,
                true
        );
        System.out.println(queryConfig.toString());

        QueryConfig readConfig = queryConfig.clone();
        readConfig.setTimeout(2000);
        System.out.println(readConfig.toString());

        QueryConfig writeConfig = queryConfig.clone();
        writeConfig.setCacheEnabled(false);

        System.out.println(writeConfig.toString());

    }
}
