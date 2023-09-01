package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import bean.carro;

public class CarroDAO {
    
    private Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public CarroDAO(Connection con) {
        this.con = con;
    }

    public String inserir(carro carro){
        String sql = "insert into carro(placa,cor,descricao) values(?,?,?)";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, carro.getPlaca());
            ps.setString(2, carro.getCor());
            ps.setString(3, carro.getDescricao());
            if (ps.executeUpdate() > 0){
                return "inserido com sucesso";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e){
            return e.getMessage();
        }
    }

    public String alterar(carro carro){
        String sql = "update carro ";
        sql += "set cor = ?, descricao = ? ";
        sql += "where placa = ?";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(3, carro.getPlaca());
            ps.setString(1, carro.getCor());
            ps.setString(2, carro.getDescricao());
            if (ps.executeUpdate() > 0){
                return "inserido com sucesso";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e){
            return e.getMessage();
        }
    }   
}