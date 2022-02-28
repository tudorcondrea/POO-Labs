package lab5.task4;

public class DangerousAlbum extends Album{

    @Override
    public void addSong(Song song) {
        super.getSongList().add(song);
    }
}
