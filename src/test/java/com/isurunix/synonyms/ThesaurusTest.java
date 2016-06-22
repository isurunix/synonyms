package com.isurunix.synonyms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import junit.framework.TestCase;

public class ThesaurusTest extends TestCase {
	Thesaurus th;
	
	@Override
	protected void setUp() throws Exception {
		th = new Thesaurus("Apex");
	}
	
	public void testGetSynonyms(){
		try {
			HashMap<String,ArrayList<String>> synonyms = th.getSynonyms();
			
			assertTrue(synonyms.containsKey("Apex"));
			synonyms.get("Apex").forEach(System.out::println);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
