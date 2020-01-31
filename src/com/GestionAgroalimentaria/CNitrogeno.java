package com.GestionAgroalimentaria;

import com.sun.xml.internal.ws.util.xml.CDATA;

public class CNitrogeno extends Congelado{

    private int MCongelacion;
    private int TiempoExpo;

    public CNitrogeno(String codigo, String fechaCaducidad, int numLot, String fechaEnvasado, String paisOrigen, int TempMantenimiento, int MCongelacion, int TiempoExpo) {
        super(codigo, fechaCaducidad, numLot, fechaEnvasado, paisOrigen, TempMantenimiento);

        this.MCongelacion = MCongelacion;
        this.TiempoExpo = TiempoExpo;

    }

    public int getMCongelacion() { return MCongelacion; }

    public void setMCongelacion(int MCongelacion) { this.MCongelacion = MCongelacion; }

    public int getTiempoExpo() { return TiempoExpo; }

    public void setTiempoExpo(int tiempoExpo) { TiempoExpo = tiempoExpo; }

    @Override
    public String toString() {
        return "(CNitrogeno)" +
                super.toString() +
                ", MCongelacion = " + MCongelacion +
                ", TiempoExpo = " + TiempoExpo;
    }
}
