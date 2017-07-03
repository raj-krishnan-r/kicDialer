package com.example.raj.notesdialer.modle;

import java.sql.Date;

/**
 * Created by raj on 2/7/17.
 */

public class histCont {
    String name = new String();
    String phone = new String();
    String ddate;
    String direction = new String();
    String duration;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setD(String d) {
        this.ddate = d;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }


    public String getDirection() {
        return direction;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getD() {
        return ddate;
    }

    public String getDuration() {
        return duration;
    }



}
