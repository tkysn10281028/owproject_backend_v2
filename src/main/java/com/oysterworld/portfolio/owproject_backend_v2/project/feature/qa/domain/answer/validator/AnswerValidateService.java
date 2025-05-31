package com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.answer.validator;

import com.oysterworld.portfolio.owproject_backend_v2.exception.OwDuplicateException;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.answer.Answer;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.answer.AnswerRepository;

public class AnswerValidateService {
    private AnswerRepository answerRepository;

    public void isAnswerDuplicate(Answer answer) {
        if (answerRepository.existsByIdAndQuestionId(answer.getId(), answer.getQuestionId())) {
            throw new OwDuplicateException.HasDuplicateDataException("Answer.AnswerId & Answer.QuestionId"
                    , answer.getId().getValue() + " & " + answer.getQuestionId());
        }
        if (answerRepository.existsByQuestionIdAndUserId(answer.getQuestionId(), answer.getUserId())) {
            throw new OwDuplicateException.HasDuplicateDataException("Answer.QuestionId & Answer.UserId"
                    , answer.getQuestionId().getValue() + " & " + answer.getUserId().getValue());
        }
    }
}
