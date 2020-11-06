package com.example.gson;

import com.google.gson.annotations.SerializedName;

public class family {
 @SerializedName("role")
    private String mRole;
 @SerializedName("age")
 private int mAge;

    public family(String mRole, int mAge) {
        this.mRole = mRole;
        this.mAge = mAge;
    }
}
