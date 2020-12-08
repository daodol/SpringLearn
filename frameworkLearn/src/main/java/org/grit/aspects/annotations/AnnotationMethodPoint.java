package org.grit.aspects.pointCuts;

import org.springframework.stereotype.Indexed;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Indexed
public @interface AnnotationMethodPoint {
    String msg() default "";

}
