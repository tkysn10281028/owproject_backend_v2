package com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.question;

import com.oysterworld.portfolio.owproject_backend_v2.exception.OwBlankException;
import lombok.Getter;

@Getter
public class QuestionId {
    private Integer value;

    // 引数なしのインスタンス作成不可
    private QuestionId() {

    }

    public QuestionId(Integer value) {
        if (value == null) {
            throw new OwBlankException.BlankValueException("QuestionId");
        }
    }
}
