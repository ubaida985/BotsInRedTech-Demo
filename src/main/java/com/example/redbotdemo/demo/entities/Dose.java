package com.example.redbotdemo.demo.entities;

import java.util.Objects;

public class Dose {
    private int disc;
    private int count;

    public int getDisc() {
        return disc;
    }

    public void setDisc(int disc) {
        this.disc = disc;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Dose(int disc, int count) {
        this.disc = disc;
        this.count = count;
    }

    public Dose() {
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + disc;
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
        Dose other = (Dose) obj;
        if (disc != other.disc)
            return false;
        return true;
    }

}
