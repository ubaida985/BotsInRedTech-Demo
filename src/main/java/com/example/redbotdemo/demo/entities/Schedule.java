package com.example.redbotdemo.demo.entities;

import java.util.HashSet;

public class Schedule {
    String time;
    HashSet<Dose> dose;

    public Schedule(String time, HashSet<Dose> dose) {
        this.time = time;
        this.dose = dose;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public HashSet<Dose> getDose() {
        return dose;
    }

    public void setDose(HashSet<Dose> dose) {
        this.dose = dose;
    }

    public Schedule() {
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((time == null) ? 0 : time.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Schedule other = (Schedule) obj;
        if (time == null) {
            if (other.time != null)
                return false;
        } else if (!time.equals(other.time))
            return false;
        return true;
    }

}
