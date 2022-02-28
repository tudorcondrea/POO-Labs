package lab5.task4;

public class ThrillerAlbum extends Album{
    @Override
    public void addSong (Song song) {
        super.getSongList().add(song);
    }
}
