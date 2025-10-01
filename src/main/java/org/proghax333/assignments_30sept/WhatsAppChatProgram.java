package org.proghax333.assignments_30sept;

class Chat {
    public void send(String text) {
        System.out.println("Sent a message: " + text);
    }

    public void send(String text, String emoji) {
        System.out.println("Sent a message: " + text + " with emoji: " + emoji);
    }

    public void send(String text, String emoji, String gif) {
        System.out.println("Sent a message: " + text + " with emoji: " + emoji
                + " and a GIF: " + gif);
    }
}

public class WhatsAppChatProgram {
    public static void main(String[] args) {
        Chat c = new Chat();

        c.send("Hello!");
        c.send("How are you?", ":sad_face");
        c.send("Fine, thank you!", ":happy_face", "Dancing Bear");
    }
}
