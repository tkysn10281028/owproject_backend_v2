package com.oysterworld.portfolio.owproject_backend_v2.project.common.domain;

public class DomainConstants {
    // Userドメインの定数
    // 値の境界値
    public final static int MAX_LENGTH_USER_NAME = 50;
    public final static int MAX_VALUE_USER_AGE = 200;
    public final static int MIN_VALUE_USER_AGE = 0;

    // フォーマット
    public final static String FORMAT_USER_EMAILADDRESS =
            "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    public final static String FORMAT_USER_ID =
            "^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$";

    // Questionドメインの定数
    // 値の境界値
    public final static int MAX_LENGTH_QUESTION_TITLE = 100;
    public final static int MAX_LENGTH_QUESTION_CONTENT = 1000;

    // Answerドメインの定数
    // 値の境界値
    public final static int MAX_LENGTH_ANSWER_CONTENT = 2000;
}
