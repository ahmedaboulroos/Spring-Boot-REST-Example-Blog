package io.amin.blog.services.mapper;

import io.amin.blog.models.Role;
import io.amin.blog.services.dto.RoleDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RoleMapper {

    public RoleDto toDto(Role role) {
        RoleDto roleDto = new RoleDto();
        roleDto.setId(role.getId());
        roleDto.setName(role.getName());
        roleDto.setDescription(role.getDescription());
        return roleDto;
    }

    public List<RoleDto> toDtoList(List<Role> roles) {
        List<RoleDto> roleDtoList = new ArrayList<>();
        for (Role role : roles) {
            roleDtoList.add(toDto(role));
        }
        return roleDtoList;
    }

    public Role toModel(RoleDto roleDto) {
        Role role = new Role();
        role.setId(roleDto.getId());
        role.setName(roleDto.getName());
        role.setDescription(roleDto.getDescription());
        return role;
    }

}
