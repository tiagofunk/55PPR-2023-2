package com.mycompany.observer;

public class Controladora extends Observado{
    private int numero;
    
    public void simularMudancaEstado(){
        this.notificar();
    }
    
    public void setNumero( int numero ){
        this.numero = numero;
        this.notificar(numero);
    }
    
}
