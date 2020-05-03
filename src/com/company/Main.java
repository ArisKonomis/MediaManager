package com.company;

public class Main {

    public static void main(String[] args) {

        UI ui = new UI();
        MediaList mediaList = new MediaList();
        mediaList.loadMediaList("Media_List.txt");
        ui.manageMediaList(mediaList);

    }
}
