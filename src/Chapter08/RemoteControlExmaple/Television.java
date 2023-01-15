package Chapter08.RemoteControlExmaple;

public class Television implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Tv를 켭니니다");
    }

    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVoulme(int voulme) {
        if (volume > RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " + this.volume);
    }
}
