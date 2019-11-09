package com.spring.dependencyinject.injectSet;

import java.util.Collection;

public class SetTestBean {
    private Collection<String> values;

    public void setValues(Collection<String> values) {
        this.values = values;
    }

    public Collection<String> getValues() {
        return values;
    }
}
