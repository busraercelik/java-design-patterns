package dp.creational.builder.complex_builder_ex;

import java.util.ArrayList;

public class Architect {

    public static void main(String[] args) {
        createHouse();
        createHouse2();
        createHouse3();
    }

    private static void createHouse3() {
        ArrayList<Room> rooms = new RoomListBuilder().addList()
                .addRoom().setFloorNumber(2).addRoomToList()
                .addRoom().setFloorNumber(1).addRoomToList()
                .buildList();
        House house = new House(rooms);
    }

    private static void createHouse2() {
        // Each room created individually
        Room room1 = new RoomBuilder().setFloorNumber(2).createRoom();
        Room room2 = new RoomBuilder().setFloorNumber(1).createRoom();

        ArrayList<Room> rooms = new RoomListBuilder().addList()
                .addRoom(room1)
                .addRoom(room2)
                .buildList();
        House house = new House(rooms);
    }

    private static void createHouse() {
        // Each room created individually
        Room room1 = new RoomBuilder().setFloorNumber(2).createRoom();
        Room room2 = new RoomBuilder().setFloorNumber(1).createRoom();
        // New arraylist stores the rooms
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        House house = new House(rooms);
    }

}
