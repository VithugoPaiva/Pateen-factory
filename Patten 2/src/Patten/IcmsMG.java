package Patten;

import java.math.BigDecimal;

public class IcmsMG implements CalculoPorRegiao {
    @Override
    public BigDecimal calculoPorRegiao(Orcamento orcamento) {
        return orcamento.valorOcamento.multiply(new BigDecimal(val: "0.18"));
    }
}
