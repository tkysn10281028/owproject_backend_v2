package com.oysterworld.portfolio.owproject_backend_v2.exception;

public class OwBoundaryException extends IllegalArgumentException {
    public OwBoundaryException(String message) {
        super(message);
    }

    public static class StringLenTooLongException extends OwBoundaryException {
        public StringLenTooLongException(String itemName, Integer maxLen) {
            super(String.format("文字列が最大長を超えています. 該当項目：%s 最大長：%d", itemName, maxLen));
        }
    }

    public static class StringLenTooShortException extends OwBoundaryException {
        public StringLenTooShortException(String itemName, Integer minLen) {
            super(String.format("文字列が最小長を下回っています. 該当項目：%s 最大長：%d", itemName, minLen));
        }
    }

    public static class NumberSizeTooBigException extends OwBoundaryException {
        public NumberSizeTooBigException(String itemName, Integer maxLen) {
            super(String.format("数値が最大値を超えています. 該当項目：%s 最大値：%d", itemName, maxLen));
        }
    }

    public static class NumberSizeTooSmallException extends OwBoundaryException {
        public NumberSizeTooSmallException(String itemName, Integer minLen) {
            super(String.format("数値が最小値を下回っています. 該当項目：%s 最小値：%d", itemName, minLen));
        }
    }
}
