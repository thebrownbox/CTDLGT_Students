package FinalTest;

import java.util.*;

public class Quang_841 {
    public static void main(String[] args) {
        List<List<Integer>> rooms = new ArrayList<>();
        List<Integer> room0 = new ArrayList<>();
        room0.add(1);

        List<Integer> room1 = new ArrayList<>();
        room1.add(2);

        List<Integer> room2 = new ArrayList<>();
        room1.add(3);

        List<Integer> room3 = new ArrayList<>();

        rooms.add(room0);
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        System.out.println(canVisitAllRooms(rooms));

    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited.add(0);

        BFS(rooms, queue, visited);
        if(rooms.size() == visited.size()) return true;
        return false;
    }

    public static void BFS(List<List<Integer>> rooms, Queue<Integer> queue, Set<Integer> visited){

        while(!queue.isEmpty()){

            int cur_room = queue.poll();

            for(int room_key: rooms.get(cur_room)){
                if(visited.contains(room_key)){
                    continue;
                }
                queue.offer(room_key);
                visited.add(room_key);
            }
        }
    }
}
