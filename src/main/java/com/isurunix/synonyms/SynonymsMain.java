package com.isurunix.synonyms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;



public class SynonymsMain {

	public static void main(String[] args) {
		
		HashMap<String,ArrayList<String>> synonyms = null;
		ArrayList<String> synonymList = null;
		String[] words = new String[args.length-1];
		
		for(int i=0; i<args.length-1;i++){
			words[i]=args[i];
		}
		int limit = Integer.parseInt(args[args.length-1]);
		Thesaurus thesaurus = new Thesaurus(words);
		try{
			synonyms = thesaurus.getSynonyms();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("-----------------------------------------------------");
		for(String word : words){
			synonymList = synonyms.get(word);
			System.out.print(word+"   : ");
			for(int i=0; i< limit; i++){
				if(i==limit-1){
					System.out.print(synonymList.get(i));
				}else{
					System.out.print(synonymList.get(i)+",");
				}
			}
			System.out.println("\n-----------------------------------------------------");
		}
		
	}
}
