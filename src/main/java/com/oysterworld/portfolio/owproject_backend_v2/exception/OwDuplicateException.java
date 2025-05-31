package com.oysterworld.portfolio.owproject_backend_v2.exception;

public class OwDuplicateException extends IllegalArgumentException {
    public OwDuplicateException(String message) {
        super(message);
    }

    public static class HasDuplicateDataException extends OwDuplicateException {
        public HasDuplicateDataException(String itemName, String input) {
            super(String.format("重複したデータを登録することはできません. 該当項目：%s 入力値：%s", itemName, input));
        }
    }
}
