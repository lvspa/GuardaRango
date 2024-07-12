package br.com.guardarango.dal;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection connection() {
        java.sql.Connection connection=null;
        // URL de conexão JDBC para o MySQL
        String url = "jdbc:mysql://localhost:3306/GuardaRangoBD";
        String driver="com.mysql.cj.jdbc.Driver";

        // Nome de usuário e senha do MySQL
        String user = "root";
        String password = "24240608B#c";

        try {
            // Carregar o driver JDBC
            Class.forName(driver);

            // Estabelecer a conexão com o banco de dados
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão bem sucedida");

            return connection;
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados");
            e.printStackTrace();
        }

        return null;
    }
}