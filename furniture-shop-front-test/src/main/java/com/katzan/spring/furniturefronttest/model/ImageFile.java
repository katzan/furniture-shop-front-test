package com.katzan.spring.furniturefronttest.model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

import javax.persistence.ManyToMany;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.web.multipart.commons.CommonsMultipartFile;



@RooJavaBean
@RooToString
@RooJpaEntity
public class ImageFile {

	@Size(max = 20)
    private String imageName;
    
    @Size(max = 10240)
    private String description;


    @Transient
    private CommonsMultipartFile file; // added

    private String fileName; // added
    private long size; //added 
    @ManyToMany(mappedBy="imageFiles") 
    private Set<FurnitureCategory> furnitureCategories; 
    
    @ManyToMany(mappedBy="imageFiles")
    private Set<FurnitureCollection>furnitureCollections;
    
    @ManyToMany(mappedBy="imageFiles")
    private Set<FurnitureItem>furnitureItems;


    public CommonsMultipartFile getFile() {
        return file;
    }

       // save file to disk ,save filename , file size to database 
    public void setFile(CommonsMultipartFile file) {
        this.file = file;
        this.fileName = file.getOriginalFilename();
        this.size = file.getSize();
        System.out.println(" hehe  this.fileName: " + this.fileName + " ,  "
                + file.getClass().getName());

        try {
            InputStream in = file.getInputStream();
            FileOutputStream f = new FileOutputStream("/Users/alexander/Documents/STSProjects/furniture-shop-test/img/"
                    + this.getFileName() ); ///"home/alex/webapps/ROOT/img/"

            int ch = 0;
            while ((ch = in.read()) != -1) {
                f.write(ch);
            }
            f.flush();
            f.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
  }
}
