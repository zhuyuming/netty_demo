package com.tutorialspoint;

/**
 * Created by amanda on 15/08/16.
 */
public class TextEditor3 {
    private Person spellChecker;
    private String name;

    public Person getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(Person spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void spellCheck() {
        spellChecker.setName("456789");
        spellChecker.showName();
    }
}
