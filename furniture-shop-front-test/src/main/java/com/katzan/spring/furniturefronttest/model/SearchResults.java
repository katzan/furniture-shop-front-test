package com.katzan.spring.furniturefronttest.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
//@RooJpaActiveRecord
public class SearchResults {
	
	private long resultsNumber;
	private Collection<DocFound> documents= new ArrayList();
	
	public void addDocument(DocFound document) {
		documents.add(document);
	}
	
	public void addAllDocuments(Collection foundDocs) {
		documents.addAll(foundDocs);
	}
}
