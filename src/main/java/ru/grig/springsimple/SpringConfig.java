package ru.grig.springsimple;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
//@ComponentScan("ru.grig.springsimple")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public SovietWaveMusic sovietWaveMusic(){
        return new SovietWaveMusic();
    }
    @Bean
    public List getMusics(){
        List<Music> list = new ArrayList();
        list.add(sovietWaveMusic());
        list.add(classicalMusic());
        list.add(rockMusic());
        return list;
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(getMusics());
    }
    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
