package com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.question;

import com.oysterworld.portfolio.owproject_backend_v2.exception.OwBlankException;
import com.oysterworld.portfolio.owproject_backend_v2.exception.OwFormatException;
import com.oysterworld.portfolio.owproject_backend_v2.project.common.domain.base.BaseId;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

@Getter
public class QuestionId extends BaseId {
    // 引数なしのインスタンス作成不可
    private QuestionId() {

    }

    public QuestionId(String value) {
        if (value == null || value.trim().isEmpty()) {
            throw new OwBlankException.BlankValueException("QuestionId");
        }
        if (!StringUtils.isNumeric(value)) {
            throw new OwFormatException.NotNumericException("QuestionId");
        }
        this.setValue(value);
    }
}
