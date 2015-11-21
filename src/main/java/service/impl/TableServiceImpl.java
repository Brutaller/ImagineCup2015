package service.impl;

import model.Tables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TableRepository;
import service.TableService;

import java.util.List;

@Service
public class TableServiceImpl implements TableService {

    @Autowired
    TableRepository repository;

    @Override
    public void editInfoByTable(Tables tables) {
        repository.editInfoByTable(tables);
    }

    @Override
    public List getTablesByCountOfSits(List<Tables> list, int sits) {
        return repository.getTablesByCountOfSits(sits,list);
    }

}
