package com.tutorialspoint;

/**
 * Created by amanda on 15/08/16.
 */
public class TextEditor2 {
    private SpellChecker spellChecker;
    private String name;
    public void setSpellChecker( SpellChecker spellChecker ){
        this.spellChecker = spellChecker;
    }
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
