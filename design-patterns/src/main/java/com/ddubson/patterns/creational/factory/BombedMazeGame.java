package com.ddubson.patterns.creational.factory;

import com.ddubson.patterns.creational.common.Room;
import com.ddubson.patterns.creational.common.Wall;
import com.ddubson.patterns.creational.common.BombedWall;
import com.ddubson.patterns.creational.common.RoomWithABomb;

/**
 * Created by ddubs on 12/1/2016.
 */
public class BombedMazeGame extends MazeGame {
    protected Wall makeWall() {
        return new BombedWall();
    }

    protected Room makeRoom(int roomNumber) {
         return new RoomWithABomb(roomNumber);
    }
}
