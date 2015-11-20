package repository.jpa;

import model.Cafe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CafeRepositoryInterfaceJPA extends JpaRepository<Cafe, Long> {
    public Cafe FindOneById(Long id);
}
