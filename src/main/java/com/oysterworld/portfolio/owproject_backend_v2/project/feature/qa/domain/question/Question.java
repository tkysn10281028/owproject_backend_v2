package com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.question;

import com.oysterworld.portfolio.owproject_backend_v2.exception.OwBlankException;
import com.oysterworld.portfolio.owproject_backend_v2.exception.OwBoundaryException;
import com.oysterworld.portfolio.owproject_backend_v2.project.common.domain.DomainConstants;
import com.oysterworld.portfolio.owproject_backend_v2.project.feature.common.domain.user.UserId;
import lombok.Getter;

@Getter
public class Question {
    private QuestionId questionId;
    private UserId userId;
    private String title;
    private String content;

    // 引数なしのインスタンス作成不可
    private Question() {

    }

    public Question(UserId userId, String title, String content) {
        // titleのバリデーション
        if (title == null || title.trim().isEmpty()) {
            throw new OwBlankException.BlankValueException("Question.title");
        }
        if (title.length() > DomainConstants.MAX_LENGTH_QUESTION_TITLE) {
            throw new OwBoundaryException.StringLenTooLongException("Question.title"
                    , DomainConstants.MAX_LENGTH_QUESTION_TITLE);
        }
        if (content == null || content.trim().isEmpty()) {
            throw new OwBlankException.BlankValueException("Question.content");
        }
        if (content.length() > DomainConstants.MAX_LENGTH_QUESTION_CONTENT) {
            throw new OwBoundaryException.StringLenTooLongException("Question.content"
                    , DomainConstants.MAX_LENGTH_QUESTION_CONTENT);
        }
    }
}
