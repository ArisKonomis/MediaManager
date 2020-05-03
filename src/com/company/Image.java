package com.company;

public class Image extends Media{

    private int resolutionHeight;
    private int resolutionWidth;

    public Image(int id, int filetype, String filename, int size, int resolutionHeight, int resolutionWidth) {
        super(id, filetype, filename, size);
        this.resolutionHeight = resolutionHeight;
        this.resolutionWidth = resolutionWidth;
    }

    public int getResolutionHeight() {
        return resolutionHeight;
    }

    public void setResolutionHeight(int resolutionHeight) {
        this.resolutionHeight = resolutionHeight;
    }

    public int getResolutionWidth() {
        return resolutionWidth;
    }

    public void setResolutionWidth(int resolutionWidth) {
        this.resolutionWidth = resolutionWidth;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Image{" +
                "resolutionHeight=" + resolutionHeight +
                ", resolutionWidth=" + resolutionWidth +
                '}';
    }
}
