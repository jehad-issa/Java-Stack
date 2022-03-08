import java.util.HashMap;
import java.util.Set;
public class Hash{
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("jehad","python");
        trackList.put("ahmad","java");
        trackList.put("mahmod","php");
        trackList.put("oday","mern");

        String name =trackList .get("jehad");
        System.out.println(name);

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println( trackList.get(key));    
        }

    }
}