package at.fhtw.swen3.services.mapper.Impl;

import at.fhtw.swen3.services.mapper.Mapper;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMapper<ENTITY, DTO> implements Mapper<ENTITY, DTO> {

    public final List<DTO> toDto(List<ENTITY> entities) {
        List<DTO> dtos = new ArrayList<>();
        entities.forEach(e -> dtos.add(toDto(e)));
        return dtos;
    }
}
