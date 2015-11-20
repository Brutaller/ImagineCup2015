package service.impl;

import model.Cafe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CafeRepositoryInterface;
import repository.jpa.CafeRepositoryInterfaceJPA;
import service.CafeServiceInterface;

@Service
public class CafeServiceImpl implements CafeServiceInterface {
    @Autowired
    CafeRepositoryInterfaceJPA cafeRepositoryJPA;

    @Autowired
    CafeRepositoryInterface cafeRepository;

    @Override
    public Cafe getCafeById(Long id) {
        return cafeRepositoryJPA.findOne(id);
    }

    @Override
    public void editInfo(Cafe cafe) {
        cafeRepository.editInfo(cafe);
    }
}
