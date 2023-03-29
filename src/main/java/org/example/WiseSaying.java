package org.example;

public class WiseSaying {
    int id;
    String content;
    String name;
    WiseSaying(int id, String content, String name){
        this.id = id;
        this.content = content;
        this.name = name;
    }
    public int getId(){
        return this.id;
    }
    public String getContent(){
        return this.content;
    }
    public String getName(){
        return this.name;
    }
}
