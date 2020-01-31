package com.GestionAgroalimentaria;

import com.sun.xml.internal.ws.util.xml.CDATA;

public class Fresco extends Productos{

    public Fresco(String codigo, String fechaCaducidad, int numLot, String fechaEnvasado, String paisOrigen) {
        super(codigo, fechaCaducidad, numLot, fechaEnvasado, paisOrigen);
    }

    @Override
    public String toString() {
        return "(Fresco)" + super.toString() + ".";
    }
}
