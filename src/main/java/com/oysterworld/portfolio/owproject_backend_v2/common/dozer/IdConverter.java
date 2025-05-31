package com.oysterworld.portfolio.owproject_backend_v2.common.dozer;

import com.github.dozermapper.core.CustomConverter;
import com.oysterworld.portfolio.owproject_backend_v2.project.common.domain.base.BaseId;

public class IdConverter implements CustomConverter {
    @Override
    public String convert(Object existingDestinationFieldValue, Object sourceFieldValue, Class<?> destinationClass
            , Class<?> sourceClass) {
        if (sourceFieldValue == null) {
            return null;
        }
        if (!(sourceFieldValue instanceof BaseId sourceId)) {
            return null;
        }
        return sourceId.getValue();
    }
}
