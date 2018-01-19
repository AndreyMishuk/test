package net.service.testjson.entity;

public class Pojo {

    private String date;
    private int exercise;
    private int type;
    private String result;
    private String comment;
    public transient long random;

    public Pojo() {
    }

    public Pojo(String date, int exercise, int type, String result, String comment) {
        this.date = date;
        this.exercise = exercise;
        this.type = type;
        this.result = result;
        this.comment = comment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getExercise() {
        return exercise;
    }

    public void setExercise(int exercise) {
        this.exercise = exercise;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    


}
