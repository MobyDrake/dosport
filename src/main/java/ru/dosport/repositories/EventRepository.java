package ru.dosport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dosport.entities.Event;

/**
 * Репозиторий Мероприятий
 */
@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    /*
     * СОГЛАШЕНИЕ О НАИМЕНОВАНИИ МЕТОДОВ РЕПОЗИТОРИЕВ
     * Optional<Object> findById(Long id) найти объект по параметру
     * List<Object> findAll() найти все объекты
     * List<Object> findAllByEnabled(boolean enabled) найти все объекты по параметру
     * void delete(Object object) удалить конкретный объект
     * void deleteById(Long id) удалить объект по параметру
     * void deleteAll(List<Object> objects) удалить список объектов
     * Object save(Object object) сохранить объект
     * List<Object> saveAll(List<Object> objects) сохранить список объектов
     */
}
