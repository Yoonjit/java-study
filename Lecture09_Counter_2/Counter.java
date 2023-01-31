public class Counter { // 모델 클래스
    private int count; // 카운트를 기억할 필드변수

    /** Counter - 카운터 초기 설정
     * @param start - 카운터의 초기값 */
//    public Counter(int start) {
//        count = start;
//    }

    /** increment - 카운터 값 증가 */
    public void increment() {
        count = count + 1;
    }

    /** count - 카운터 값 리턴
     * @return 카운터 현재 값  */
    public int count() {
        return count;
    }

}