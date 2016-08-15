package com.tutorialspoint;

/**
 * Created by amanda on 15/08/16.
 */
public class TextEditor4 {
    private SpellChecker spellChecker;
    private String name;
    public TextEditor4( SpellChecker spellChecker, String name ) {
        this.spellChecker = spellChecker;
        this.name = name;
    }
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    public String getName() {
        return name;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }

}
