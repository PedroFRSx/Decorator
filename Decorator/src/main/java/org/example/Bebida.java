package org.example;

import org.example.PratoDecorator;

public class Bebida extends PratoDecorator {
    private float precoAdicional;

    public Bebida(Prato prato, float precoAdicional) {
        super(prato);
        this.precoAdicional = precoAdicional;
    }

    @Override
    public float getPreco() {
        return super.getPreco() + precoAdicional;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Bebida";
    }
}