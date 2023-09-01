package main;

import java.sql.Connection;

import bean.carro;
import dao.CarroDAO;
import dao.Conexcao;

public class Teste3 {
    public static void main(String[] args) {
        Connection con = Conexcao.abrirConexcao();

        carro cb = new carro();
        cb.setPlaca("JKK1900");

        CarroDAO cd = new CarroDAO(con);
        System.out.println(cd.excluir(cb));;

        Conexcao.fecharConexcao(con);
    }
}