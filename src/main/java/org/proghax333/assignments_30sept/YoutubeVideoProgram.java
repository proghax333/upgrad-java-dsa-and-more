package org.proghax333.assignments_30sept;

class YouTubeVideo {
    private String title;
    private long views;
    private long likes;

    public YouTubeVideo(String title, long views, long likes) {
        this.title = title;
        this.views = views;
        this.likes = likes;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getViews() {
        return views;
    }

    public void setViews(long views) {
        this.views = views;
    }

    public long getLikes() {
        return likes;
    }

    public void setLikes(long likes) {
        this.likes = likes;
    }

    public void play() {
        System.out.println("Playing: " + this.title);
    }
}

public class YoutubeVideoProgram {
    public static void main(String[] args) {
        YouTubeVideo javaTutorial = new YouTubeVideo("Java Tutorial", 0, 0);
        YouTubeVideo comedySkit = new YouTubeVideo("Comedy Skit", 0, 0);

        javaTutorial.play();

        comedySkit.play();
    }
}
