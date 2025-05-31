package com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.question;

import com.oysterworld.portfolio.owproject_backend_v2.project.feature.common.domain.user.UserId;

import java.util.List;

public interface QuestionRepository {
    List<Question> findAll();

    Question findById(QuestionId id);

    List<Question> findByUserId(UserId userId);

    List<Question> findByTitle(String title);

    Integer findMaxIdByUserId(UserId userId);

    void save(Question question);

    void delete(Question question);

    Boolean existsByIdAndUserId(QuestionId id, UserId userId);

    Boolean existsByTitle(String title);
}
