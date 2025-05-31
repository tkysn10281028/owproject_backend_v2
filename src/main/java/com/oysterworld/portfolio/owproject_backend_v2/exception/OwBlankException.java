package com.oysterworld.portfolio.owproject_backend_v2.exception;

public class OwBlankException extends IllegalArgumentException {
    public OwBlankException(String message) {
        super(message);
    }

    public static class NullValueException extends OwBlankException {
        public NullValueException(String itemName) {
            super(String.format("オブジェクトにnullを設定することはできません. 該当項目：%s", itemName));
        }
    }

    public static class EmptyValueException extends OwBlankException {
        public EmptyValueException(String itemName) {
            super(String.format("文字列に空欄・nullを設定することはできません. 該当項目：%s", itemName));
        }
    }

    public static class BlankValueException extends OwBlankException {
        public BlankValueException(String itemName) {
            super(String.format("文字列に空欄・null・空文字を設定することはできません. 該当項目：%s", itemName));
        }
    }
}
