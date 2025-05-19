package com.oysterworld.portfolio.owproject_backend_v2.common;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

public class DozerMapperUtil {
    private static final Mapper mapper;
    static {
        mapper = DozerBeanMapperBuilder.create()
                .withMappingFiles("dozerBeanMapping.xml")
                .build();
    }

    public static <T> T map(Object source, Class<T> destinationClass) {
        return mapper.map(source, destinationClass);
    }
}
