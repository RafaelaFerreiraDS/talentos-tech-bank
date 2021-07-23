package AtividadesSemana4.dia22.dao;

import AtividadesSemana4.dia22.models.Venda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VendaDao {

    private Connection conn;

    public VendaDao (Connection conn){
        this.conn = conn;
    }

    public void inicializarVenda() throws SQLException{

        String query  = "insert into tb_venda (data_hora) values (CURRENT_TIMESTAMP) returning id;";

        try(PreparedStatement );
    }

    public void finalizarVenda(Venda venda) throws SQLException{
        String query = "update tb_venda set valor = (select sum(valor_total) from tb_item_venda where id = ?) where id = 1;";

        int i = 0;

        try (PreparedStatement updateVenda = conn.prepareStatement(query)) {

            updateVenda.setLong(++i, venda.getId());
            updateVenda.setLong(++i, venda.getId());

            updateVenda.executeUpdate();
            updateVenda.close();
        }

    }
}
