package ru.dosport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dosport.entities.SportGround;

/**
 * Репозиторий Площадок
 */
@Repository
public interface SportGroundRepository extends JpaRepository<SportGround, Long> {
}
