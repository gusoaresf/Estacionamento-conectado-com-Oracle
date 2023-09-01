package main;

import java.sql.Connection;
import java.util.ArrayList;

import bean.carro;
import dao.CarroDAO;
import dao.Conexcao;

public class Teste4 {
    public static void main(String[] args) {
        Connection con = Conexcao.abrirConexcao();

        CarroDAO cd = new CarroDAO(con);
        ArrayList<carro> lista = cd.listarTodos();

        if (lista !=null) {
            for (carro carro : lista) {
                System.out.println("Placa: " + carro.getPlaca());
                System.out.println("Cor: " + carro.getCor());
                System.out.println("Descricao: " + carro.getDescricao());
            }
        }

        Conexcao.fecharConexcao(con);
    }
}