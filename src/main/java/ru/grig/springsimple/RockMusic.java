package ru.grig.springsimple;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music{
    private ArrayList songs = new ArrayList();

    public RockMusic() {
        songs.add("rockSong1");
        songs.add("rockSong2");
        songs.add("rockSong3");
    }

    @Override
    public ArrayList getSong() {
        return songs;
    }
}
