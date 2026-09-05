/*
 * @lc app=leetcode id=207 lang=java
 *
 * [207] Course Schedule
 */

// @lc code=start
class Solution {

    HashMap<Integer, List<Integer>> adjList = new HashMap<>();
    HashSet<Integer> seen = new HashSet<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int requirement = prerequisite[1];

            adjList
                .computeIfAbsent(course, k -> new ArrayList<>())
                .add(requirement);
        }

        for (int course = 0; course < numCourses; course++) {
            if (!dfs(course)) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(int course) {

        if (!adjList.containsKey(course)) {
            return true;
        }

        if (seen.contains(course)) {
            return false;
        }

        seen.add(course);

        for (int prerequisite : adjList.get(course)) {
            if (!dfs(prerequisite)) {
                return false;
            }
        }

        seen.remove(course);

        adjList.put(course, new ArrayList<>());

        return true;
    }
}
// @lc code=end

