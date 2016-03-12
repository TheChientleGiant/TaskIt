package com.shomiimages.taskit;

import java.util.Date;

/**
 * Created by Justin Dean Chien on 3/12/2016.
 */
public class Task {
    private String mName;
    private Date mDueDate;
    private boolean mDone;

    public boolean isDone() {
        return mDone;
    }

    public void setDone(boolean done) {
        mDone = done;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Date getDueDate() {
        return mDueDate;
    }

    public void setDueDate(Date dueDate) {
        mDueDate = dueDate;
    }

    public String toString(){
        return mName;
    }
}
