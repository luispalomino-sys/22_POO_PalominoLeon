package com.proyectocuy.model;

public class Cuy {
    private int idCuy;
    private String raza;
    private String sexo;
    private double pesoKg;
    private String estado;

    public Cuy() {}

    public Cuy(int idCuy, String raza, String sexo, double pesoKg, String estado) {
        this.idCuy = idCuy;
        this.raza = raza;
        this.sexo = sexo;
        this.pesoKg = pesoKg;
        this.estado = estado;
    }

    public int getIdCuy() { return idCuy; }
    public void setIdCuy(int idCuy) { this.idCuy = idCuy; }

    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public double getPesoKg() { return pesoKg; }
    public void setPesoKg(double pesoKg) { this.pesoKg = pesoKg; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}