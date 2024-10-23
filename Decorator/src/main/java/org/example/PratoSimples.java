package org.example;

public class PratoSimples implements Prato {
    private float preco;
    private String descricao;

    public PratoSimples(float preco, String descricao) {
        this.preco = preco;
        this.descricao = descricao;
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}