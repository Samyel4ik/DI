package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //  public MusicPlayer(Music music) {  <constructor-arg ref="musicBean"/> внедрение через конструктор в аppContext тег
    //    this.music = music;
    //}
    //public void setMusic(Music music) { внедрение через сеттер
    //   this.music = music;              важно название в теге и название сеттера music
    //}

    public void playMusic() {
        for (Music music : this.musicList)
            System.out.println("Playing: " + music.getSong());
    }
}
