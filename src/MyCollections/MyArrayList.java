package MyCollections;

import java.util.Arrays;

public class MyArrayList<V> {

	private int size;
	private int initialSize = 10;
	private Object[] mal = new Object[initialSize];
	
	public void add(V value){
		reSize(size);
		mal[size] = value;
		size++;
	}
	
	public void add(int index, V value){
		int i = index;
		Object[] temp = new Object[mal.length];
		temp = Arrays.copyOf(mal, mal.length);
		for(i=index ; i<size ; i++){
				mal[i+1]=temp[i];
		}
		mal[index] = value;
		size++;
		//resizeAfterIndexAdd(index);
		reSize(size);
	}
	
	public void remove(int index){
		mal[index] = null;
		size--;
		resizeAfterRemove(index);
	}
	
	public void removeRange(int fIndex, int lIndex){
		if(lIndex>fIndex){
			for(int i=fIndex;i<=lIndex;i++){
				mal[i]=mal[lIndex+1];
				resizeAfterRemove(lIndex);
			}
			size -= (lIndex-fIndex)+1;
		}
	}
	
	public void clear(){
		mal=null;
	}
	
	public boolean contains(V value){
		for(int i=0;i<size;i++){
			if(mal[i].equals(value)){
				return true;
			}
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public V getValueAt(int index){
		return (V)mal[index];
	}
	
	public int indexOf(V value){
		for(int i=0;i<size;i++){
			if(mal[i].equals(value)){
				return i;
			}
		}
		return -1;
	}
	
	public int size(){
		return size;
	}
	
	public void setNewValueAt(int index, V value){
		mal[index]=value;
	}
	
	public int lastIndexOf(V value){
		for(int i=size;i>=0;i--){
			if(value.equals(mal[i])){
				return i;
			}
		}
		return -1;
	}
	
	private void resizeAfterRemove(int index){
		for (int i = index; i < size; i++) {
            mal[i] = mal[i + 1];
		}
	}
	
	private void reSize(int size){
		if(size>=initialSize)
		mal = Arrays.copyOf(mal, size+10);
	}

	@Override
	public String toString() {

		String s="";
		if(mal!=null){
			for(int i=0; i<size; i++){
				s += mal[i]+" ";
			}
		}
		else{
			s="*MyArrayList is Empty*";
		}
		return s;
	}
	
	
}
