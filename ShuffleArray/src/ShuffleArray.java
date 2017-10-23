/*By Juan Lagos
* CSC 201
* Professor Tanes Kanchanawanchai
* Assignment 11 Chapter 11
* Computer Configuration
* Due Date: 10/22/17*/
import java.util.ArrayList;

public class ShuffleArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println("Shuffling the list above yields the following:");
        shuffle(list);
        System.out.println(list);
    }

    public static void shuffle(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int random = (int) (Math.random() * list.size());
            int index = list.get(random);
            list.set(random, list.get(i));
            list.set(i, index);
        }
    }
}