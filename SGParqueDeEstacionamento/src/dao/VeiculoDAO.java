package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Veiculo;

public class VeiculoDAO {

    private EntityManager em;
    private EntityManagerFactory emf;
    
    public VeiculoDAO(){
        emf = Persistence.createEntityManagerFactory("SGParqueEstacionamentoPU");
        em = emf.createEntityManager();
    }
    
    public Veiculo salvarVeiculo(Veiculo veiculo){
        
        try {
            em.getTransaction().begin();
            em.persist(veiculo);
            em.getTransaction().commit();
            System.out.println("Dados salvos com sucesso!");
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        
        return veiculo;
    }
    
    public void actualizarVeiculo(Veiculo veiculo)throws Exception {
        try {
            
            if(!em.contains(veiculo)){
                if(em.find(Veiculo.class, veiculo.getId_veiculo()) == null){
                    throw new Exception("Erro na actualizacao de dados");
                }
            }
            em.getTransaction().begin();
            em.merge(veiculo);
            em.getTransaction().commit();
            System.out.println("Dados Actualizados com sucesso!");
        } finally {
            em.close();
        }
        
    }
    
    
}
