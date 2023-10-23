package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.ClienteMensal;


public class ClienteMensalDao {
    
    private EntityManager em;
    private EntityManagerFactory emf;
    
    public ClienteMensalDao(){
        emf = Persistence.createEntityManagerFactory("ParqueUP");
        em = emf.createEntityManager();
    }
    
    public ClienteMensal salvarClienteM(ClienteMensal cliente){
        
        try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
            System.out.println("Dados salvos com sucesso!");
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        
        return cliente;
    }
    
    
    public ClienteMensal pesquisar(int id) throws Exception{
        
        ClienteMensal clienteM = null;
        
        try {
            clienteM = em.find(ClienteMensal.class, id);
        } catch (Exception e) {
            throw new Exception("Nao foi localizado um Cliente com o ID informado");
        } finally {
        }
        return clienteM;
    }
    
     public void actualizar(ClienteMensal clienteM) throws Exception{
        try {
            em.getTransaction().begin();
            em.merge(clienteM);
            em.getTransaction().commit();
            System.out.println("Dados Actualizados com sucesso.");
        } catch (Exception e) {
            throw new Exception("Erro na actualizacao de dados");
        } finally {
            em.close();
        }
    }
    
    public void deletar(int id) throws Exception{
        try {
            em.getTransaction().begin();
            ClienteMensal clienteM = em.find(ClienteMensal.class, id);
            clienteM.setEstado(false);
            em.merge(clienteM);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Erro na eliminacao do veiculo");
        } finally {
            em.close();
        }
    }
    
    
}
