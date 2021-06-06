package lintcode.q872;

import java.util.*;
import java.util.stream.Collectors;

import static utils.JSONUtil.print;

public class Solution {
    /**
     * @param pid: the process id
     * @param ppid: the parent process id
     * @param kill: a PID you want to kill
     * @return: a list of PIDs of processes that will be killed in the end
     */
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        // Write your code here
        int toKill;
        int index;
        Queue<Integer> checkQueue=new LinkedList<>();
        List<Integer> stopped=new LinkedList<>();

        Map<Integer,List<Integer>> childrenMap=new HashMap<>();
        for (int i = 0; i < ppid.size(); i++) {
            List<Integer> children = childrenMap.computeIfAbsent(ppid.get(i), k -> new LinkedList<>());
            children.add(pid.get(i));
            childrenMap.putIfAbsent(ppid.get(i),children);
        }

        stopped.add(kill);
        checkQueue.offer(kill);

        while(!checkQueue.isEmpty()){
            kill = checkQueue.poll();
            stopped.addAll(childrenMap.getOrDefault(kill,new ArrayList<>()));
            checkQueue.addAll(childrenMap.getOrDefault(kill,new ArrayList<>()));
        }



        return stopped;
    }
}
