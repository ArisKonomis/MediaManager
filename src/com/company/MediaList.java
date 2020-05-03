package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MediaList {

    private ArrayList<Media> mediaList = new ArrayList<>();

    public void addMedia(Media media){
        mediaList.add(media);
        saveMediaList("Media_List.txt");
    }

    public void removeMedia(int id){
        for (int i = 0; i < mediaList.size(); i++) {
            if (mediaList.get(i).getId() == id) {
                mediaList.remove(i);
                saveMediaList("Media_List.txt");
                break;
            }
        }
    }

    public void clearMedia(){
        mediaList.clear();
    }

    public void displayMedia(){
        mediaList.forEach( System.out::println );
    }

    public boolean exists(int id){
        for (Media m : mediaList) {
            if(m.getId() == id){
                return true;
            }
        }
        return false;
    }




    public void saveMediaList(String filename){
        try{
            PrintWriter printwriter = new PrintWriter(new File(filename));
            for (Media m : mediaList){
                if(m.getFiletype() == 3) {
                    printwriter.println(m.getId() + "," +
                            m.getFiletype() + "," +
                            m.getFilename() + "," +
                            m.getSize());
                }
            }
            printwriter.close();
        }
        catch(FileNotFoundException e){
            System.out.println("The file cannot be saved");
        }
    }

    public void loadMediaList(String filename){
        mediaList.clear();
        try {
            Scanner scanner = new Scanner(new File(filename));
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] words = line.split(",");
                Media product = new Audio( Integer.parseInt(words[0]), Integer.parseInt(words[1]), words[2],
                        Integer.parseInt(words[3]), 25 );
                mediaList.add(product);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
