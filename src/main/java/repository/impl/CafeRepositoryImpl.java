package repository.impl;

import model.Cafe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import repository.CafeRepositoryInterface;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
public class CafeRepositoryImpl implements CafeRepositoryInterface {
    @Autowired
    EntityManager entityManager;

    @Override
    @Transactional
    public void editInfo(Cafe cafe) {
        entityManager.merge(cafe);
    }
}
