package repository.impl;

import model.Cafe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import repository.CafeRepositoryInterface;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

@Repository
public class CafeRepositoryImpl implements CafeRepositoryInterface {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public void editInfo(Cafe cafe) {
        cafe = entityManager.merge(cafe);
    }


    @Override
    @Transactional
    public Cafe findOneById(Long id) {
        Query query = entityManager.createNativeQuery("SELECT * FROM cafe WHERE id = ?", Cafe.class);
        query.setParameter(1, id);
        return (Cafe) query.getSingleResult();
    }


}
