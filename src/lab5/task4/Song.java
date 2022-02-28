package lab5.task4;

public class Song {
    private String name, composer;
    private int id;

    public Song (String name, int id, String composer) {
        this.name = name;
        this.id = id;
        this.composer = composer;
    }

    public String getName() {
        return name;
    }
}
