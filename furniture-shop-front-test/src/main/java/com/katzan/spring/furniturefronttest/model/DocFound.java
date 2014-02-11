package com.katzan.spring.furniturefronttest.model;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
//@RooJpaActiveRecord
public class DocFound {
	
	private String id;
	private long item_id;
	private String name;
	private String codeNumber;
	private String description;
	private String controller;
	private String foto;
	
}
