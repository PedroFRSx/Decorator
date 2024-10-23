package org.example;

public abstract class PratoDecorator implements Prato {
    protected Prato prato;

    public PratoDecorator(Prato prato) {
        this.prato = prato;
    }

    @Override
    public float getPreco() {
        return prato.getPreco();
    }

    @Override
    public String getDescricao() {
        return prato.getDescricao();
    }
}