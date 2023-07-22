package ru.grig.springsimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
//
//import static ru.grig.springsimple.TypeOfMusic.CLASSICAL;
//import static ru.grig.springsimple.TypeOfMusic.ROCK;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private List<Music> musics;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public MusicPlayer(List<Music> musics) {
        this.musics = musics;
    }

    public String playMusic(){
        int num = new Random().nextInt(3);
        return musics.get(num).getSong().get(num).toString();
    }
}
