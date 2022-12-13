package org.example;

public class MusicPlayer {
    private Music music;


  //  public MusicPlayer(Music music) { // <constructor-arg ref="musicBean"/> внедрение через конструктор в аppContext тег
    //    this.music = music;
    //}
    public void setMusic(Music music) { //внедрение через сеттер
        this.music = music;             // важно название в теге и название сеттера music
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
