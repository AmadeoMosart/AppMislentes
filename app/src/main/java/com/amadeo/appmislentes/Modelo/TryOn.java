package com.amadeo.appmislentes.Modelo;

public class TryOn {
    private String titulo;
    private String urlFotouno;
    private String urlFotodos;
    private String urlFototres;

    public TryOn() {
    }

    public TryOn(String titulo, String urlFotouno, String urlFotodos, String urlFototres) {
        this.titulo = titulo;
        this.urlFotouno = urlFotouno;
        this.urlFotodos = urlFotodos;
        this.urlFototres = urlFototres;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrlFotouno() {
        return urlFotouno;
    }

    public void setUrlFotouno(String urlFotouno) {
        this.urlFotouno = urlFotouno;
    }

    public String getUrlFotodos() {
        return urlFotodos;
    }

    public void setUrlFotodos(String urlFotodos) {
        this.urlFotodos = urlFotodos;
    }

    public String getUrlFototres() {
        return urlFototres;
    }

    public void setUrlFototres(String urlFototres) {
        this.urlFototres = urlFototres;
    }
}
