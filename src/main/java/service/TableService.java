package service;

import model.Tables;

import java.util.List;

/**
 * Created by Azat Zaripov on 20.11.2015.
 */
public interface TableService {

    void editInfoByTable(Tables tables);

    List getTablesByCountOfSits(List<Tables> list, int sits);


}
