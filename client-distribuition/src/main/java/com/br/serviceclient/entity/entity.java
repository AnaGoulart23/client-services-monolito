package com.br.serviceclient.entity;

abstract class Entity<T, R> {
    private T entrada;
    private R original;

    public Entity(T entrada) {
        this.configura(entrada);
    }

    private void configura(T entrada) {
        this.entrada(entrada);
    }

    protected final void entrada(T entrada) {
        this.entrada = entrada;
    }

    public final void original(R original) {
        this.original = original;
    }

    protected final Boolean originalInformado() {
        return this.getOriginal() != null;
    }

    protected final R getOriginal() {
        return this.original;
    }

    public final T getEntrada() {
        return this.entrada;
    }

    public abstract R geraSaida();

}