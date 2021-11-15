package com.example.ejercicios4_2;

public class Webs {
    private String url;
    private String name;
    private int id;
    private int img;

    public Webs(String url, String name, int id, int img) {
        this.url = url;
        this.name = name;
        this.id = id;
        this.img = img;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getImg() {
        return img;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
