package com.example.testnews;

public class data {
    private String mSectionName;
   private String mTitle;
    private String mPillarName;
   // private String mDate;
    //private String mType;

    public String getmTitle() {
        return mTitle;
    }

    public String getmSectionName() {
        return mSectionName;
    }

//    public String getTitle() {
//        return mTitle;
//    }

    public String getPillarName() {
        return mPillarName;
    }

//    public String getDate() {
//        return mDate;
//    }

//    public String getType() {
//        return mType;
//    }

//    public data(String SectionName, String Title, String PillarName, String Date, String Type) {
//        this.mSectionName = SectionName;
//        this.mTitle = Title;
//        this.mPillarName = PillarName;
//        this.mDate = Date;
//        this.mType = Type;
//    }


    public data(String mSectionName, String mTitle, String mPillarName) {
        this.mSectionName = mSectionName;
        this.mTitle = mTitle;
        this.mPillarName = mPillarName;
    }
}
