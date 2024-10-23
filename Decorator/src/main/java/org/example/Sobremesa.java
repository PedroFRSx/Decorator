package org.example;

public class Sobremesa extends PratoDecorator {
    private float precoAdicional;

    public Sobremesa(Prato prato, float precoAdicional) {
        super(prato);
        this.precoAdicional = precoAdicional;
    }

    @Override
    public float getPreco() {
        return super.getPreco() + precoAdicional;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Sobremesa";
    }
}