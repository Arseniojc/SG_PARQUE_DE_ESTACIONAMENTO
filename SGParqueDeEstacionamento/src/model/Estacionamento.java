package model;

public class Estacionamento {
    
    private int capacidadeMaxima;
    private int vagasDisponiveis;
    private double taxaEstacionamento;
    private boolean estado;

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public void setVagasDisponiveis(int vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }

    public double getTaxaEstacionamento() {
        return taxaEstacionamento;
    }

    public void setTaxaEstacionamento(double taxaEstacionamento) {
        this.taxaEstacionamento = taxaEstacionamento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
    public static void registarEntrada(){
    
    }
    
    public static void registrarSaida(){
    
    }
    
    
}
