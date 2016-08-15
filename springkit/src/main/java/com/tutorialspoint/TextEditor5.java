package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by amanda on 15/08/16.
 */
public class TextEditor5 {
    //去掉setter
    @Autowired
    private SpellChecker spellChecker;
    //当 Spring遇到一个在 setter 方法中使用的 @Autowired 注释，它会在方法中视图执行 byType 自动连接。
    //@Autowired
//    public void setSpellChecker( SpellChecker spellChecker ){
//        this.spellChecker = spellChecker;
//    }
    public SpellChecker getSpellChecker( ) {
        return spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }

    public TextEditor5() {
        System.out.println("Inside TextEditor constructor." );
    }

}
