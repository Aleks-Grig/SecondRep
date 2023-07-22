package ru.grig.springsimple;

import java.util.ArrayList;

public class SovietWaveMusic implements Music{
    private ArrayList songs = new ArrayList();

    public SovietWaveMusic (){
        songs.add("sovietSong1");
        songs.add("sovietSong2");
        songs.add("sovietSong3");
    }
    @Override
    public ArrayList getSong() {
        return songs;
    }
}
