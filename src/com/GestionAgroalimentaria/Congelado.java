package com.GestionAgroalimentaria;

import com.sun.xml.internal.ws.util.xml.CDATA;

public class Congelado extends Productos{

    private int TempMantenimiento;

    public Congelado(String codigo, String fechaCaducidad, int numLot, String fechaEnvasado, String paisOrigen, int TempMantenimiento) {
        super(codigo, fechaCaducidad, numLot, fechaEnvasado, paisOrigen);
        this.TempMantenimiento = TempMantenimiento;
    }

    public int getTempMantenimiento() { return TempMantenimiento; }

    public void setTempMantenimiento(int tempMantenimiento) { TempMantenimiento = tempMantenimiento; }

    @Override
    public String toString() {
        return "(Congelado)" +
                super.toString() +
                ", TempMantenimiento = " + TempMantenimiento;
    }
}
