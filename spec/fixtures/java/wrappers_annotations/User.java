package com.gyro.tests;

/* DO NOT EDIT | Generated by gyro */

import java.util.Date;

import io.realm.RealmObject;

public class User extends RealmObject {

    public static final class Attributes {
        public static final String BIRTHDAY = "birthday";
        public static final String NAME = "name";

        private Attributes() {
            // Hide constructor
        }
    }

    public static final class Relationships {
        public static final String FIDELITY_CARD = "fidelityCard";

        private Relationships() {
            // Hide constructor
        }
    }

    private Date birthday;
    private String name;
    private FidelityCard fidelityCard;

    @android.support.annotation.NonNull
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(@android.support.annotation.NonNull final Date birthday) {
        this.birthday = birthday;
    }

    @android.support.annotation.NonNull
    public String getName() {
        return name;
    }

    public void setName(@android.support.annotation.NonNull final String name) {
        this.name = name;
    }

    @android.support.annotation.NonNull
    public FidelityCard getFidelityCard() {
        return fidelityCard;
    }

    public void setFidelityCard(@android.support.annotation.NonNull final FidelityCard fidelityCard) {
        this.fidelityCard = fidelityCard;
    }
}
