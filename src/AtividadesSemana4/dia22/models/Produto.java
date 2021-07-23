package AtividadesSemana4.dia22.models;

import AtividadesSemana4.dia22.dao.ProdutoDao;

import java.math.BigDecimal;
import java.sql.SQLException;

public class Produto {

    private long id;
    private String descricao;
    private BigDecimal valorDeCusto;
    private BigDecimal pesoUnitario;
    private String unidadeMedidaPeso;
    private String codigoDeBarras;
    private BigDecimal valorVenda;

    public Produto(String descricao,
                   BigDecimal valorDeCusto,
                   BigDecimal precoUnitario,
                   String unidadeMedidaPeso,
                   String codigoDeBarras,
                   BigDecimal valorVenda) {
        this.descricao = descricao;
        this.valorDeCusto = valorDeCusto;
        this.pesoUnitario = precoUnitario;
        this.unidadeMedidaPeso = unidadeMedidaPeso;
        this.codigoDeBarras = codigoDeBarras;
        this.valorVenda = valorVenda;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValorDeCusto() {
        return valorDeCusto;
    }

    public void setValorDeCusto(BigDecimal valorDeCusto) {
        this.valorDeCusto = valorDeCusto;
    }

    public BigDecimal getPesoUnitario() {
        return pesoUnitario;
    }

    public void setPesoUnitario(BigDecimal pesoUnitario) {
        this.pesoUnitario = pesoUnitario;
    }

    public String getUnidadeMedidaPeso() {
        return unidadeMedidaPeso;
    }

    public void setUnidadeMedidaPeso(String unidadeMedidaPeso) {
        this.unidadeMedidaPeso = unidadeMedidaPeso;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }

    public void adicionarProduto(ProdutoDao dao) throws SQLException {
        if (Boolean.TRUE.equals(dao.verificarSeProdutoExiste(this.codigoDeBarras)))  {
            dao.criarProduto(this);
        }
    }
}
