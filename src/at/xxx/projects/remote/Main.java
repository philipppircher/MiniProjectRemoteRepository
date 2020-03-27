package at.xxx.projects.remote;

public class Main {
    public static void main(String[] args) {
        Battery[] batteryBoxWithFour = new Battery[4];

        for (int i = 0; i < batteryBoxWithFour.length; i++) {
            batteryBoxWithFour[i] = new Battery(100);
        }

        Battery[] batteryBoxWithTwo = {batteryBoxWithFour[0], batteryBoxWithFour[1]};

        Remote remoteTV = new Remote(batteryBoxWithTwo);
        remoteTV.turnOn();
        remoteTV.turnOf();
        remoteTV.removeBatteries();
        remoteTV.turnOn();
        remoteTV.addBatteries();
        remoteTV.turnOn();
    }
}
