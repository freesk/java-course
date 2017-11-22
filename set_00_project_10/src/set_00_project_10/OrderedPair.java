package set_00_project_10;

import set_00_project_10.Pair;

public class OrderedPair<K, V> implements Pair<K, V> {

	private K key;
    private V value;
	
    public OrderedPair(K key, V value) {
    	this.key = key;
    	this.value = value;
    }
	
	public K getKey() { 
		return key; 
	}
    public V getValue() { 
    	return value; 
    }

}
