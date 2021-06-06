package lintcode.q945;

import java.util.Arrays;

public class Solution {
    int[] taskRemain = new int[26];
    int[] taskCD = new int[26];

    /**
     * @param tasks: the given char array representing tasks CPU need to do
     * @param n:     the non-negative cooling interval
     * @return: the least number of intervals the CPU will take to finish all the given tasks
     */
    public int leastInterval(char[] tasks, int n) {
        // write your code here
        Arrays.fill(taskRemain, 0);
        Arrays.fill(taskCD, 0);
        int remains = tasks.length;
        for (int i = 0; i < remains; i++) {
            taskRemain[tasks[i] - 'A']++;
        }
        System.out.println(Arrays.toString(taskRemain));
        int counter = 0;

        while (remains > 0) {
            int nextAction = chooseTask();
            String arrayState = Arrays.toString(this.taskCD) + "\t" + Arrays.toString(this.taskRemain);
            if (taskCD[nextAction] != 0) {
                System.out.println(counter + "\tidle " + taskCD[nextAction] + "\t" + arrayState);
                counter ++;
                cycle(1);
            } else {
                System.out.println(counter + "\texec " + (char) ('A' + nextAction) + "\t" + arrayState);
                cycle(1);
                taskCD[nextAction] = n;
                taskRemain[nextAction]--;
                counter++;
                remains--;
            }
        }
        return counter;
    }

    public void cycle(int step) {
        for (int i = 0; i < 26; i++) {
            taskCD[i] = Math.max(0, taskCD[i] - step);
        }
    }

    public int chooseTask() {
        int idx = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (taskCD[i] == 0 && taskRemain[i] > 0) {
                return i;
            }
            if (min > taskCD[i] && taskRemain[i] > 0) {
                min = taskCD[i];
                idx = i;
            }
        }
        return idx;
    }
}