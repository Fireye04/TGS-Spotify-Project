package project.Interfaces;

import project.Classes.Song;

import java.util.ArrayList;

public interface ISongList {


    public ArrayList<Song> getSongList();

    public void addSongToList(Song song);

    public void removeSongFromListByName(String name);

    public void removeSongFromListBySong(Song song);

}
