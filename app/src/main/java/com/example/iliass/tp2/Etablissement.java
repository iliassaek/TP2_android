package com.example.iliass.tp2;

public class Etablissement {

    private String label ;
    private String name ;
    private int image ;

    public Etablissement(String label, String name, int img ){
        this.label= label;
        this.name= name;
        this.image=img;
    }

    public String getlabel() {
        return label;
    }

    public String getname() {
        return name;
    }

    public int getimage() {
        return image;
    }
}
