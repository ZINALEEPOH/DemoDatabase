package com.example.demodatabase;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class Task {
    private int id;
    private String description;
    private String date;

    public static ArrayList<Task> tasks=new ArrayList<>();

    public Task(int id, String description, String date) {
        this.id = id;
        this.description = description;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    @NonNull
    @Override
    public String toString() {
        return id + "\n" + description + "\n" + date;
    }
}
