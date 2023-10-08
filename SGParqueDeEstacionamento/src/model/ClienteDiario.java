package model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table (name = "Cliente Diario")
@PrimaryKeyJoinColumn(name ="id")
public class ClienteDiario extends Cliente{

    private double taxa_hora;
    private double tempo_estadia;

    public double getTaxa_hora() {
        return taxa_hora;
    }

    public void setTaxa_hora(double taxa_hora) {
        this.taxa_hora = taxa_hora;
    }

    public double getTempo_estadia() {
        return tempo_estadia;
    }

    public void setTempo_estadia(double tempo_estadia) {
        this.tempo_estadia = tempo_estadia;
    }
    
    
}
