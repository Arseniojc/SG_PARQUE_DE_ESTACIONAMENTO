package view;

import dao.VeiculoDAO;
import model.Veiculo;

public class Teste {
    
    public static void main(String[] args)throws Exception {
        
        Veiculo v = new Veiculo();
        
        v.setMarca("Mercedes");
        v.setCor("Preto");
        v.setMatricula("AM321");
        v.setModelo("Benz");
        v.setTipo_veiculo("Ligeiro");
        
        VeiculoDAO dao = new VeiculoDAO();        
        //dao.inserir(v);
        //v = dao.pesquisar(2);
        //v.setMarca("Toyota");
        //dao.actualizar(v);
        dao.deletar(2);
    }
}
