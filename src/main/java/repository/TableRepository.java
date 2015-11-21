package repository;

import model.Table;

import java.util.Date;
import java.util.List;

/**
 * Created by Azat Zaripov on 21.11.2015.
 */
public interface TableRepository {

    void editInfoByTable(Table table);

    List getTablesByCountOfSits(int sits);

}
