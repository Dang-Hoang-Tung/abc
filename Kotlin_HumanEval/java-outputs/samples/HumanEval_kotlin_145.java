import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Planets {
    public static List<String> betweenPlanets(String planet1, String planet2) {
        
        List<String> planets = new ArrayList<>(Arrays.asList(
            "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"
        ));
        
        
        if (!planets.contains(planet1) || !planets.contains(planet2)) {
            return new ArrayList<>();
        }
        
        
        int index1 = planets.indexOf(planet1);
        int index2 = planets.indexOf(planet2);
        
        
        if (index1 > index2) {
            int temp = index1;
            index1 = index2;
            index2 = temp;
        }
        
        
        return new ArrayList<>(planets.subList(index1 + 1, index2));