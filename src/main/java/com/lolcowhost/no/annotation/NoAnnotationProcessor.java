package com.lolcowhost.no.annotation;

import com.google.auto.service.AutoService;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;

@AutoService(Processor.class)
@SupportedSourceVersion(SourceVersion.RELEASE_11)
@SupportedAnnotationTypes("com.lolcowhost.no.annotation.NoAnnotation")
public class NoAnnotationProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        annotations.forEach(annotation -> {
            final Set<? extends Element> elements = roundEnv.getElementsAnnotatedWith(annotation);
            elements.forEach(e -> {
                if (isAnnotated(e)) {
                    processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, createErrorMessage(e));
                }
            });
        });
        return false;
    }

    private boolean isAnnotated(Element element) {
        final NoAnnotation annotation = element.getAnnotation(NoAnnotation.class);
        if (annotation.strict()) {
            return true;
        } else {
            return element.getClass().getAnnotations().length > 1;
        }
    }

    private String createErrorMessage(Element element) {
        return "Class " + element.getSimpleName() + " cannot be annotated.";
    }
}
