package com.kodilla.jacoco;

public class Year {
    int giveYear;

    public Year(int year) {
        this.giveYear = year;
    }

    public boolean isLeap() {
        if (this.giveYear % 4 == 0) {
            if (this.giveYear % 100 == 0) {
                if (this.giveYear % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
