package com.example.personalbudgetingapp;

public class Data {

    String item, date,id,notes,itemInDay,itemInWeek,itemInMonth;
    int amount,week, month;

    public Data(){

    }

    public Data(String item, String date, String id, String notes, String itemINDay, String itemInWeek, String itemInMonth, int amount, int week, int month) {
        this.item = item;
        this.date = date;
        this.id = id;
        this.notes = notes;
        this.itemInDay = itemINDay;
        this.itemInWeek = itemInWeek;
        this.itemInMonth = itemInMonth;
        this.amount = amount;
        this.week = week;
        this.month = month;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getItemINDay() {
        return itemInDay;
    }

    public void setItemINDay(String itemINDay) {
        this.itemInDay = itemINDay;
    }

    public String getItemInWeek() {
        return itemInWeek;
    }

    public void setItemInWeek(String itemInWeek) {
        this.itemInWeek = itemInWeek;
    }

    public String getItemInMonth() {
        return itemInMonth;
    }

    public void setItemInMonth(String itemInMonth) {
        this.itemInMonth = itemInMonth;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}

