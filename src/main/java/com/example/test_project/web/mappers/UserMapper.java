package com.example.test_project.web.mappers;

import com.example.test_project.domain.user.User;
import com.example.test_project.web.dto.user.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends Mappable<User, UserDto> {
}
