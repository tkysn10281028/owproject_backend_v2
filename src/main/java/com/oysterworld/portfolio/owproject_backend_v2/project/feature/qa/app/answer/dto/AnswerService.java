package com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.app.answer.dto;

import com.oysterworld.portfolio.owproject_backend_v2.project.feature.common.domain.user.UserId;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.answer.Answer;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.answer.AnswerId;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.answer.AnswerRepository;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.answer.validator.AnswerValidateService;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.question.QuestionId;

public class AnswerService {
    private AnswerRepository answerRepository;
    private AnswerValidateService answerValidateService;

    public void saveAnswer(AnswerRequestDto req) {
        UserId userId = new UserId(req.getUserId());
        QuestionId questionId = new QuestionId((req.getQuestionId()));
        Integer maxId = answerRepository.findMaxIdByQuestionId(questionId);
        Answer answer = new Answer(questionId, userId, req.getContent());
        answer.setId(new AnswerId(String.valueOf(maxId + 1)));
        answerValidateService.isAnswerDuplicate(answer);
        answerRepository.save(answer);
    }
}
