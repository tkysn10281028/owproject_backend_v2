package com.oysterworld.portfolio.owproject_backend_v2.project.feature.common.domain.user;

import java.util.List;

public interface UserRepository {
    List<User> findAll();

    User findById(UserId id);

    void save(User user);

    Boolean existsById(UserId id);

    Boolean existsByName(String name);

    Boolean existsByEmailAddress(String emailAddress);
}
