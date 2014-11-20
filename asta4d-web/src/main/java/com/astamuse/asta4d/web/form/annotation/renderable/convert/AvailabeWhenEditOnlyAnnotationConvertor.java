package com.astamuse.asta4d.web.form.annotation.renderable.convert;

import java.lang.annotation.Annotation;

import com.astamuse.asta4d.util.annotation.AnnotationConvertor;
import com.astamuse.asta4d.web.form.annotation.FormField;
import com.astamuse.asta4d.web.form.annotation.renderable.AvailableWhenEditOnly;
import com.astamuse.asta4d.web.form.field.FormFieldValueRenderer;
import com.astamuse.asta4d.web.form.field.impl.AvailableWhenEditOnlyRenderer;

public class AvailabeWhenEditOnlyAnnotationConvertor implements AnnotationConvertor<AvailableWhenEditOnly, FormField> {
    @Override
    public FormField convert(final AvailableWhenEditOnly originalAnnotation) {
        return new FormField() {

            @Override
            public Class<? extends Annotation> annotationType() {
                return FormField.class;
            }

            @Override
            public String name() {
                return originalAnnotation.selector();
            }

            @Override
            public Class<? extends FormFieldValueRenderer> fieldValueRenderer() {
                return AvailableWhenEditOnlyRenderer.class;
            }

            @Override
            public String editSelector() {
                return originalAnnotation.selector();
            }

            @Override
            public String displaySelector() {
                return originalAnnotation.selector();
            }

            @Override
            public String nameLabel() {
                return "";
            }

            @Override
            public String message() {
                return "";
            }
        };
    }

}