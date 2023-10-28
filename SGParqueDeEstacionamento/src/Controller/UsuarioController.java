package Controller;

import dao.UsuarioDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Usuario;
import view.TelaCadastrarUsuario;
import view.TelaLogin;
import view.TelaMenu;

public class UsuarioController {
    
    Usuario usuario = new Usuario();
    List<Usuario> listaUsuarios = new ArrayList<>();
    UsuarioDao dao = new UsuarioDao();
       
    public void login(TelaLogin log) throws Exception{
        dao.login(log.getTxtUserName().getText(), log.getTxtPassword().getText());
    }
    
    public void CadastrarUsuario(TelaCadastrarUsuario campo){
        usuario.setNome(campo.getTxtUserName().getText());
        String senha = campo.getTxtPassword().getText();
        String coSenha = campo.getTxtConPassword().getText();
        
        if(senha.equals(coSenha)){
            usuario.setPassword(senha);
        }
        
        
        listaUsuarios.add(usuario);
        dao.cadastrarUsuario(usuario);
    }
   
}
