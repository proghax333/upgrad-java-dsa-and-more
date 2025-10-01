package org.proghax333.assignments_30sept;

abstract class Song {
    abstract public void play();
}

class HindiSong extends Song {
    private String name;

    public HindiSong(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Playing Hindi Song: " + name);
    }
}

class EnglishSong extends Song {
    private String name;

    public EnglishSong(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Playing English Song: " + name);
    }
}

public class SpotifyPlayilstProgram {
    public static void main(String[] args) {
        Song ambarsariya = new HindiSong("Ambarsariya");
        Song ranjhanaa = new HindiSong("Ranjhanaa");

        Song whereAreUNow = new EnglishSong("Where are U now?");
        Song callMe = new EnglishSong("Tritonal - Call Me");

        Song[] playlist = {
                ambarsariya,
                ranjhanaa,
                whereAreUNow,
                callMe
        };

        for(Song song : playlist) {
            song.play();
        }

        // aage ka code run hoga.
    }
}
