package view;

import dao.VeiculoDAO;
import model.Veiculo;

public class Teste {
    
    public static void main(String[] args) {
        
        Veiculo v = new Veiculo();
        
        v.setMarca("Toyota");
        v.setCor("Branco");
        v.setMatricula("AM123");
        v.setModelo("Corolla");
        v.setTipo_veiculo("Ligeiro");
        
        
        VeiculoDAO dao = new VeiculoDAO();
        
        v = dao.salvarVeiculo(v);
    }
}
