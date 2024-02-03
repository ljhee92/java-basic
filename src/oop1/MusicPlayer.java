package oop1;

public class MusicPlayer {
    int volume;
    boolean isOn;

    void on(){
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }   // on

    void off(){
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }   // off

    void volumeUp(){
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }   // volumeUp

    void volumeDown(){
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }   // volumeDown

    void showStatus(){
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }   // end else
    }   // showStatus
}   // class