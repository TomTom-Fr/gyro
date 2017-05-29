package com.gyro.tests;

import io.realm.RealmObject;
import io.realm.annotations.Ignore;

/* DO NOT EDIT | Generated by gyro */

public class Owner extends RealmObject {

    public static class Attributes {
        private Attributes() {
            // Hide constructor
        }

        public static final String NAME = "name";
    }

    public static class Relationships {
        private Relationships() {
            // Hide constructor
        }

        public static final String SHOP = "shop";
    }

    private String name;
    @Ignore
    private Shop shop;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(final Shop shop) {
        this.shop = shop;
    }

}
