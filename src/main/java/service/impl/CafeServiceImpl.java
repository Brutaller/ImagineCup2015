package service.impl;

import model.Cafe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CafeRepositoryInterface;
import service.CafeServiceInterface;

@Service
public class CafeServiceImpl implements CafeServiceInterface {
    @Autowired
    CafeRepositoryInterface cafeRepository;

    @Override
    public Cafe getCafeById(Long id) {
        return (Cafe) cafeRepository.findOneById(id);
    }

    @Override
    public void editInfo(Cafe cafe) {
        cafeRepository.editInfo(cafe);
    }
}
