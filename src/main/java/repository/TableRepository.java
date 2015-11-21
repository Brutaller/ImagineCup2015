package repository;

import model.Tables;

import java.util.List;

/**
 * Created by Azat Zaripov on 21.11.2015.
 */
public interface TableRepository {

    void editInfoByTable(Tables tables);

    List getTablesByCountOfSits(int sits, List<Tables> tables);

}
