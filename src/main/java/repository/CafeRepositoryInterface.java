package repository;

import model.Cafe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface CafeRepositoryInterface{
    void editInfo(Cafe cafe);
    Cafe findOneById(Long id);
}
