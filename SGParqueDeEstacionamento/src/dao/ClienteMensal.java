package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ClienteMensal {
    
    private EntityManager em;
    private EntityManagerFactory emf;
    
    public ClienteMensal(){
        emf = Persistence.createEntityManagerFactory("SGParqueEstacionamentoPU");
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
}
