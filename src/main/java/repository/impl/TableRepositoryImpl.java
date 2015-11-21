package repository.impl;

import model.Table;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import repository.TableRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Date;
import java.util.List;

/**
 * Created by Azat Zaripov on 21.11.2015.
 */
@Repository
@Transactional
public class TableRepositoryImpl implements TableRepository {

    @PersistenceContext
    EntityManager em;

    @Override
    public void editInfoByTable(Table table) {
        em.merge(table);
    }

    @Override
    public List getTablesByCountOfSits(int sits) {
        Query query = em.createNativeQuery("select * from tables where numofsits >= ?;");
        query.setParameter(1, sits);
        return query.getResultList();
    }

}
