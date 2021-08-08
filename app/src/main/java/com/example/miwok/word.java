package com.example.miwok;

public class word {

    private String miwokword;
    private String englishword;
    private int imageResourceId=imageposition;

    private static final int imageposition = -1;


   public word(String miwokword,String englishword){
       this.miwokword = miwokword;
       this.englishword = englishword;
   }

    public word(String miwokword,String englishword, int imageResourceId){
        this.miwokword = miwokword;
        this.englishword = englishword;
        this.imageResourceId = imageResourceId;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getMiwokword() {
        return miwokword;
    }

    public String getEnglishword() {
        return englishword;
    }

    public boolean hasimage(){
       if(imageResourceId != -1) {
           return true;
       }
       return false;

    }
}
