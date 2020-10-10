package ru.dosport.mappers;

import org.mapstruct.Mapper;
import ru.dosport.entities.Authority;
import ru.dosport.entities.JwtRole;

import java.util.List;

/**
 * Маппер, преобразовывающий классы Authority в JwtRole
 */
@Mapper(componentModel = "spring")
public interface AuthorityMapper {

    JwtRole authorityToJwtRole(Authority entity);

    List<JwtRole> authorityToJwtRole(List<Authority> entities);
}
