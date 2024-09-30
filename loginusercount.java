import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class loginusercount {

    public static List<List<String>> countUserLogins(List<List<String>> logs) {
        Map<String, Map<String, Integer>> userMap = new HashMap<>();
        
        for (List<String> log : logs) {
            String userId = log.get(0);
            String time = log.get(1);
            String date = log.get(2);

            String userData = time + " " + date;

            userMap.putIfAbsent(date, new HashMap<>());
            userMap.get(date).put(userId, userMap.get(date).getOrDefault(userId, 0) + 1);
        }

        List<List<String>> result = new ArrayList<>();
        for (Map.Entry<String, Map<String, Integer>> dateEntry : userMap.entrySet()) {
            String date = dateEntry.getKey();
            Map<String, Integer> userCountMap = dateEntry.getValue();

            for (Map.Entry<String, Integer> userEntry : userCountMap.entrySet()) {
                String userId = userEntry.getKey();
                int userCount = userEntry.getValue();
                List<String> userInfo = new ArrayList<>();
                userInfo.add(userId);
                userInfo.add(date);
                userInfo.add(String.valueOf(userCount));
                result.add(userInfo);
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        List<List<String>> logs = new ArrayList<>();
        // Add the log data to the 'logs' list
        
        List<List<String>> userLoginCounts = countUserLogins(logs);
        for (List<String> userInfo : userLoginCounts) {
            System.out.println(userInfo.get(0) + " " + userInfo.get(1) + " " + userInfo.get(2));
        }
    }
}
