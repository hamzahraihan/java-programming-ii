/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author Hamzah Raihan
 */
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.io.FileWriter;

public class SaveableDictionary {

    private Map<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public void add(String words, String translation) {
        this.dictionary.putIfAbsent(words, translation);
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }
        for (String translateKey : this.dictionary.keySet()) {
            if (this.dictionary.get(translateKey).contains(word)) {
                return translateKey;
            }
        }
        return null;
    }

    public void delete(String word) {
        Iterator<String> iter = this.dictionary.keySet().iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            if (this.dictionary.get(key).contains(word)) {
                iter.remove();
            }
        }
        this.dictionary.remove(word);
    }

    public boolean load() {
        try {
            List<String> filesRead = Files.lines(Path.of(file)).collect(Collectors.toList());
            filesRead.stream().map(value -> value.split(":")).forEach(value -> this.dictionary.put(value[0], value[1]));

            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

    public boolean save() {
        try {
            FileWriter fileWrite = new FileWriter(this.file);
            for (String translateKey : this.dictionary.keySet()) {
                fileWrite.write(translateKey + ":" + this.dictionary.get(translateKey) + "\n");
            }
            fileWrite.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

    }
}
