package AtividadesSemana4.dia22.models;

import java.math.BigDecimal;

public class ItemVenda {

    private Long id;
    private Produto produto;
    private BigDecimal quantidade;
    private BigDecimal vaorUnitario;
    private BigDecimal ValorTotal;
    private String descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getVaorUnitario() {
        return vaorUnitario;
    }

    public void setVaorUnitario(BigDecimal vaorUnitario) {
        this.vaorUnitario = vaorUnitario;
    }

    public BigDecimal getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        ValorTotal = valorTotal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
