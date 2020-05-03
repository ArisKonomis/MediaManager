package com.company;

public abstract class Media {

    private int id;
    private int filetype;       //1 for image, 2 for video, 3 for audio
    private String filename;
    private int size;

    public Media(int id, int filetype, String filename, int size) {
        this.id = id;
        this.filetype = filetype;
        this.filename = filename;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFiletype() {
        return filetype;
    }

    public void setFiletype(int filetype) {
        this.filetype = filetype;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Media{" +
                "id=" + id +
                ", filetype=" + filetype +
                ", filename='" + filename + '\'' +
                ", size=" + size +
                '}';
    }
}
