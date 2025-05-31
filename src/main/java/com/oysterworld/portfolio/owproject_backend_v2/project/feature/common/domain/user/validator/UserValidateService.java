package com.oysterworld.portfolio.owproject_backend_v2.project.feature.common.domain.user.validator;

import com.oysterworld.portfolio.owproject_backend_v2.exception.OwDuplicateException;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.common.domain.user.User;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.common.domain.user.UserRepository;

public class UserValidateService {
    private UserRepository userRepository;

    public void isUserDuplicate(User user) {
        if (userRepository.existsById(user.getUserId())) {
            throw new OwDuplicateException.HasDuplicateDataException("User.UserId", user.getUserId().getValue());
        }
        if (userRepository.existsByName(user.getName())) {
            throw new OwDuplicateException.HasDuplicateDataException("User.name", user.getName());
        }
        if (userRepository.existsByEmailAddress(user.getEmailAddress())) {
            throw new OwDuplicateException.HasDuplicateDataException("User.emailAddress", user.getEmailAddress());
        }
    }
}
