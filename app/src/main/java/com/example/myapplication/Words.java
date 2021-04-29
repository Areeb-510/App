package com.example.myapplication;

public class Words {
    private String Englishword;
    private String Miwokword;
    private int audioID;
    private int ImageId;
    public Words(String Englishword,String Miwokword){
        this.Englishword=Englishword;
        this.Miwokword=Miwokword;
    }
    public Words(String Englishword,String Miwokword,int imageId,int audioID){
        this.Englishword=Englishword;
        this.Miwokword=Miwokword;
        this.audioID=audioID;
        this.ImageId=imageId;
    }
    public Words(String Englishword,String Miwokword,int ImageID){
        this.Englishword=Englishword;
        this.Miwokword=Miwokword;
        this.ImageId=ImageID;
    }


    public String getMiwokTranslation() {
        return Miwokword;
    }

    public String getDefaultTranslation() {
        return Englishword;
    }
    public int getImageID(){ return ImageId;}
    public int getaudioID() {
        return audioID;
    }
}
