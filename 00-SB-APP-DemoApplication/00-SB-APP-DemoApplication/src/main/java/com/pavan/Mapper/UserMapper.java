package com.pavan.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.context.annotation.Bean;

import com.pavan.DTO.UserDTO;
import com.pavan.Entity.User;


@Mapper(componentModel = "spring")
public interface UserMapper {
	

	UserDTO toDTO(User user);
	

	User toEntity(UserDTO userDTO);

	 @Mapping(target = "id", ignore = true)
	 @Mapping(target = "products", ignore = true)
	void updateEntityFromDTO(UserDTO userDTO, @MappingTarget  User existingUser);

}
