package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.ClienteDiario;

public class ClienteDiarioDao {
    
    private EntityManager em;
    private EntityManagerFactory emf;
    
    public ClienteDiarioDao(){
        emf = Persistence.createEntityManagerFactory("ParqueUP");
        em = emf.createEntityManager();
    }
    
    public ClienteDiario salvarClienteD(ClienteDiario cliente){
        
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
}
