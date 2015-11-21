package service.impl;

import model.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import service.TableService;

import java.util.Date;
import java.util.List;

/**
 * Created by Azat Zaripov on 21.11.2015.
 */
public class TableServiceImpl implements TableService {

    @Override
    public void editInfoByTable(Table table) {

    }

    @Override
    public List getTablesByCountOfSits(int sits) {
        return null;
    }

}
