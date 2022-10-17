package com.sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class pangram {

	
	 public static boolean checkIfPangram(String sentence) {
	      boolean arr[]=new boolean[26];
	        for(int i=0;i<sentence.length();i++){
	        	System.out.println(sentence.charAt(i));
	            arr[sentence.charAt(i)-97]=true;
	        }
	        for(int i=0;i<26;i++){
	            if(arr[i]==false){
	                return false;
	            }
	        }
	        return true;
	  }
	
public static void main(String[] args) {
	System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
	
	System.out.println("Pangram Using set : " + checkIfPangramUsingSet("%thequickbrownfoxjumpsoverthelazydog"));
	
}

public static boolean checkIfPangramUsingSet(String sentence) {
	Character[] charArray = sentence.toLowerCase().chars().mapToObj(c -> (char)c).toArray(Character[]::new);
	Set<Character> charSet = new HashSet<>(Arrays.stream(charArray).filter(isValidChar()).collect(Collectors.toSet()));

	if(charSet.size()==26) {
		return true;
		}
	return false;
		
}

private static Predicate<? super Character> isValidChar() {
	return c->(c-97)>=0 && (c-97)<26;

}

}
