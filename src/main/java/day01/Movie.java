package day01;

import java.time.LocalDateTime;

public class Movie {

    String title;
    List<LocalDateTime> onScreen;

    public Movie(String title, LocalDateTime playTime) {
        this.title = title;
        this.onScreen = playTime;
    }


    public String getTitle() {
        return title;
    }

    public LocalDateTime getPlayTime() {
        return onScreen;
    }
}
