package services;

import models.RegFormData;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;


@Stateless
public class RegFormService {

    @PersistenceContext(unitName = "persistenceUnit")
    private EntityManager em;

    public List<RegFormData> getAll() {
        TypedQuery<RegFormData> query = em.createQuery("select u from RegFormData u", RegFormData.class);
        return query.getResultList();
    }

    public void submitForm(RegFormData data) {
        em.persist(data);
    }
}
