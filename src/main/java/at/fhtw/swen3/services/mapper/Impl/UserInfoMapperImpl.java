package at.fhtw.swen3.services.mapper.Impl;

import at.fhtw.swen3.persistence.entities.UserInfoEntity;
import at.fhtw.swen3.services.dto.UserInfo;
import at.fhtw.swen3.services.mapper.UserInfoMapper;
import org.springframework.stereotype.Component;

@Component
public class UserInfoMapperImpl extends AbstractMapper<UserInfoEntity, UserInfo> implements UserInfoMapper {

    @Override
    public UserInfo toDto(UserInfoEntity userInfoEntity) {
        return new UserInfo()
                .username(userInfoEntity.getUsername())
                .password(userInfoEntity.getPassword());
    }

    @Override
    public UserInfoEntity toEntity(UserInfo userInfo) {
        return UserInfoEntity.builder()
                .username(userInfo.getUsername().get()) // Assuming username is present
                .password(userInfo.getPassword().get()) // Assuming password is present
                .build();
    }
}
