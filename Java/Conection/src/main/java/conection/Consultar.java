/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author USER
 */
public class Consultar {

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        List<Personas> Personas = new ArrayList<>();

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Define the data source for the driver
        String sourceURL = "jdbc:mysql://localhost/personas?useSSL=false&serverTimezone=UTC";
        // Create a connection through the DriverManager
        Connection databaseConnection = DriverManager.getConnection(sourceURL, "root", "");
        Statement statement = databaseConnection.createStatement();
        /*
        System.out.println("Introduzca nombre, por favor: ");
        String nombre = br.readLine();

        System.out.println("Introduzca DNI, por favor: ");
        String dni = br.readLine();
         */
 /*Crear tabla*/
        //statement.executeUpdate("CREATE TABLE personas (dni VARCHAR(9) NOT NULL PRIMARY KEY, nombre VARCHAR(30))");
        /*Borrar tabla*/
        //statement.executeUpdate("DROP TABLE nueva_tabla;");
        /*Insert*/
        //statement.executeUpdate("INSERT INTO personas (dni,nombre) VALUES ('52361361L','Pedro')");
        //     statement.executeUpdate("INSERT INTO personas (dni,nombre) VALUES ('" + dni + "','" + nombre + "')");
        //statement.executeUpdate("DELETE FROM personas WHERE dni='" + DNI + "'");

        /*
        ResultSet personasRS = statement.executeQuery("SELECT * FROM personas");
         */
        PreparedStatement pstmt = null;
        pstmt = databaseConnection.prepareStatement("SELECT * FROM personas where nombre = ?");
        pstmt.setString(1, "Estrella");
        ResultSet rs = pstmt.executeQuery();
     
       

        while (rs.next()) {
            Personas p = new Personas(sourceURL, sourceURL);
            String nombre2 = rs.getString("nombre");
            String Dni = rs.getString("dni");
            p.setNombre(nombre2);
            p.setDni(Dni);

            Personas.add(p);
        }

         pstmt.close();
         
         
        Iterator<Personas> it = Personas.iterator();

        while (it.hasNext()) {
            Personas p = it.next();
            System.out.println(p.getNombre() + " " + p.getDni());
        }

        statement.close();
        databaseConnection.close();

    }
}
