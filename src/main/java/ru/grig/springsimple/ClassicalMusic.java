package ru.grig.springsimple;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private ArrayList songs = new ArrayList();

    public ClassicalMusic() {
        songs.add("classicalSong1");
        songs.add("classicalSong2");
        songs.add("classicalSong3");
    }

    @Override
    public ArrayList getSong() {
        return songs;
    }

}
