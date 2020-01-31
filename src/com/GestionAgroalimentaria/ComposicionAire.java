package com.GestionAgroalimentaria;

public class ComposicionAire {

    private int Nitrogeno;
    private int Oxigeno;
    private int CO2;
    private int VaporAgua;

    public ComposicionAire(int nitrogeno, int oxigeno, int CO2, int vaporAgua) {
        Nitrogeno = nitrogeno;
        Oxigeno = oxigeno;
        this.CO2 = CO2;
        VaporAgua = vaporAgua;
    }

    public int getNitrogeno() {
        return Nitrogeno;
    }

    public void setNitrogeno(int nitrogeno) { Nitrogeno = nitrogeno; }

    public int getOxigeno() { return Oxigeno; }

    public void setOxigeno(int oxigeno) { Oxigeno = oxigeno; }

    public int getCO2() { return CO2; }

    public void setCO2(int CO2) { this.CO2 = CO2; }

    public int getVaporAgua() { return VaporAgua; }

    public void setVaporAgua(int vaporAgua) { VaporAgua = vaporAgua; }

    @Override
    public String toString() {
        return "ComposicionAire" +
                "Nitrogeno = " + Nitrogeno +
                ", Oxigeno = " + Oxigeno +
                ", CO2 = " + CO2 +
                ", VaporAgua = " + VaporAgua;
    }
}
