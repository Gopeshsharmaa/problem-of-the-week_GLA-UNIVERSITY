// Problem 3: Count Friend Groups
// Company: Twitter

import java.util.*;

public class CountFriendGroups {
    public static int countGroups(int N, Map<Integer, List<Integer>> friendship) {
        Set<Integer> visited = new HashSet<>();
        int groups = 0;

        for (int student = 0; student < N; student++) {
            if (!visited.contains(student)) {
                dfs(student, friendship, visited);
                groups++;
            }
        }
        return groups;
    }

    private static void dfs(int student, Map<Integer, List<Integer>> friendship, Set<Integer> visited) {
        visited.add(student);
        for (int friend : friendship.getOrDefault(student, new ArrayList<>())) {
            if (!visited.contains(friend)) {
                dfs(friend, friendship, visited);
            }
        }
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> friendship = new HashMap<>();
        friendship.put(0, Arrays.asList(1, 2));
        friendship.put(1, Arrays.asList(0, 5));
        friendship.put(2, Arrays.asList(0));
        friendship.put(3, Arrays.asList(6));
        friendship.put(4, Arrays.asList());
        friendship.put(5, Arrays.asList(1));
        friendship.put(6, Arrays.asList(3));

        System.out.println(countGroups(7, friendship)); // 3
    }
}
