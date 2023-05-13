package com.cheryl.annotation;

import com.cheryl.config.VermouthProperties;
import com.cheryl.vermouth.EnableVermouthClientImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({EnableVermouthClientImportSelector.class})
public @interface EnableVermouth {
}
