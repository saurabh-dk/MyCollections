package MyCollections;

import java.util.*;

public class MyOldHashMap<K,V> {

	List<Object> keys = new ArrayList<>();
	List<Object> values = new ArrayList<>();
	
	public Object put(K k, V v){
		
		Object temp = null;
		
		if(!keys.isEmpty() && !values.isEmpty() && keys.contains(k)){
			
			int index = keys.indexOf(k);
			keys.remove(index);
			temp = values.get(index);
			values.remove(index);
			keys.add(index, k);
			int newIndex = keys.indexOf(k);
			values.add(newIndex, v);
		
		}
		
		else{
			
			keys.add(k);
			int newIndex = keys.indexOf(k);
			values.add(newIndex, v);
			
		}
		
		return temp;
		
	}
	
	public Object remove(Object k){
		
		Object temp = null;
		int index;
		
		if(!keys.isEmpty() && keys.contains(k)){
			
			index = keys.indexOf(k);
			temp = keys.get(index);
			keys.remove(index);
			values.remove(index);
		
		}
		
		else{
			
			return null;

		}
	
		return temp;
	
	}

	public void clear(){

		keys.clear();
		values.clear();
	
	}
	
	public boolean containsKey(Object k){
		
		if(!keys.isEmpty() && keys.contains(k)){
		
			return true;
	
		}
	
		return false;
	
	}
	
	public boolean containsValue(Object v){
		
		if(!keys.isEmpty() && values.contains(v) && !values.isEmpty()){
			
			return true;
		
		}
		
		return false;
	
	}
	
	public Object get(Object k){
		
		int index;
		
		if(!keys.isEmpty() && keys.contains(k)){
			
			index = keys.indexOf(k);
			return values.get(index);
		
		}
		
		else{
			
			String s = "**No such key exists**";
			return s;

		}
	
	}
	
	public boolean isEmpty(){
		
		if(keys.isEmpty() && values.isEmpty()){
		
			return true;
			
		}
		
		return false;
		
	}
	
	public int size(){
		
		if(!keys.isEmpty() && !values.isEmpty()){
			
			return keys.size();
			
		}
		
		return 0;
		
	}
	
	@Override
	public String toString() {

		String returnString = "";

		for(int i=0;i<keys.size();i++){
			
			returnString = returnString+keys.get(i)+"="+values.get(i)+"\n ";
		
		}
		
		return returnString;
	
	}

}