package com.janlei.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * 自定义包扫描规则类
 */
public class MyTypeFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

        //获取注解类信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //获取当前正在扫描类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //获取当前类资源信息
        Resource resource = metadataReader.getResource();
        String className = classMetadata.getClassName();
//        System.out.println(className);
        if(className.contains("JLFilter")){
            return true;
        }
        return false;
    }
}
