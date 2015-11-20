package service;

import model.Arm;
import model.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

/**
 * Created by Azat Zaripov on 20.11.2015.
 */
public interface TableService{

    void editInfoByTable(Table table);

    List<Table> getTablesByCountOfSits(int sits);

    boolean isEmptyByDate(Date date);

}
