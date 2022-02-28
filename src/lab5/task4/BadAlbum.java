package lab5.task4;

public class BadAlbum extends Album{
    @Override
    public void addSong(Song song) {
        super.getSongList().add(song);
    }
}
