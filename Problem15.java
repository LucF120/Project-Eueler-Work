
import java.util.HashMap;

public class Problem15 {
    public static void main(String[] args) {
        HashMap<String, Long> paths = new HashMap<>();
        System.out.println(calculateRoute(0, 0, paths));
    }

    public static long calculateRoute(int right, int down,  HashMap<String, Long> paths) {
        String key = right + ":" + down;
        
        if(paths.containsKey(key)) {
            return paths.get(key);
        }

        if(right == 20 || down == 20) {
            paths.put(key, 1L);
            return 1L;
        }
        
        long result = 0;
        if(right < 20) {
            result += calculateRoute(right+1, down, paths);
        }
        if(down < 20) {
            result += calculateRoute(right, down+1, paths);
        }

        paths.put(key, result);

        return result;
    }
}