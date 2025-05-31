package com.oysterworld.portfolio.owproject_backend_v2.project.feature.common.domain.user;

import com.oysterworld.portfolio.owproject_backend_v2.exception.OwBlankException;
import com.oysterworld.portfolio.owproject_backend_v2.exception.OwFormatException;
import com.oysterworld.portfolio.owproject_backend_v2.project.common.domain.DomainConstants;
import com.oysterworld.portfolio.owproject_backend_v2.project.common.domain.base.BaseId;
import lombok.Getter;

import java.util.regex.Pattern;

@Getter
public class UserId extends BaseId {
    // 引数なしのインスタンス作成不可
    private UserId() {

    }

    public UserId(String value) {
        if (value == null || value.trim().isEmpty()) {
            throw new OwBlankException.BlankValueException("UserId");
        }
        if (!Pattern.compile(DomainConstants.FORMAT_USER_ID).matcher(value).matches()) {
            throw new OwFormatException.BadFormatStringException("UserId", "UUID");
        }
        this.setValue(value);
    }
}
