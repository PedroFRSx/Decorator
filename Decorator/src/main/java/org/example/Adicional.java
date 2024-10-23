package org.example;

public class Adicional extends PratoDecorator {
    private float precoAdicional;

    public Adicional(Prato prato, float precoAdicional) {
        super(prato);
        this.precoAdicional = precoAdicional;
    }

    @Override
    public float getPreco() {
        return super.getPreco() + precoAdicional;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Adicional";
    }
}