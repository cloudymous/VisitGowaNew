package com.example.cloudymous.visitgowa;

/**
 * Created by Cloudymous on 18/01/2018.
 */

public class FoodList {
    private String mOutletName;
    private String mOutletCaption;

    public FoodList(String outletName, String outletCaption){
        mOutletName = outletName;
        mOutletCaption = outletCaption;
    }

    public String getOutletName(){
        return mOutletName;
    }

    public String getOutletCaption() {
        return mOutletCaption;
    }
}
