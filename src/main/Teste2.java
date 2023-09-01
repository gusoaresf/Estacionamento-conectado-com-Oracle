package main;

import java.sql.Connection;

import bean.carro;
import dao.CarroDAO;
import dao.Conexcao;

public class Teste2 {
    public static void main(String[] args) {
        Connection con = Conexcao.abrirConexcao();

        carro cb = new carro();
        cb.setPlaca("JKK1900");
        cb.setCor("Fucshia");
        cb.setDescricao("Carro da Barbie");

        CarroDAO cd = new CarroDAO(con);
        System.out.println(cd.alterar(cb));

        Conexcao.fecharConexcao(con);
    }
}