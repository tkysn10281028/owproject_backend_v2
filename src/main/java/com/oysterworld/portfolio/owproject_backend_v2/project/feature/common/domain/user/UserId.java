package com.oysterworld.portfolio.owproject_backend_v2.project.feature.common.domain.user;

import com.oysterworld.portfolio.owproject_backend_v2.exception.OwBlankException;
import lombok.Getter;

@Getter
public class UserId {
    private String value;

    // 引数なしのインスタンス作成不可
    private UserId() {

    }

    public UserId(String value) {
        if (value == null || value.trim().isEmpty()) {
            throw new OwBlankException.BlankValueException("UserId");
        }
    }
}
