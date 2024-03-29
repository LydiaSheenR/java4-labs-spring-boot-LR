package edu.cscc.java4.sbootlab;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SomeComponent {

    private String someProperty;

    public String getSomeProperty() {
        return someProperty;
    }
    @Value("${edu.cscc.java4.sbootlab.SomeComponent.someProperty}")
    public void setSomeProperty(String someProperty) {
        this.someProperty = someProperty;
    }
}
