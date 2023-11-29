package br.udesc.exemplomvc.controller;

import br.udesc.exemplomvc.model.Veiculo;
import java.util.ArrayList;
import java.util.List;

public class ControladoraVeiculo extends Observado {
    
    private Veiculo veiculoAtual = new Veiculo();
    private List<Veiculo> listaVeiculos = new ArrayList<>();
    
    public void salvarVeiculo( String modelo, String marca, int ano ){
        veiculoAtual.setModelo(modelo);
        veiculoAtual.setMarca(marca);
        veiculoAtual.setAno(ano);
        if(!listaVeiculos.contains(veiculoAtual)) {
            listaVeiculos.add(veiculoAtual);
        }
        veiculoAtual = new Veiculo();
    }
    
    public void cancelar(){
        veiculoAtual = new Veiculo();
    }
    
    public void excluir(){
        listaVeiculos.remove(veiculoAtual);
        this.veiculoAtual = new Veiculo();
    }
    
    public void pesquisar(String modelo){
        for(Veiculo v : listaVeiculos) {
            if(v.getModelo().equals(modelo)) {
                veiculoAtual = v;
                notificar(modelo, v.getMarca(), v.getAno());
                break;
            }
        }
    }
    
}
