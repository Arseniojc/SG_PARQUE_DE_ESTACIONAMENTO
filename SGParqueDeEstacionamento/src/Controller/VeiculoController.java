package Controller;

import dao.VeiculoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Veiculo;
import view.TelaCadastrarUsuario;
import view.TelaCadastroVeiculo;

public class VeiculoController {
    
    List<Veiculo> listaVeiculos = new ArrayList<>();
    Veiculo veiculo = new Veiculo();
    VeiculoDAO dao = new VeiculoDAO();
    TelaCadastroVeiculo campo = new TelaCadastroVeiculo();
    
      // Metodo para Pegar dados da Interface        
        private void adicionarIteins(){
            veiculo.setCor(campo.getTxtCor().getText());
            veiculo.setMarca(campo.getTxtMarca().getText());
            veiculo.setMatricula(campo.getTxtMarca().getText());
            veiculo.setModelo(campo.getTxtModelo().getText());
            veiculo.setTipo_veiculo((String) campo.getCombTipoVeiculos().getSelectedItem());
            listaVeiculos.add(veiculo);
            
        }
        
        // Metodo para adicionar dados na base de dados
        private void adicionarDB(){
            listaVeiculos.forEach(e->{
                dao.inserir(e);
            });
        }
        
        //Metodo para adicionar dados na Tabela da Interface
        private void adicionarTabela(){
            
            DefaultTableModel modelo = (DefaultTableModel)campo.getTabela().getModel();
            modelo.setRowCount(0);
            listaVeiculos.forEach(e->{
                    modelo.addRow(new Object[]{
                    e.getMarca(),
                    e.getModelo(),
                    e.getMatricula(),
                    e.getCor(),
                    e.getTipo_veiculo()
                });
            });
        }

}
