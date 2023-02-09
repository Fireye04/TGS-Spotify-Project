package project.Classes;

import java.util.ArrayList;


public class Filtering {


    ArrayList<Song> filterByArtist(ArrayList<Song> songs, String artist) {
        ArrayList<Song> filteredSongs = new ArrayList<Song>();

        for (Song song : songs) {
            if (song.getArtist() == artist) {
                filteredSongs.add(song);
            }
        }

        return filteredSongs;
    }

    ArrayList<Song> filterByAlbum(ArrayList<Song> songs, String album) {
        ArrayList<Song> filteredSongs = new ArrayList<Song>();

        for (Song song : songs) {
            if (song.getAlbum() == album) {
                filteredSongs.add(song);
            }
        }

        return filteredSongs;
    }
    

    ArrayList<Song> filterBySong(ArrayList<Song> songs, String songName) {
        ArrayList<Song> filteredSongs = new ArrayList<Song>();

        for (Song song : songs) {
            if (song.getSong() == songName) {
                filteredSongs.add(song);
            }
        }

        return filteredSongs;
    }
    

}
