package com.tutorialspoint;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by zhuyuming on 16/8/15.
 */
public class MainApp {
    public static void main(String[] args) {
        //ApplicationContext IOC容器
//        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");

        //Bean生命周期1.
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        /**
         * FileSystemXmlApplicationContext：该容器从 XML 文件中加载已被定义的 bean。在这里，你需要提供给构造器 XML 文件的完整路径

         ClassPathXmlApplicationContext：该容器从 XML 文件中加载已被定义的 bean。在这里，你不需要提供 XML 文件的完整路径，只需正确配置 CLASSPATH 环境变量即可，因为，容器会从 CLASSPATH 中搜索 bean 配置文件。

         WebXmlApplicationContext：该容器会在一个 web 应用程序的范围内加载在 XML 文件中已被定义的 bean。
         *
         * */
       //BeanFactory IOC容器
//        XmlBeanFactory factory = new XmlBeanFactory
//                (new ClassPathResource("Beans.xml"));
//        HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
        obj.getMessage();

        //singleton 作用域 单例模式
        HelloWorldSingleton objA = (HelloWorldSingleton) context.getBean("helloWorldsingleton");
        objA.setMessage("I'm object A");
        objA.getMessage();
        HelloWorldSingleton objB = (HelloWorldSingleton) context.getBean("helloWorldsingleton");
        objB.getMessage();


        //prototype 作用域 每次新建一个bean
        HelloWorldPrototype objC = (HelloWorldPrototype) context.getBean("helloWorldprototype");
        objC.setMessage("I'm object C");
        objC.getMessage();
        HelloWorldPrototype objD = (HelloWorldPrototype) context.getBean("helloWorldprototype");
        objD.setMessage("I'm object D");
        objD.getMessage();

        //Bean生命周期2.
        context.registerShutdownHook();
    }
}
