package main;

import java.sql.Connection;

import bean.carro;
import dao.CarroDAO;
import dao.Conexcao;

public class Teste1 {
    
    public static void main(String[]args){
        Connection con = Conexcao.abrirConexcao();

        carro cb= new carro();
        cb.setPlaca("JKK1900");
        cb.setCor("Azul");
        cb.setDescricao("Carro 1");

        CarroDAO cd = new CarroDAO(con);
        System.out.println(cd.inserir(cb));

        Conexcao.fecharConexcao(con);
    }
}