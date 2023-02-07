package project.Classes;

public class Song{

    private String artist;
    private String song;
    private String album;
    
    public Song(String artist, String song, String album){
        this.artist = artist;
        this.song = song;
        this.album = album;
    }

    //Getters and Setters
    public String getArtist() {
        return artist;
    }
    
    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    public String getSong() {
        return song;
    }
    
    public void setSong(String song) {
        this.song = song;
    }
    
    public String getAlbum() {
        return album;
    }
    
    public void setAlbum(String album) {
        this.album = album;
    }
}
