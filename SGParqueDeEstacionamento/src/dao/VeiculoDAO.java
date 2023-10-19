package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Veiculo;

public class VeiculoDAO {

    private EntityManager em;
    private EntityManagerFactory emf;
    
    public VeiculoDAO(){
        emf = Persistence.createEntityManagerFactory("ParqueUP");
        em = emf.createEntityManager();
    }
    
    public void inserir(Veiculo veiculo){
        try {
            em.getTransaction().begin();
            em.persist(veiculo);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public void actualizar(Veiculo veiculo) throws Exception{
        try {
            em.getTransaction().begin();
            em.merge(veiculo);
            em.getTransaction().commit();
            System.out.println("Dados Actualizados com sucesso.");
        } catch (Exception e) {
            throw new Exception("Erro na actualizacao de dados");
        } finally {
            em.close();
        }
    }
    
    public Veiculo pesquisar(int id) throws Exception{
        
        Veiculo veiculo = null;
        
        try {
            veiculo = em.find(Veiculo.class, id);
        } catch (Exception e) {
            throw new Exception("Nao foi localizado um veiculo com o ID informado");
        } finally {
        }
        return veiculo;
    }
    
    public void deletar(int id) throws Exception{
        try {
            em.getTransaction().begin();
            Veiculo veiculo = em.find(Veiculo.class, id);
            veiculo.setEstado(false);
            em.merge(veiculo);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Erro na eliminacao do veiculo");
        } finally {
            em.close();
        }
    }
}
