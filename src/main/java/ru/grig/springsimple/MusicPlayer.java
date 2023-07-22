package ru.grig.springsimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;
//
//import static ru.grig.springsimple.TypeOfMusic.CLASSICAL;
//import static ru.grig.springsimple.TypeOfMusic.ROCK;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;
@Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(TypeOfMusic enumn){
        int num = new Random().nextInt(3);
        if(enumn==TypeOfMusic.CLASSICAL){
            return music1.getSong().get(num).toString();
        }
        if(enumn==TypeOfMusic.ROCK){
            return music2.getSong().get(num).toString();
        }
        return null;
    }
}
