package com.oysterworld.portfolio.owproject_backend_v2.project.feature.common.domain.user;

import com.oysterworld.portfolio.owproject_backend_v2.exception.OwBlankException;
import com.oysterworld.portfolio.owproject_backend_v2.exception.OwBoundaryException;
import com.oysterworld.portfolio.owproject_backend_v2.exception.OwFormatException;
import com.oysterworld.portfolio.owproject_backend_v2.project.common.domain.DomainConstants;
import lombok.Getter;
import lombok.Setter;

import java.util.regex.Pattern;

@Getter
public class User {
    @Setter
    private UserId id;
    private String name;
    private String emailAddress;
    private Integer age;
    private Boolean gender;

    // 引数なしのインスタンス作成不可
    private User() {
    }

    public User(String name, String emailAddress, Integer age, Boolean gender) {
        // nameのバリデーション
        if (name == null || name.trim().isEmpty()) {
            throw new OwBlankException.BlankValueException("User.name");
        }
        if (name.length() > DomainConstants.MAX_LENGTH_USER_NAME) {
            throw new OwBoundaryException.StringLenTooLongException("User.name", DomainConstants.MAX_LENGTH_USER_NAME);
        }
        // emailAddressのバリデーション
        if (emailAddress == null || emailAddress.trim().isEmpty()) {
            throw new OwBlankException.BlankValueException("User.emailAddress");
        }
        if (!Pattern.compile(DomainConstants.FORMAT_USER_EMAILADDRESS).matcher(emailAddress).matches()) {
            throw new OwFormatException.BadFormatStringException("User.emailAddress", "メールアドレス");
        }
        // ageのバリデーション
        if (age == null) {
            throw new OwBlankException.NullValueException("User.age");
        }
        if (age > DomainConstants.MAX_VALUE_USER_AGE) {
            throw new OwBoundaryException.NumberSizeTooBigException("User.age", DomainConstants.MAX_VALUE_USER_AGE);
        }
        if (age < DomainConstants.MIN_VALUE_USER_AGE) {
            throw new OwBoundaryException.NumberSizeTooSmallException("User.age", DomainConstants.MIN_VALUE_USER_AGE);
        }
        // genderのバリデーション
        if (gender == null) {
            throw new OwBlankException.NullValueException("User.gender");
        }
        this.name = name;
        this.emailAddress = emailAddress;
        this.age = age;
        this.gender = gender;
    }
}
