package com.mycompany.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observado {
    
    private List<Observador> listaObservadores = new ArrayList<>();
    
    public void anexar( Observador o ){
        listaObservadores.add(o);
    }
    
    public void desanexar( Observador o ){
        listaObservadores.remove(o);
    }
    
    public void notificar(){
        for (Observador o : listaObservadores) {
            o.notificar();
        }
    }
    
    public void notificar(int numero){
        for (Observador o : listaObservadores) {
            o.notificar(numero);
        }
    }
    
}
