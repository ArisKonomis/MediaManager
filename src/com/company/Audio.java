package com.company;

public class Audio extends Media{

    private int duration;

    public Audio(int id, int filetype, String filename, int size, int duration) {
        super(id, filetype, filename, size);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Audio{" +
                "duration=" + duration +
                '}';
    }
}
