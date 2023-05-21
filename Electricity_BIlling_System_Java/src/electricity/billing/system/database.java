package electricity.billing.system;

import java.sql.Connection;
//import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class database {
    Connection connection;
    Statement statement;
    database(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BIll_system", "root", "mysql@2939");
            statement= connection.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
