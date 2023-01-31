public class Counter {

    private int count; // 카운트를 기억하고 있는 필드변수

    /** Counter - 카운터 초기 설정
     * @param n - 카운터의 초기값 */
    public Counter(int n) { // 시작값을 주면 그걸로 카운터가 시작됨
        count = n;
    }

    /** increment - 카운터 값 증가 */
    public void increment() {
        count += 1;
    }

    /** count - 카운터 값 리턴
     * @return 카운터 현재 값  */
    public int count() {
        return count;
    }

}