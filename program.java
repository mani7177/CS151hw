package hw3CS151;

import java.util.ArrayList;

public class program<T> implements Filter<T>{
	public static void main(String[] args) {
		String[] longStrings = null;
		int[] positiveNumber = null;
		
	}
	public static String[] filter(String[] arr, Filter<String> f) {	
		ArrayList<String> al = new ArrayList<String>();
		
		for(int i = 0; i <= arr.length -1; i++) {
			if(f.accept(arr[i])) {
				al.add(arr[i]);
			}
		}
		int num = al.size();
		String[] longStrings = new String[num]; 
		for(int j = 0; j < al.size(); j++) {
			longStrings[j] = al.get(j);
		}
		return longStrings;
	}
	
	public static int[] filter(int[] a, Filter<Integer> f) {	
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i = 0; i <= a.length -1; i++) {
			if(f.accept(a[i])) {
				al.add(a[i]);
			}
		}
		int num = al.size();
		int[] positiveNumbers = new int[num]; 
		for(int j = 0; j < al.size(); j++) {
			positiveNumbers[j] = al.get(j);
		}
		return positiveNumbers;
	}
	
	@Override
	public boolean accept(T x) {
		if(x instanceof String) {
			String temp = (String) x;
			if(temp.length() >= 9) {
				return true;
			}
		}else if(x instanceof Integer) {
			int num = (Integer) x;
			if(num >= 0) {
				return true;
			}
		}
		return false;
	}

}
