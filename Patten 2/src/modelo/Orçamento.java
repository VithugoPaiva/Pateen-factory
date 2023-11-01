package modelo;

public class Orçamento {
    public BigDecimal valorOrcamento;

    public String icmsRegiao;

    public Orçamento(BigDecimal valorOrcamento, String icmsRegiao) {
        this.valorOrcamento = valorOrcamento;
        this.icmsRegiao = icmsRegiao;
    }
}
