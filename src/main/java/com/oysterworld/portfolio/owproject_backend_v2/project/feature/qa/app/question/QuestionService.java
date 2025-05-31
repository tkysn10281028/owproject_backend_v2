package com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.app.question;

import com.oysterworld.portfolio.owproject_backend_v2.project.feature.common.domain.user.UserId;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.app.question.dto.QuestionRequestDto;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.question.Question;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.question.QuestionId;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.question.QuestionRepository;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.question.validator.QuestionValidateService;

public class QuestionService {
    private QuestionRepository questionRepository;
    private QuestionValidateService questionValidateService;

    public void saveQuestion(QuestionRequestDto req) {
        UserId userId = new UserId(req.getUserId());
        Integer maxId = questionRepository.findMaxIdByUserId(userId);
        Question question = new Question(userId, req.getTitle(), req.getContent());
        question.setId(new QuestionId(String.valueOf(maxId + 1)));
        questionValidateService.isQuestionDuplicate(question);
        questionRepository.save(question);
    }
}
