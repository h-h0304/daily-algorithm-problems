import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        // Step 1: 인용 횟수 배열을 정렬
        Arrays.sort(citations);

        // Step 2: H-Index 계산
        int hIndex = 0;
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            // 현재 논문 인용 횟수와 h값을 비교
            int h = n - i; // h는 남아있는 논문의 수
            if (citations[i] >= h) {
                hIndex = h;
                break;
            }
        }

        return hIndex;
    }
}
