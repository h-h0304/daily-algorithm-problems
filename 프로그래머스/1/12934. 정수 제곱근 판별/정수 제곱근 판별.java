class Solution {
    public long solution(long n) {
        // n의 제곱근을 구한다.
        long sqrt = (long) Math.sqrt(n);
        
        // 제곱근을 제곱했을 때 원래 수와 같은지 확인 (n이 완전제곱수인지 확인)
        if (sqrt * sqrt == n) {
            // 만약 완전제곱수라면, sqrt + 1의 제곱을 반환
            return (sqrt + 1) * (sqrt + 1);
        } else {
            // 완전제곱수가 아니라면 -1을 반환
            return -1;
        }
    }
}
