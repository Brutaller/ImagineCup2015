package repository;

import model.Cafe;
import org.springframework.stereotype.Repository;

public interface CafeRepositoryInterface {
    void editInfo(Cafe cafe);
}
