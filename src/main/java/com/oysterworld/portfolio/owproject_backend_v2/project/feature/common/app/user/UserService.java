package com.oysterworld.portfolio.owproject_backend_v2.project.feature.common.app.user;

import com.oysterworld.portfolio.owproject_backend_v2.common.dozer.DozerMapperUtil;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.common.app.user.dto.UserDto;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.common.app.user.dto.UserRequestDto;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.common.domain.user.User;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.common.domain.user.UserId;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.common.domain.user.UserRepository;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.common.domain.user.validator.UserValidateService;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class UserService {
    private UserRepository userRepository;
    private UserValidateService userValidateService;

    public List<UserDto> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map((user) -> {
                    return DozerMapperUtil.map(user, UserDto.class);
                })
                .collect(Collectors.toList());
    }

    public UserDto getUserByUserId(String userId) {
        return DozerMapperUtil.map(userRepository.findById(new UserId(userId)), UserDto.class);
    }

    public void saveUser(UserRequestDto req) {
        String userId = UUID.randomUUID().toString();
        User user = new User(req.getName(), req.getEmailAddress(), req.getAge(), req.getGender());
        user.setId(new UserId(userId));
        userValidateService.isUserDuplicate(user);
        userRepository.save(user);
    }
}
