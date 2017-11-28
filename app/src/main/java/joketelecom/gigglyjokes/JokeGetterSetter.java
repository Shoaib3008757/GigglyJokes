package joketelecom.gigglyjokes;

/**
 * Created by Hafiz Adeel on 4/21/2017.
 */

public class JokeGetterSetter {

    int emoji;
    String jokeText;

    public JokeGetterSetter(int emoji, String jokeText) {
        this.emoji = emoji;
        this.jokeText = jokeText;
    }

    public int getEmoji() {
        return emoji;
    }

    public String getJokeText() {
        return jokeText;
    }

    public void setEmoji(int emoji) {
        this.emoji = emoji;
    }

    public void setJokeText(String jokeText) {
        this.jokeText = jokeText;
    }
}
