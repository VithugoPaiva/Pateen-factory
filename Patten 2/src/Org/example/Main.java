package Org.example;

import Patten.CalculoPorRegiao;
import Patten.IcmsFactory;
import  modelo.Orçamento;

import java.math.BigDecimal;

public class Main {

    public static void main(String[]args){

      Orçamento orcamento = new Orçamento(new BigDecimal(val:"1000.00"), IcmsRegiao:"ICMS_MG");
        IcmsFactory icmsFactory = new IcmsFactory();
        BigDecimal resaultado = icmsFactory.getIcmsPorEstado(nomeEstasdo: "ICMS_MG").CalculoPorRegiao(orcamento);
    }
}
