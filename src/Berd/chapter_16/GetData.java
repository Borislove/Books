package Berd.chapter_16;

import java.sql.*;
import java.text.NumberFormat;

public class GetData {
    public static void main(String[] args) {

        NumberFormat currency = NumberFormat.getCurrencyInstance().getCurrencyInstance();
        final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
        final String CONNECTION = "jdbc:derby:AccountDatabase";

        try{
            Class.forName(DRIVER).newInstance();

        }catch (InstantiationException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try(Connection connection =
                    DriverManager.getConnection(CONNECTION);

        Statement statement = connection.createStatement();
        ResultSet resultset =
                statement.executeQuery("select * from ACCOUNTS")){
            while (resultset.next()){
                System.out.println(resultset.getString("NAME"));
                System.out.println(", ");
                System.out.println(resultset.getString("ADDRESS"));
                System.out.println(" ");
                System.out.println(currency.format(resultset.getFloat("BALANCE")));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
