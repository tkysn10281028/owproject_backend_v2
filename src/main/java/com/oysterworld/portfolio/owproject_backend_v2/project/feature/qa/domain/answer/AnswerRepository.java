package com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.answer;

import com.oysterworld.portfolio.owproject_backend_v2.project.feature.common.domain.user.UserId;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.question.Question;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.question.QuestionId;

import java.util.List;

public interface AnswerRepository {
    List<Answer> findByQuestionList(List<Question> questionList);

    List<Answer> findByUserId(UserId userId);

    void save(Answer answer);

    Boolean existsById(AnswerId id);

    Boolean existsByQuestionIdAndUserId(QuestionId questionId, UserId userId);
}
