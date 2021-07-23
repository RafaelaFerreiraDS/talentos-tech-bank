package AtividadesSemana4.dia22.dao;

import AtividadesSemana4.dia22.models.ItemVenda;
import AtividadesSemana4.dia22.models.Venda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ItemVendaDao {

    private Connection conn;

    public ItemVendaDao(Connection conn) {
        this.conn = conn;
    }

    public Venda adicionarItemNaVenda(ItemVenda item, Venda venda) throws SQLException {
        String query = "insert into tb_item_venda values (default, ?, ?, ?, ?, ?, ?;";

        try (PreparedStatement inserirItemVenda = conn.prepareStatement(query)){

        }

        return
    }
}
