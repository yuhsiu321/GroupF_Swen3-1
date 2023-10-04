package at.fhtw.swen3.services.mapper;

import java.util.List;

public interface Mapper<ENTITY, DTO> {

    List<DTO> toDto(List<ENTITY> entity);

    DTO toDto(ENTITY entity);
    ENTITY toEntity(DTO dto);
}
