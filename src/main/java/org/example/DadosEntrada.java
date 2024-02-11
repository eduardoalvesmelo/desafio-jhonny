package org.example;

public class DadosEntrada {
    private String operation;
    private Double unitCost;
    private Integer quantity;

    public DadosEntrada(String operacao, Double custoUnitario, Integer quantidade) {
        this.operation = operacao;
        this.unitCost = custoUnitario;
        this.quantity = quantidade;
    }

    public DadosEntrada() {}

    public String getOperation() {
        return operation;
    }

    public Double getUnitCost() {
        return unitCost;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
