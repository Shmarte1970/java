/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package conection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author USER
 */
public class Conection {

    public static void main(String[] args) throws SQLException, IOException {
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca el DNI ");
        String DNI = br.readLine();
       
        System.out.println("Introduzca el Nombre ");
        String Nombre = br.readLine();
         */

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Define the data source for the driver
            String sourceURL = "jdbc:mysql://localhost/personas?useSSL=false&serverTimezone=UTC";
            // Create a connection through the DriverManager
            Connection databaseConnection = DriverManager.getConnection(sourceURL, "root", "");
            Statement statement = databaseConnection.createStatement();
            /*Crear tabla*/
            //statement.executeUpdate("CREATE TABLE personas (dni VARCHAR(9) NOT NULL PRIMARY KEY, nombre VARCHAR(30))");
            /*Borrar tabla*/
            //statement.executeUpdate("DROP TABLE nueva_tabla;");
            /*Insert*/
            //statement.executeUpdate("INSERT INTO personas (dni,nombre) VALUES ('52361361L','Pedro')");
            //statement.executeUpdate("INSERT INTO personas (dni,nombre) VALUES ('"+DNI+"','"+Nombre+"')");
            //statement.executeUpdate("DELETE FROM personas WHERE dni='" + DNI + "'");

            PreparedStatement pstmt = null;
            pstmt = databaseConnection.prepareStatement("INSERT INTO personas VALUES (?,?)");
            pstmt.setString(1, "47852367N");
            pstmt.setString(2, "Angel");
            pstmt.execute();
            
            pstmt.close();
        

            statement.close();
            databaseConnection.close();
        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
