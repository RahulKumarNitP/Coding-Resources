package creational.ProtoType;

public class QueryConfig implements Cloneable{
    private String connectionUrl;
    private int timeout;
    private boolean cacheEnabled;

    public QueryConfig(String connectionUrl, int timeout, boolean cacheEnabled) {
        this.connectionUrl = connectionUrl;
        this.timeout = timeout;
        this.cacheEnabled = cacheEnabled;
    }

    private QueryConfig(QueryConfig queryConfig) {
        this.connectionUrl = queryConfig.connectionUrl;
        this.cacheEnabled = queryConfig.cacheEnabled;
        this.timeout = queryConfig.timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public void setCacheEnabled(boolean cacheEnabled) {
        this.cacheEnabled = cacheEnabled;
    }

    @Override
    public String toString() {
        return "QueryConfig{connectionString='" + connectionUrl +
                "', timeout=" + timeout +
                ", cacheEnabled=" + cacheEnabled + "}";
    }

    @Override
    public QueryConfig clone() {
        return new QueryConfig(this);
    }
}
