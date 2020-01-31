package com.GestionAgroalimentaria;

import com.sun.xml.internal.ws.util.xml.CDATA;

public class CAgua extends Congelado{

    private Float Salinidad;

    public CAgua(String codigo, String fechaCaducidad, int numLot, String fechaEnvasado, String paisOrigen, int TempMantenimiento, Float Salinidad) {
        super(codigo, fechaCaducidad, numLot, fechaEnvasado, paisOrigen, TempMantenimiento);

        this.Salinidad = Salinidad;

    }

    public Float getSalinidad() { return Salinidad; }

    public void setSalinidad(Float salinidad) { Salinidad = salinidad; }

    @Override
    public String toString() {
        return "(CAgua)" +
                super.toString() +
                ", Salinidad = " + Salinidad;
    }
}
