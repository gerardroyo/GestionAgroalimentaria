package com.GestionAgroalimentaria;

import com.sun.xml.internal.ws.util.xml.CDATA;

public class Refrigerado extends Productos{

    private int OrganismoSupervision;
    private int TempMantenimiento;

    public Refrigerado(String codigo, String fechaCaducidad, int numLot, String fechaEnvasado, String paisOrigen, int OrganismoSupervision, int TempMantenimiento) {
        super(codigo, fechaCaducidad, numLot, fechaEnvasado, paisOrigen);
        this.OrganismoSupervision = OrganismoSupervision;
        this.TempMantenimiento = TempMantenimiento;
    }

    public int getOrganismoSupervision() { return OrganismoSupervision; }

    public void setOrganismoSupervision(int organismoSupervision) { OrganismoSupervision = organismoSupervision; }

    public int getTempMantenimiento() { return TempMantenimiento; }

    public void setTempMantenimiento(int tempMantenimiento) { TempMantenimiento = tempMantenimiento; }

    @Override
    public String toString() { return "(Refrigerado)" + super.toString() + ", OrganismoSupervision = " + OrganismoSupervision + ", TempMantenimiento = " + TempMantenimiento;
    }
}
