package com.example.tripreminderapp.database.trip;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Trip implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String name;
    private String startPoint;
    private String endPoint;
    private String date;
    private String time;
    private String workerTag;
    private String date_time;
    private String email;
    private boolean isDone;
    private boolean isCanceled;
    private double startLatitude;
    private double startLongitude;
    private double endLatitude;
    private double endLongitude;


    public Trip() {
        isDone=false;
        isCanceled=false;
    }

    public Trip(int id, String name, String startPoint, String endPoint, String date, String time, String date_time, String email, boolean isDone, boolean isCanceled, double startLatitude, double startLongitude, double endLatitude, double endLongitude) {
        this.id = id;
        this.name = name;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.date = date;
        this.time = time;
        this.date_time = date_time;
        this.email = email;
        this.isDone = isDone;
        this.isCanceled = isCanceled;
        this.startLatitude = startLatitude;
        this.startLongitude = startLongitude;
        this.endLatitude = endLatitude;
        this.endLongitude = endLongitude;
    }

    public String getWorkerTag() {
        return workerTag;
    }

    public void setWorkerTag(String workerTag) {
        this.workerTag = workerTag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public boolean isCanceled() {
        return isCanceled;
    }

    public void setCanceled(boolean canceled) {
        isCanceled = canceled;
    }

    public double getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(double startLatitude) {
        this.startLatitude = startLatitude;
    }

    public double getStartLongitude() {
        return startLongitude;
    }

    public void setStartLongitude(double startLongitude) {
        this.startLongitude = startLongitude;
    }

    public double getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(double endLatitude) {
        this.endLatitude = endLatitude;
    }

    public double getEndLongitude() {
        return endLongitude;
    }

    public void setEndLongitude(double endLongitude) {
        this.endLongitude = endLongitude;
    }
}

