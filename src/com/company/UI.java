package com.company;

import java.util.Scanner;

public class UI {

    public Choice menu(){
        System.out.println(
                "1. Add a new file\n" +
                "2. Remove a file\n" +
                "3. Edit a file\n" +
                "4. Display all files\n" +
                "5. Clear Media List\n" +
                "0. Exit"
        );

        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            choice = scanner.nextInt();
            switch(choice){
                case 1: return Choice.CREATE;
                case 2: return Choice.REMOVE;
                case 3: return Choice.UPDATE;
                case 4: return Choice.DISPLAY;
                case 5: return Choice.CLEAR;
                case 0: return Choice.EXIT;
                default:return Choice.ERROR;
            }
        }
        catch(Exception e){
            return Choice.ERROR;
        }
    }

    public void manageMediaList(MediaList mediaList){
        Choice choice;
        int id;

        do {
            choice = menu();

            switch (choice){

                case CREATE:
                    Media media = createMedia(mediaList);
                    mediaList.addMedia(media);
                    break;
                case REMOVE:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter id");
                    id = scanner.nextInt();
                    mediaList.removeMedia(id);
                    break;
                case UPDATE:
                    break;
                case DISPLAY:
                    mediaList.displayMedia();
                    break;
                case CLEAR:
                    mediaList.clearMedia();
                    break;
                case EXIT:
                    break;
                case ERROR:
                    System.out.println("You gave erroneous input");
                    break;

            }

        }while (choice != Choice.EXIT);
    }

    public Media createMedia(MediaList mediaList){
        Media media;
        Scanner scanner = new Scanner(System.in);

        int id;
        int filetype;
        String filename;
        int size;

        int resolutionHeight;
        int resolutionWidth;
        int duration;
        int fps;

        while(true){
            System.out.println("Enter File id");
            id = scanner.nextInt();
            if(mediaList.exists(id)){
                System.out.println("This id already exists");
            }
            else {
                break;
            }
        }
        do {
            System.out.println("Enter file type. 1 for image, 2 for video, 3 for audio");
            filetype = scanner.nextInt();
        }while(filetype < 1 || filetype > 3);
        System.out.println("Enter file name");
        filename = scanner.next();
        System.out.println("Enter file size");
        size = scanner.nextInt();

        switch (filetype){
            case 1:
                System.out.println("Enter img resolution height");
                resolutionHeight = scanner.nextInt();
                System.out.println("Enter img resolution width");
                resolutionWidth = scanner.nextInt();
                media = new Image(id, filetype, filename, size, resolutionHeight, resolutionWidth);
                return media;
            case 2:
                System.out.println("Enter video duration");
                duration = scanner.nextInt();
                System.out.println("Enter fps");
                fps = scanner.nextInt();
                media = new Video(id, filetype, filename, size, duration, fps);
                return media;
            case 3:
                System.out.println("Enter audio duration");
                duration = scanner.nextInt();
                media = new Audio(id, filetype, filename, size, duration);
                return media;
            default:
                return null;
        }
    }



}
