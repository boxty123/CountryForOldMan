package com.cbnusoftandriod.countryforoldman.Entity;

public class OrderEntity {
    public static final String TABLE_NAME = "order";
    public static final String COLUMN_NAME_PRICE = "price";
    public static final String COLUMN_NAME_PHONENUMBER = "phonenumber";
    public static final String COLUMN_NAME_ADDRESS = "address";
    public static final String COLUMN_NAME_MENU = "menu";
    public static final String COLUMN_NAME_USER_REQ = "user_Req";
    public static final String COLUMN_NAME_PAY = "pay";

    public static final String SQL_CREATE_USER_TABLE =
            "CREATE TABLE " + OrderEntity.TABLE_NAME + " (" +
                    "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    OrderEntity.COLUMN_NAME_PHONENUMBER + " TEXT," +
                    OrderEntity.COLUMN_NAME_ADDRESS + " TEXT," +
                    OrderEntity.COLUMN_NAME_MENU + " TEXT," +
                    OrderEntity.COLUMN_NAME_PAY + " TEXT," +
                    OrderEntity.COLUMN_NAME_PRICE + " TEXT,"+
                    OrderEntity.COLUMN_NAME_USER_REQ + "TEXT)";

    public static final String SQL_DELETE_USER_ENTRIES =
            "DROP TABLE IF EXISTS " + TABLE_NAME;
}

