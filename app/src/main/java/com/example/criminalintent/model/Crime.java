package com.example.criminalintent.model;

import com.example.criminalintent.controller.utils.DateUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class Crime implements Serializable {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    /**
     * if you don't have any uuid (that means you want to create new crime) call this
     * constructor.
     */
    public Crime() {
        this(UUID.randomUUID());
//        mDate = DateUtils.getRandomDate(2000, 2020); //random date between 2000 to 2020
    }

    /**
     * if you have a uuid for crime use this constructor. (that means you don't want to create
     * a new crime).
     * @param uuid
     */
    public Crime(UUID uuid) {
        mId = uuid;
        mDate = new Date(); //current date
    }

    public Crime(UUID id, String title, Date date, boolean solved) {
        mId = id;
        mTitle = title;
        mDate = date;
        mSolved = solved;
    }

    public Crime(String title, boolean solved) {
        this();
        this.mTitle = title;
        this.mSolved = solved;
    }

    @Override
    public String toString() {
        return "Crime{" +
                "mId=" + mId +
                ", mTitle='" + mTitle + '\'' +
                ", mDate=" + mDate +
                ", mSolved=" + mSolved +
                '}';
    }
}
