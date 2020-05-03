package com.company;

public class Video extends Media{

    private int duration;
    private int fps;

    public Video(int id, int filetype, String filename, int size, int duration, int fps) {
        super(id, filetype, filename, size);
        this.duration = duration;
        this.fps = fps;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getFps() {
        return fps;
    }

    public void setFps(int fps) {
        this.fps = fps;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Video{" +
                "duration=" + duration +
                ", fps=" + fps +
                '}';
    }
}
