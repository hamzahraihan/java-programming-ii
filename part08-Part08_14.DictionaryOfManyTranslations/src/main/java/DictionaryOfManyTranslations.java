/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamzah Raihan
 */
import java.util.*;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dictionaries;

    public DictionaryOfManyTranslations() {
        this.dictionaries = new HashMap<String, ArrayList<String>>();
    }

    public void add(String word, String translation) {
        this.dictionaries.putIfAbsent(word, new ArrayList<String>());

        ArrayList<String> translations = this.dictionaries.get(word);
        translations.add(translation);
    }

    public ArrayList<String> translate(String word) {
        return this.dictionaries.getOrDefault(word, new ArrayList());
    }

    public void remove(String word) {
        this.dictionaries.remove(word);
    }
}
