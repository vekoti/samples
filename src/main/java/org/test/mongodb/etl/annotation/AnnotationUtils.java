package org.test.mongodb.etl.annotation;

import java.lang.annotation.Annotation;
import java.util.Set;

import org.reflections.Reflections;

/**
 * 
 * @author vekoti
 *
 */
public class AnnotationUtils {

	/**
	 * 
	 * @param packageName
	 * @param annotationClass
	 * @return
	 */
	public static Set<Class<?>> getClassesByAnnotation(String packageName, Class<? extends Annotation> annotationClass) {
		Reflections reflections = new Reflections(packageName);
		Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(annotationClass);
		return annotated;
	}

}
