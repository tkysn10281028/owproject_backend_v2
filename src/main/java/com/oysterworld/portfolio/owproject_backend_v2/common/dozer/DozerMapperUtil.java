package com.oysterworld.portfolio.owproject_backend_v2.common.dozer;

import com.github.dozermapper.core.CustomConverter;
import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

import java.util.HashMap;
import java.util.Map;

public class DozerMapperUtil {
    private static final Mapper mapper;

    static {
        Map<String, CustomConverter> converterMap = new HashMap<>();
        converterMap.put("noop", new NoopConverter());
        converterMap.put("id", new IdConverter());
        mapper = DozerBeanMapperBuilder.create()
                .withCustomConvertersWithIds(converterMap)
                .withMappingFiles("dozerBeanMapping.xml")
                .build();
    }

    public static <T> T map(Object source, Class<T> destinationClass) {
        return mapper.map(source, destinationClass);
    }
}
