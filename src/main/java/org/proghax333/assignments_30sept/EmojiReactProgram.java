package org.proghax333.assignments_30sept;

abstract class Reaction {
    abstract public void react();
}

class InstagramReaction extends Reaction {
    @Override
    public void react() {
        System.out.println("❤◼ means love");
    }
}

class LinkedInReaction extends Reaction {
    @Override
    public void react() {
        System.out.println("❤◼ means support");
    }
}

public class EmojiReactProgram {
    public static void main(String[] args) {
        Reaction instagramReaction = new InstagramReaction();
        instagramReaction.react();

        Reaction linkedInReaction = new LinkedInReaction();
        linkedInReaction.react();
    }
}
