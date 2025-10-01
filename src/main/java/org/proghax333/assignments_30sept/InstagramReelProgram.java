package org.proghax333.assignments_30sept;

class Reel {
    private String creatorName;
    private long duration;

    public Reel(String creatorName, long duration) {
        this.creatorName = creatorName;
        this.duration = duration;
    }

    public void playReel() {
        System.out.println("Playing a reel by " + creatorName + " which lasts for " +
                duration);
    }
}

public class InstagramReelProgram {
    public static void main(String[] args) {
        Reel reel1 = new Reel("Veritasium", 60);
        Reel reel2 = new Reel("Discovery", 30);

        reel1.playReel();
        reel2.playReel();
    }
}
