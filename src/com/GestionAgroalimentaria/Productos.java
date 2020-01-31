package com.GestionAgroalimentaria;

import com.sun.xml.internal.ws.util.xml.CDATA;

public class Productos {

    private String codigo;
    private String FechaCaducidad;
    private int NumLot;
    private String FechaEnvasado;
    private String PaisOrigen;

    public Productos(String codigo, String fechaCaducidad, int numLot, String fechaEnvasado, String paisOrigen) {
        this.codigo = codigo;
        FechaCaducidad = fechaCaducidad;
        NumLot = numLot;
        FechaEnvasado = fechaEnvasado;
        PaisOrigen = paisOrigen;
    }

    public String getCodigo() { return codigo; }

    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getFechaCaducidad() { return FechaCaducidad; }

    public void setFechaCaducidad(String fechaCaducidad) { FechaCaducidad = fechaCaducidad; }

    public int getNumLot() { return NumLot; }

    public void setNumLot(int numLot) { NumLot = numLot; }

    public String getFechaEnvasado() { return FechaEnvasado; }

    public void setFechaEnvasado(String fechaEnvasado) { FechaEnvasado = fechaEnvasado; }

    public String getPaisOrigen() { return PaisOrigen; }

    public void setPaisOrigen(String paisOrigen) { PaisOrigen = paisOrigen; }

    @Override
    public String toString() {
        return "Producto: " +
                "FechaCaducidad = " + FechaCaducidad +
                ", NumLot = " + NumLot +
                ", FechaEnvasado = " + FechaEnvasado +
                ", PaisOrigen = '" + PaisOrigen;
    }
}
