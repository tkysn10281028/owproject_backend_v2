package com.oysterworld.portfolio.owproject_backend_v2.exception;

public class OwFormatException extends IllegalArgumentException {
    public OwFormatException(String message) {
        super(message);
    }

    public static class BadFormatStringException extends OwFormatException {
        public BadFormatStringException(String itemName, String formatName) {
            super(String.format("文字列の形式が指定フォーマットと一致しません. 該当項目：%s 指定形式：%s", itemName, formatName));
        }
    }
}
