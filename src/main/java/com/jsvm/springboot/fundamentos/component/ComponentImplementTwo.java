package com.jsvm.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplementTwo implements ComponentDependency{
    @Override
    public void saludar() {
        System.out.println("Hola Mundo Componente DOS");
    }
}
