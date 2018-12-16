package org.test.mongodb.etl.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.mongodb.morphia.annotations.Entity;

@Target(TYPE)
@Retention(RUNTIME)
@Inherited
@Entity(noClassnameStored = false)
public @interface Document {

	String name() default "";

	String query() default "";
}
