package AtividadesSemana4.dia22.dao;

import AtividadesSemana4.dia22.models.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoDao {

    private Connection conn;

    public ProdutoDao(Connection conn){
        this.conn = conn;
    }

    public void criarProduto(Produto produto) throws SQLException {
        String query = "insert into ttb_produto values (default,?, ?, ?, ?, ?, ?, ?, );";


        try(PreparedStatement insertProduto = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
            int i = 0;

            insertProduto.setString(++i, produto.getDescricao());
            insertProduto.setBigDecimal(2, produto.getValorDeCusto());
            insertProduto.setString(++i, produto.getUnidadeMedidaPeso());
            insertProduto.setString(++i, produto.getCodigoDeBarras());
            insertProduto.setBigDecimal(++i, produto.getValorVenda());

            insertProduto.executeUpdate();

            ResultSet rsIdProduto = insertProduto.getGeneratedKeys();

            rsIdProduto.next();

            Long id = rsIdProduto.getLong("id");

            produto.setId(id);

            rsIdProduto.close();
        }

    }

    public boolean verificarSeProdutoExiste (String codigoDeBarra) throws SQLException{

        String query = "select count(*) > 0 as produto_ja_cadastrado from tb_produto where codigo_de_barras = ?;";

        try(PreparedStatement selectVerificaProdutoExistente = conn.prepareStatement(query)){
            selectVerificaProdutoExistente.setString(1, codigoDeBarra);

            ResultSet rs = selectVerificaProdutoExistente.executeQuery();

            rs.next();

            return rs.getBoolean("produto_ja_cadastrado");
        }

    }
}
