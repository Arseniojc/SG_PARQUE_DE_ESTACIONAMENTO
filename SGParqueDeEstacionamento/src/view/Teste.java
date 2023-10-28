package view;

import dao.ClienteDiarioDao;
import dao.ClienteMensalDao;
import dao.VeiculoDAO;
import model.ClienteDiario;
import model.ClienteMensal;
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
        dao.inserir(v);
        //v = dao.pesquisar(2);
        //v.setMarca("Toyota");
        //dao.actualizar(v);
        //dao.deletar(2);
        //dao.listarVeiculo();
        
        
        /*
        ClienteDiario cli = new ClienteDiario();
        ClienteDiarioDao dao = new ClienteDiarioDao();
        
        cli.setEndereco("aaaa");
        cli.setNome_Cliente("Arsenio");
        cli.setTelefone(8828288);
        cli.setSexo("Masculino");
        cli.setTaxa_hora(12);
        cli.setTempo_estadia(8);
        dao.salvarClienteD(cli);

        */
        
        ClienteMensal men = new ClienteMensal();
        ClienteMensalDao daoM = new ClienteMensalDao();
        
        //men.setNome_Cliente("Beast");
        //men.setSexo("Masculino");
        //men.setTelefone(8462677);
        //men.setTaxaMensal(100);
        //men.setBonus(200);
        //daoM.salvarClienteM(men);
        
        //men = daoM.pesquisar(2);
        //men.setEndereco("Matola");
        //daoM.actualizar(men);
        daoM.deletar(5);
    }
}
