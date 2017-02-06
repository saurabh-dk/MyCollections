package MyCollections;

public class MyHashMap<K,V> {
	private int size;
	private int initSize = 10; 
	@SuppressWarnings("unchecked")
	private MyHashMapBean<K,V>[] newInstance = new MyHashMapBean[initSize]; 
	
	public void put(K key,V value){
		boolean newElement=false;
		if(size>0){
			for (int i = 0; i < size; i++) {
				if (newInstance[i].getKey().equals(key)) {
			        newInstance[i].setValue(value);
			    }
				else{
					newInstance[size] = new MyHashMapBean<K, V>(key, value);
					newElement=true;
				}
			}
			if(newElement)
			size++;
		}
		if(size==0){
			newInstance[size] = new MyHashMapBean<K, V>(key, value);
			size++;
		}
	}
	
	public boolean remove(K key){
		for(int i=0;i<size;i++){
			if(newInstance[i].getKey().equals(key)){
				newInstance[i] = null;
				newInstance[i] = newInstance[i + 1];
				size--;
				return true;
			}
		}
		return false;
	}
	
	public V getValueOf(K key){
		for(int i=0;i<size;i++){
			if(newInstance[i].getKey().equals(key)){
				return newInstance[i].getValue();
			}
		}
		return null;
	}
	
	public K getKeyOf(V value){
		for(int i=0;i<size;i++){
			if(newInstance[i].getValue().equals(value)){
				return newInstance[i].getKey();
			}
		}
		return null;
	}
	
	public void clearAll(){
		size=0;
		newInstance=null;		
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		if(size<=0){
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String s = "";
		if(size!=0 && newInstance!=null){
			for(int i=0;i<size;i++){
				s += newInstance[i].getKey()+"="+newInstance[i].getValue()+"\n";
			}
		}
		else{
			s="'Empty MyHashMap'";
		}
		return s;
	}
}
