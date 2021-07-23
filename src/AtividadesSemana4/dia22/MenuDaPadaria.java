package AtividadesSemana4.dia22;

import AtividadesSemana4.dia22.dao.ProdutoDao;
import AtividadesSemana4.dia22.models.Produto;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;

public class MenuDaPadaria {

    public static void main(String[] args) throws SQLException {

        DataBaseConnection dataBaseConnection = new DataBaseConnection();

        Connection conn = dataBaseConnection.getConnection();

        ProdutoDao produtoDao = new ProdutoDao(conn);

        System.out.println(produtoDao.verificarSeProdutoExiste("7898901886136"));

        Produto p = new Produto(
                "Bolo",
                BigDecimal.valueOf(5.5),
                BigDecimal.valueOf(250.0),
                "GR",
                "786559123",
                BigDecimal.valueOf(11.0)
        );

        p.adicionarProduto(produtoDao);


    }
}
