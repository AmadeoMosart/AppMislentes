package com.amadeo.appmislentes.Modelo;

public class Tienda {
    private String presio;
    private String urlFotouno;


    public Tienda() {
    }

    public Tienda(String presio, String urlFotouno) {
        this.presio = presio;
        this.urlFotouno = urlFotouno;
    }

    public String getPresio() {
        return presio;
    }

    public void setPresio(String presio) {
        this.presio = presio;
    }

    public String getUrlFotouno() {
        return urlFotouno;
    }

    public void setUrlFotouno(String urlFotouno) {
        this.urlFotouno = urlFotouno;
    }
}
