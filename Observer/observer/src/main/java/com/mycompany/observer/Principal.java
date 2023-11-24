package com.mycompany.observer;

public class Principal {

    public static void main(String[] args) throws InterruptedException {
        Controladora c = new Controladora();
        
        Janela j1 = new Janela(c);
        j1.setVisible(true);
        
        Janela j2 = new Janela(c);
        j2.setVisible(true);
        
        c.anexar(j1);
        c.anexar(j2);
        
        Thread.sleep(2000);
        c.setNumero(10);
    }
}
