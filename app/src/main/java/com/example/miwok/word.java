package com.example.miwok;

public class word {

    private String miwokword;
    private String englishword;
    private int imageResourceId = imageposition;
    private int audioResourceId;

    private static final int imageposition = -1;


    public word(String miwokword, String englishword, int audioResourceId) {
        this.miwokword = miwokword;
        this.englishword = englishword;
        this.audioResourceId = audioResourceId;
    }

    public word(String miwokword, String englishword, int imageResourceId, int audioResourceId) {
        this.miwokword = miwokword;
        this.englishword = englishword;
        this.imageResourceId = imageResourceId;
        this.audioResourceId = audioResourceId;
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

    public boolean hasimage() {
        if (imageResourceId != -1) {
            return true;
        }
        return false;

    }

    public int getAudioResourceId() {
        return audioResourceId;
    }

    @Override
    public String toString() {
        return "word{" +
                "miwokword='" + miwokword + '\'' +
                ", englishword='" + englishword + '\'' +
                ", imageResourceId=" + imageResourceId +
                ", audioResourceId=" + audioResourceId +
                '}';
    }
}
