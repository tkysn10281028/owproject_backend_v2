package com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.domain.answer;

import com.oysterworld.portfolio.owproject_backend_v2.exception.OwBlankException;
import com.oysterworld.portfolio.owproject_backend_v2.exception.OwFormatException;
import com.oysterworld.portfolio.owproject_backend_v2.project.common.domain.base.BaseId;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

@Getter
public class AnswerId  extends BaseId {

    // 引数なしのインスタンス作成不可
    private AnswerId() {

    }

    public AnswerId(String value) {
        if (value == null || value.trim().isEmpty()) {
            throw new OwBlankException.BlankValueException("AnswerId");
        }
        if (!StringUtils.isNumeric(value)) {
            throw new OwFormatException.NotNumericException("AnswerId");
        }
        this.setValue(value);
    }
}
