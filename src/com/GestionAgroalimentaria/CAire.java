package com.GestionAgroalimentaria;

import com.sun.xml.internal.ws.util.xml.CDATA;

import java.util.ArrayList;

public class CAire extends Congelado{

    private ComposicionAire CompAire;

    public CAire(String codigo, String fechaCaducidad, int numLot, String fechaEnvasado, String paisOrigen, int TempMantenimiento, int Nitrogeno, int Oxigeno, int CO2, int VaporAgua) {
        super(codigo, fechaCaducidad, numLot, fechaEnvasado, paisOrigen, TempMantenimiento);

        this.CompAire = new ComposicionAire(Nitrogeno, Oxigeno, CO2, VaporAgua);

    }

    public ComposicionAire getCompAire() { return CompAire; }

    public void setCompAire(ComposicionAire compAire) { CompAire = compAire; }

    @Override
    public String toString() {
        return "(CAire)" +
                super.toString() +
                ", CompAire = " + CompAire;
    }
}
