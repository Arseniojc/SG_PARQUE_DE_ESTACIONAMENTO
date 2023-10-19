package model;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Estadia {
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Cliente cliente;
    private Veiculo veiculo;
    @Temporal(TemporalType.DATE)
    private LocalDateTime dataEntrada = LocalDateTime.now();
    @Temporal(TemporalType.DATE)
    private LocalDateTime dataSaida;
    private boolean estado;

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDateTime getData_entrada() {
        return dataEntrada;
    }

    public void setData_entrada(LocalDateTime data_entrada) {
        this.dataEntrada = data_entrada;
    }

    public LocalDateTime getData_saida() {
        return dataSaida;
    }

    public void setData_saida(LocalDateTime data_saida) {
        this.dataSaida = data_saida;
    }
    
    
}
