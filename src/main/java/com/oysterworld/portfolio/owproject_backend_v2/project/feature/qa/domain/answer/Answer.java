package com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.answer;

import com.oysterworld.portfolio.owproject_backend_v2.exception.OwBlankException;
import com.oysterworld.portfolio.owproject_backend_v2.exception.OwBoundaryException;
import com.oysterworld.portfolio.owproject_backend_v2.project.common.domain.DomainConstants;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.common.domain.user.UserId;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.question.QuestionId;
import lombok.Getter;

@Getter
public class Answer {
    private AnswerId answerId;
    private QuestionId questionId;
    private UserId userId;
    private String content;

    // 引数なしのインスタンス作成不可
    private Answer() {

    }

    public Answer(QuestionId questionId, UserId userId, String content) {
        if (content == null || content.trim().isEmpty()) {
            throw new OwBlankException.BlankValueException("Answer.content");
        }
        if (content.length() > DomainConstants.MAX_LENGTH_ANSWER_CONTENT) {
            throw new OwBoundaryException.StringLenTooLongException("Answer.content"
                    , DomainConstants.MAX_LENGTH_ANSWER_CONTENT);
        }
    }
}
