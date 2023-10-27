package in.dev.gmsk.enum_pkg;

public enum JDBC_ENUM {

    driver("com.mysql.jdbc.Driver"),
    protocol("jdbc.mysql"),
    host("localhost"),
    port("3306"),
    database("krithvik"),
    username("root"),
    password("root");

    private String values;

    public String getValues(){
        return this.values;
    }

    JDBC_ENUM(String values){
        this.values = values;
    }
}
