package com.oysterworld.portfolio.owproject_backend_v2.project.feature.common.app.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String userId;
    private String name;
    private String emailAddress;
    private Integer age;
    private Boolean gender;
}
