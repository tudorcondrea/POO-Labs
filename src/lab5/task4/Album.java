package lab5.task4;

import java.util.ArrayList;
import java.util.List;

public abstract class Album {
    private List<Song> songList;

    abstract void addSong(Song song);

    public Album () {
        songList = new ArrayList<Song>();
    }

    public void removeSong() {

    }

    @Override
    public String toString() {
        String list = "";
        for (Song song : songList) {
            list += song.getName() + " ";
        }
        return list;
    }

    public List<Song> getSongList() {
        return songList;
    }
}
