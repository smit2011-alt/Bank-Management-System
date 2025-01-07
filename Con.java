package bank.management.system;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class Con {

    Connection connection;
    Statement statement;

    public Con(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Reddragon@2011");
            statement = connection.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new Con();
    }
}
