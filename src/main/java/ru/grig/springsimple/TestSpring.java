package ru.grig.springsimple;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        ClassicalMusic classicalMusic1 = context.getBean("musicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("musicBean", ClassicalMusic.class);

        boolean comparison = classicalMusic1==classicalMusic2;

        System.out.println(classicalMusic1.getSong());
        System.out.println(comparison);
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparison = musicPlayer1==musicPlayer2;
//
//        System.out.println(comparison);
//        System.out.println(musicPlayer1);
//        System.out.println(musicPlayer2);

        context.close();
    }
}
 