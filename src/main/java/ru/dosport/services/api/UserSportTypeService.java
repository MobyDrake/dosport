package ru.dosport.services.api;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import ru.dosport.dto.SportTypeDto;
import ru.dosport.dto.UserSportTypeDto;
import ru.dosport.entities.UserSportType;

import java.util.List;

/**
 * Сервис видов спорта пользователя
 */
@Service
public interface UserSportTypeService {

    /**
     * Выдает список навыков пользователя по id
     *
     * @return список навыков пользователя
     */
    List<UserSportTypeDto> getAllDtoByUserId(Long id);

    /**
     * Выдает список навыков пользователя по аутентификации
     *
     * @return список навыков пользователя
     */
    List<UserSportTypeDto> getAllDtoByUserId(Authentication authentication);

    /**
     * Создает новый список навыков пользователя по id, если его нет
     *
     * @return список навыков пользователя по id
     */
    List<UserSportTypeDto> updateByUserId(List<UserSportTypeDto> dtoList, Authentication authentication);




//всё, что дальше, писала не я, так что хз, как это юзать
    /**
     * Найти вид спорта пользователя по идентификатору пользователя и идентификатору вида спорта
     *
     * @param userId идентификатор пользователя
     * @param sportTypeId идентификатор вида спорта
     * @return спорт пользователя или null, если репозиторий не сожержит такую запись
     */
    UserSportType findByUserIdAndSportTypeId(long userId, short sportTypeId);

    /**
     * Создать вид спорта пользователя
     *
     * @param userId логин пользователя
     * @param sportTypeId логин пользователя
     * @param level логин пользователя
     * @return новый спорт пользователя, сохраненный в репозиторий
     */
    UserSportType save(long userId, short sportTypeId, short level);

    /**
     * Изменить уровень владения пользователем видом спорта
     *
     * @param userId логин пользователя
     * @param sportTypeId логин пользователя
     * @param level логин пользователя
     * @return измененный вид спорт пользователя
     */
    UserSportType update(long userId, short sportTypeId, short level);

    /**
     * Удаление из репозитория видов спорта пользователя
     *
     * @param sportTypeId - вид спорта
     * @return false, если строк по userId не найдено
     */
    boolean deleteBySportTypeId(Authentication authentication, short sportTypeId);
}
