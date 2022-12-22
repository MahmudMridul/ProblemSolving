package Example.CustomCompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Player {
    public String name;
    public int score;
    public double rating;

    public Player(String name, int score, double rating) {
        this.name = name;
        this.score = score;
        this.rating = rating;
    }

    public ArrayList<Player> createTeam() {
        ArrayList<Player> list = new ArrayList<>();

        list.add(new Player("Messi", 11, 9.55));
        list.add(new Player("Kaka", 10, 9.6));
        list.add(new Player("Kohli", 12, 9.8));
        list.add(new Player("Shakib", 8, 8.9));
        list.add(new Player("devilliers", 15, 9.9));

        return list;
    }

    public void sortTeam(ArrayList<Player> list) {
        Collections.sort(list, new Comparator<Player>() {
            @Override
            public int compare(Player first, Player second) {
                if(first.score >= second.score) {
                    return -1;
                }
                return 1;
            }
        });

        // return 1, 0 : default order, no sorting
        // return -1 : reverse order
        // return 1 if first >= second : ascending order
        // return -1 if first >= second : descending order
    }

    public void detail() {
        System.out.println("Name: " + this.name + "\tScore: " + this.score + "\tRating: " + this.rating);
    }

    public void teamDetail(ArrayList<Player> list) {
        for(Player p : list) {
            p.detail();
        }
    }
}
