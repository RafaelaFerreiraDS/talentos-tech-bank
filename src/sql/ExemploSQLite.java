package sql;

import java.sql.*;

public class ExemploSQLite {

    public static void main(String[] args) {


        try (
                Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/rafae/Documents/banco-de-dados/projeto-academia.db");
                Statement stmt = conn.createStatement()) {
            String query = "select * from academia";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("NOME: " + rs.getString("nome"));
            }
            rs.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
