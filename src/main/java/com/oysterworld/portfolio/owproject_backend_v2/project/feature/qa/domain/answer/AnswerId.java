package com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.answer;

import com.oysterworld.portfolio.owproject_backend_v2.exception.OwBlankException;
import lombok.Getter;

@Getter
public class AnswerId {
    private Integer value;

    // 引数なしのインスタンス作成不可
    private AnswerId() {

    }

    public AnswerId(Integer value) {
        if (value == null) {
            throw new OwBlankException.BlankValueException("AnswerId");
        }
    }
}
