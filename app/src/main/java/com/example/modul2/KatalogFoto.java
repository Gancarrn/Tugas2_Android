package com.example.modul2;

public class KatalogFoto {
    private int resId;
    private String filename;


    public  KatalogFoto(int _resId, String _filename){
        resId = resId;
        filename = _filename;
    }
    public int getRestId() {
        return resId;
    }

    public void setRestId(int restId) {
        this.resId = restId;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
