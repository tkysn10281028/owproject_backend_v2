package com.oysterworld.portfolio.owproject_backend_v2.common.dozer;

import com.github.dozermapper.core.CustomConverter;

public class NoopConverter implements CustomConverter {
    @Override
    public Object convert(Object existingDestinationFieldValue, Object sourceFieldValue, Class<?> destinationClass
            , Class<?> sourceClass) {
        // フィールドを無視する
        return null;
    }
}
