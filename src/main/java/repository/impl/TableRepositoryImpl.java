package repository.impl;

import model.Tables;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import repository.TableRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
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
    public void editInfoByTable(Tables tables) {
        em.merge(tables);
    }

    @Override
    public List getTablesByCountOfSits(int sits, List<Tables> tables) {
        List<Tables> result = new ArrayList<>();
        for (Tables tables1 : tables) {
            if(tables1.getNumOfSits()>=sits){
                result.add(tables1);
            }
        }
        return result;
    }

}
