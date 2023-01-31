public class Counter2 extends Counter { // 방금 만들었던 카운터 클래스를 모두 상속받음

    private int index;

    public Counter2(int n, int i) {
        super(n); // 초기값은 카운터의 초기값이니까 super
        index = i;
    }

    // toString() 오버라이딩, 덮어쓰기, 기존 toString 안 쓰고 내가 만든 거 쓴당
    public String toString() { // 리스트에다가 쓸 거니까 문장 필요함 (간판)
        return "Counter " + index + " has " + count();
    }
    
}