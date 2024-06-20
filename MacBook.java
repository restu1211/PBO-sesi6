
public class MacBook implements Laptop {
    private int volume;
    private boolean is_power_on;

    public MacBook() {
        this.volume = 50;
        this.is_power_on = false;
    }

    @Override
    public void powerOn() {
        this.is_power_on = true;
        System.out.println("MacBook is now ON");
    }

    @Override
    public void powerOff() {
        this.is_power_on = false;
        System.out.println("MacBook is now OFF");
    }

    @Override
    public void volumeUp() {
        if (is_power_on) {
            if (this.volume == MAX_VOL) {
                System.out.println("Volume is Full");
            } else {
                this.volume += 10;
                System.out.println("Volume is : " + this.getVolume());
            }
        }
    }

    @Override
    public void volumeDown() {
        if (is_power_on) {
            if (this.volume == MIN_VOL) {
                System.out.println("Volume is 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume is : " + this.getVolume());
            }
        }
    }

    public int getVolume() {
        return this.volume;
    }
}