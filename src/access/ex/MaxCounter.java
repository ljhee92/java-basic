package access.ex;

public class MaxCounter {

    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    } // MaxCounter

    public void increment() {
        // 검증 로직
        if(count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        } // end if

        // 실행 로직
        count++;
    } // increment

    public int getCount() {
        return count;
    } // getCount

} // class