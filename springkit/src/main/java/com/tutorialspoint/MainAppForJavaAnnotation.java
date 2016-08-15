package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Created by amanda on 15/08/16.
 */
public class MainAppForJavaAnnotation {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

        helloWorld.setMessage("Hello World!");
        helloWorld.getMessage();


        ApplicationContext ctx1 =
                new AnnotationConfigApplicationContext(TextEditorConfig.class);

        TextEditor te = ctx1.getBean(TextEditor.class);

        te.spellCheck();
    }
}
