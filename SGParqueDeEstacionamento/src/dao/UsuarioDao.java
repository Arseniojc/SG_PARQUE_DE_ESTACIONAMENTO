package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import model.Usuario;

public class UsuarioDao {
    
    private EntityManager em;
    private EntityManagerFactory emf;
    
    public UsuarioDao(){
        emf = Persistence.createEntityManagerFactory("ParqueUP");
        em = emf.createEntityManager();
    }
    
    public void cadastrarUsuario(Usuario usuario){
        try {
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Cadastro foi Efectuado com Sucesso!");
        } finally {
            em.close();
        }
    }
    
    public List<Usuario> listar(){
        em.getTransaction().begin();
        String jpql = "SELECT u FROM Usuario u";
        Query query = em.createQuery(jpql);
        return query.getResultList();
    }
    
    public void listarUsuarios(){
        
        for(Usuario usuarios: listar()){
            System.out.println("Marca: " + usuarios.getNome());
        }
    }
    
    public void actualizar(Usuario usuario) throws Exception{
        try {
            em.getTransaction().begin();
            em.merge(usuario);
            em.getTransaction().commit();
            System.out.println("Dados Actualizados com sucesso.");
        } catch (Exception e) {
            throw new Exception("Erro na actualizacao de dados");
        } finally {
            em.close();
        }
    }
    
    public Usuario pesquisar(String nome) throws Exception{
        
        Usuario usuario = null;
        
        try {
            usuario = em.find(Usuario.class, nome);
        } catch (Exception e) {
            throw new Exception("Nao foi localizado o Usuario com o nome Informado");
        } finally {
        }
        return usuario;
    }
    
    public void deletar(String nome) throws Exception{
        try {
            em.getTransaction().begin();
            Usuario usuario = em.find(Usuario.class, nome);
            usuario.setEstado(false);
            em.merge(usuario);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Erro na eliminacao do Usuario");
        } finally {
            em.close();
        }
    }
    
    
        public boolean login(String userName, String password) throws Exception{
        
        Usuario usuario = null;
        
        try {
            usuario = em.find(Usuario.class, userName);
            if((usuario.getNome().equalsIgnoreCase(userName)) && (usuario.getPassword().equals(password))){
                   JOptionPane.showMessageDialog(null, "Seja bem Vindo " + userName);
                   return true;
            }
            return false;
            
        } catch (Exception e) {
            throw new Exception("Nao foi localizado o Usuario com o nome Informado");
        } finally {
            em.close();
        }
    }
}
