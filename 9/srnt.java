import java.util.*;

public class srnt{
    public static void main(String[] args) {
        String[] worldStrings = {"Earth", "Ocean", "Mountain", "Sky", "Forest", "Desert", "River", "Island", "Valley", "Jungle"};
        
        Arrays.sort(worldStrings);

        for (String word : worldStrings) {
            System.out.println(word);
        }
    }
}
