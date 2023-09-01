package main;

import java.sql.Connection;

import dao.Conexcao;

public class Teste4 {
    public static void main(String[] args) {
        Connection con = Conexcao.abrirConexcao();

        

        Conexcao.fecharConexcao(con);
    }
}