package com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.question.validator;

import com.oysterworld.portfolio.owproject_backend_v2.exception.OwDuplicateException;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.question.Question;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.question.QuestionRepository;

public class QuestionValidateService {
    private QuestionRepository questionRepository;

    public void isQuestionDuplicate(Question question) {
        if (questionRepository.existsById(question.getId())) {
            throw new OwDuplicateException.HasDuplicateDataException("Question.QuestionId"
                    , String.valueOf(question.getId().getValue()));
        }
        if (questionRepository.existsByTitle(question.getTitle())) {
            throw new OwDuplicateException.HasDuplicateDataException("Question.title", question.getTitle());
        }
    }
}
