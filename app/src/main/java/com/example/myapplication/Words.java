package com.example.myapplication;

public class Words {
    private String Englishword;
    private String Miwokword;
    public Words(String Englishword,String Miwokword){
        this.Englishword=Englishword;
        this.Miwokword=Miwokword;
    }

    public String getMiwokTranslation() {
        return Miwokword;
    }

    public String getDefaultTranslation() {
        return Englishword;
    }
}
