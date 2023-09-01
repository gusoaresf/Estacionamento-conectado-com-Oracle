package main;

import java.sql.Connection;

import bean.carro;
import dao.CarroDAO;
import dao.Conexcao;

public class Teste1 {
    
    public static void main(String[]args){
        Connection con = Conexcao.abrirConexcao();

        carro cb= new carro();
        cb.setPlaca("JKK1901");
        cb.setCor("Amarelo");
        cb.setDescricao("Carro 2");

        CarroDAO cd = new CarroDAO(con);
        System.out.println(cd.inserir(cb));

        Conexcao.fecharConexcao(con);
    }
}