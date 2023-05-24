package br.fatecrl.mvcdemo.models;

public class Bolo {

    private String tipo;
    private String recheio;
    private String cobertura;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public Bolo(String tipo, String recheio, String cobertura) {
        this.tipo = tipo;
        this.recheio = recheio;
        this.cobertura = cobertura;
    }
}
