package view;

import dao.VeiculoDAO;
import model.Veiculo;

public class Teste {
    
    public static void main(String[] args) {
        
        Veiculo v = new Veiculo();
        Veiculo v1 = new Veiculo();
        
      //  v.setMarca("Toyota");
      //  v.setCor("Branco");
      //  v.setMatricula("AM123");
      //  v.setModelo("Corolla");
      //  v.setTipo_veiculo("Ligeiro");
        
        v1.setMarca("Ford");
        v1.setCor("Preto");
        v1.setModelo("Raptor");
        v1.setMatricula("AB123");
        v1.setTipo_veiculo("Ligeiro");
        
        VeiculoDAO dao = new VeiculoDAO();
        
      //  v = dao.salvarVeiculo(v);
        v1 = dao.salvarVeiculo(v1);
    }
}
