package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexcao {

    public static Connection abrirConexcao(){
        Connection con = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
            final String USER = "RM97850";
            final String PASS = "120803";
            con = DriverManager.getConnection(url, USER, PASS);
            System.out.println("Conexao aberta");

        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.print(e.getMessage());
        }
        return con;
    }

    public static void fecharConexcao(Connection con){
        try{
            con.close();
            System.out.println("Conexcao fechada");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}