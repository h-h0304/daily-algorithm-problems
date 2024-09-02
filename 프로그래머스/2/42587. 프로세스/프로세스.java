import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        
        // 우선순위 큐에 프로세스와 그 인덱스를 저장.
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[] {priorities[i], i});
        }
        
        int count = 0; // 실행된 프로세스의 순서를 세기 위한 변수
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            boolean hasHigherPriority = false;
            
            // 큐에 남아있는 프로세스 중 우선순위가 더 높은 것이 있는지 확인.
            for (int[] process : queue) {
                if (process[0] > current[0]) {
                    hasHigherPriority = true;
                    break;
                }
            }
            
            if (hasHigherPriority) {
                queue.add(current); // 현재 프로세스를 다시 큐에 넣음.
            } else {
                count++; // 프로세스를 실행.
                if (current[1] == location) {
                    return count; // 찾고자 하는 프로세스가 실행된 순서를 반환.
                }
            }
        }
        
        return -1; // 이 코드에 도달할 일은 없다. 모든 프로세스가 실행되기 때문.
    }
}
