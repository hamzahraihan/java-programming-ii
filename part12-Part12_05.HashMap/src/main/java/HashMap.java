/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamzah Raihan
 */
public class HashMap<K, V> {

    private List<Pair<K, V>>[] values;
    private int firstFreeIndex;

    public HashMap() {
        this.values = new List[32];
        this.firstFreeIndex = 0;
    }

    public V get(K key) {
        int hashValues = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValues] == null) {
            return null;
        }

        List<Pair<K, V>> valuesAtIndex = this.values[hashValues];

        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.value(i).getKey().equals(key)) {
                return valuesAtIndex.value(i).getValue();
            }
        }
        return null;
    }

// adding a new value, 
    public void add(K key, V value) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else {
            valuesAtIndex.value(index).setValue(value);
        }
// if index substract values length is above 75% ,it will grow the array
        if (1.0 * this.firstFreeIndex / this.values.length > 0.75) {
            grow();
        }
    }

//  The first part is responsible 
//  for finding the list related to the key, 
    private List<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValues = Math.abs(key.hashCode() % values.length);
        if (values[hashValues] == null) {
            values[hashValues] = new List<>();
        }
        return values[hashValues];
    }

//  and the second part is responsible for finding the key on that list. 
    private int getIndexOfKey(List<Pair<K, V>> myList, K key) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.value(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }

// Now you can call the copy method from the grow method
    private void grow() {
        // crete a new array
        List<Pair<K, V>>[] newArray = new List[this.values.length * 2];

        for (int i = 0; i < this.values.length; i++) {
            // copy the values of the old array into the new one
            copy(newArray, i);
        }
        this.values = newArray;
    }

// When copying, the location of each key-value pair 
// is recalculated for the new array — this is done because the size of the internal array grows, 
// and we want to distribute all the key-value pairs in that array as evenly as possible.
    private void copy(List<Pair<K, V>>[] newArray, int fromIdx) {
        if (this.values[fromIdx] == null) {
            return;
        }
        for (int i = 0; i < this.values[fromIdx].size(); i++) {
            Pair<K, V> value = this.values[fromIdx].value(i);

            int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);
            if (newArray[hashValue] == null) {
                newArray[hashValue] = new List<>();
            }
            newArray[hashValue].add(value);
        }
    }
// works to remove value by key

    public V remove(K key) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        if (valuesAtIndex.size() == 0) {
            return null;
        }

        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) {
            return null;
        }
        Pair<K, V> pair = valuesAtIndex.value(index);
        valuesAtIndex.remove(pair);
        return pair.getValue();
    }
}
