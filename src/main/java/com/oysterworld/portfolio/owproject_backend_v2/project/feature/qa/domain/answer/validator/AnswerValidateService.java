package com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.answer.validator;

import com.oysterworld.portfolio.owproject_backend_v2.exception.OwDuplicateException;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.common.domain.user.UserId;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.answer.Answer;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.answer.AnswerRepository;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.question.QuestionId;

public class AnswerValidateService {
    private AnswerRepository answerRepository;

    public void isAnswerDuplicate(Answer answer) {
        if (answerRepository.existsById(answer.getAnswerId())) {
            throw new OwDuplicateException.HasDuplicateDataException("Answer.AnswerId"
                    , String.valueOf(answer.getAnswerId().getValue()));
        }
        if (answerRepository.existsByQuestionIdAndUserId(answer.getQuestionId(), answer.getUserId())) {
            throw new OwDuplicateException.HasDuplicateDataException("Answer.QuestionId & Answer.UserId"
                    , concatInputValue(answer.getQuestionId(), answer.getUserId()));
        }
    }

    private String concatInputValue(QuestionId questionId, UserId userId) {
        return questionId.getValue() + " & " + userId.getValue();
    }
}
