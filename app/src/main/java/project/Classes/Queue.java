package project.Classes;

import project.Interfaces.ISongList;

import java.util.ArrayList;

public class Queue implements ISongList {


    private ArrayList<Song> SongQueue = new ArrayList<Song>();

    @Override
    public ArrayList<Song> getSongList() {
        return SongQueue;
    }

    @Override
    public void addSongToList(Song song) {
        SongQueue.add(song);
    }

    @Override
    public void removeSongFromListByName(String name) {
        SongQueue.remove(name);

    }

    @Override
    public void removeSongFromListBySong(Song song) {
        SongQueue.remove(song);

    }

}
