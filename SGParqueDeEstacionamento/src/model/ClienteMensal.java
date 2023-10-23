package model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name ="ClienteMensal")
@PrimaryKeyJoinColumn(name = "id")
public class ClienteMensal extends Cliente{

    private double taxaMensal;
    private double bonus;

    public ClienteMensal() {
        this.setEstado(true);
    }
    

    public double getTaxaMensal() {
        return taxaMensal;
    }

    public void setTaxaMensal(double taxaMensal) {
        this.taxaMensal = taxaMensal;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    
}
