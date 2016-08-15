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

        //继承关系
        HelloWorldParent objE = (HelloWorldParent) context.getBean("helloWorldparent");
        objE.getMessage1();
        objE.getMessage2();
        HelloIndia objF = (HelloIndia) context.getBean("helloIndia");
        objF.getMessage1();
        objF.getMessage2();
        objF.getMessage3();

        //Spring 基于构造函数的依赖注入
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
        Foo foo=(Foo) context.getBean("foo");
        foo.getAll();

        //Spring 基于设值函数的依赖注入
        User user = (User)context.getBean("user") ;
        System.out.println(user) ;

        //内部 bean 为基于 setter 注入
        TextEditor1 te1 = (TextEditor1) context.getBean("textEditor1");
        te1.spellCheck();

        //注入集合
        JavaCollection jc=(JavaCollection)context.getBean("javaCollection");
        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();

        //bean自动装配byname
        TextEditor2 te2 = (TextEditor2) context.getBean("textEditor2");
        te2.spellCheck();

        //bean自动装配bytype
        TextEditor3 te3 = (TextEditor3) context.getBean("textEditor3");
        te3.spellCheck();

        //bean自动装配 构造函数
        TextEditor4 te4 = (TextEditor4) context.getBean("textEditor4");
        te4.spellCheck();

        //Bean生命周期2.
        context.registerShutdownHook();
    }
}
