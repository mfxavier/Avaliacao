
package br.edu.infnet.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Hudson Schumaker
 */
public abstract class AbstractDAO<T> {

    @PersistenceContext(unitName = "Avaliacao-ejbPU")
    private EntityManager em;
    private Class<T> entityClass;

    public AbstractDAO(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public void cadastrar(T entity) {
        em.persist(entity);
    }

    public void alterar(T entity) {
        em.merge(entity);
    }

    public void excluir(T entity) {
        em.remove(em.merge(entity));
    }

    public T obter(Integer id) {
        return em.find(entityClass, id);
    }

    public List<T> listar() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return em.createQuery(cq).getResultList();
    }
}