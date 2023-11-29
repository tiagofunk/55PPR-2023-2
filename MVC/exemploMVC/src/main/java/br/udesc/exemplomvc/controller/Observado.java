package br.udesc.exemplomvc.controller;

import br.udesc.exemplomvc.view.Observador;
import java.util.ArrayList;
import java.util.List;

public abstract class Observado {
    
    public List< Observador > listaObservadores = new ArrayList<>();
    
    public void notificar( String modelo, String marca, int ano ){
        for( Observador o : listaObservadores ){
            o.notificar(modelo, marca, ano);
        }
    }
    
    public void adicionar( Observador obs ){
        listaObservadores.add( obs );
    }
    
    public void remover( Observador obs ){
        listaObservadores.remove( obs );
    }
    
}
