package ATM;

import com.mysql.cj.protocol.Resultset;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.sql.*;

public class ReadDB {
    public static void connect(){
        System.out.println("!11111111");
        String url = "jdbc:mysql://localhost:3306/atm";
        String user = "root";
        String password = "";
        String sql = "select * from account ";
        try(Connection conn = DriverManager.getConnection(url,user,password) ) {
            System.out.println(conn.getCatalog());
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            showInfo(resultSet);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private static void showInfo(ResultSet rs) {
        try {

            FileWriter fw = new FileWriter("D:\\react project\\ATM\\src\\ATM\\Account.txt");
            while (rs.next()) {
                fw.write(rs.getInt(1) + "\t" + rs.getString(2)
                        + "\t" + rs.getString(3) );
                fw.write("\n");
            }
            fw.close();

        }catch (SQLException throwables) {
            throwables.printStackTrace();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

