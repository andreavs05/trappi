package com.epn.trappi.models.logistico;

import java.util.ArrayList;

public class ListaEntregas {
    private ArrayList<Entrega> entregas;

    public ListaEntregas() {
        entregas= new ArrayList<Entrega>();
    }
    
    public void aniadirEntrega(Entrega nuevo){
        entregas.add(nuevo);
    }
}