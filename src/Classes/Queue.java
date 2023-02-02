package Classes;

import Interfaces.ISongList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Queue implements ISongList {

    private ArrayList<String> queue = new ArrayList<>();

    @Override
    public ArrayList<String> getSongList() {
        return queue;
    }

    public void addToQueue() {

    }

}
