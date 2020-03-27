package at.xxx.projects.remote;

public class Remote {
    // Membervariables
    //
    private boolean isOn;
    private boolean hasPower;
    private Battery[] batteries;

    // Constructor
    //
    public Remote(Battery[] batteries) {
        this.batteries = batteries;
    }

    // Methodes
    //
    public boolean turnOn() {
        getStatus();
        if (this.hasPower) {
            this.isOn = true;
            System.out.println("Eingaschaltet");
        } else {
            isOn = false;
            System.out.println("Ausgeschaltet, kein Saft");
        }
        return this.isOn;
    }

    public boolean turnOf() {
        this.isOn = false;
        System.out.println("Ausgeschaltet");
        return this.isOn;
    }

    public void removeBatteries() {
        for (int i = 0; i < batteries.length; i++) {
            batteries[i] = null;
        }
    }

    public void addBatteries() {
        for (int i = 0; i < batteries.length; i++) {
            batteries[i] = new Battery(100);
        }
    }

    private void getStatus() {
        if (this.batteries.length == 2 && checkTwoBatteriesSet()) {
            if (this.batteries[0].getChargingStatus() > 0 && this.batteries[1].getChargingStatus() > 0) {
                this.hasPower = true;
            }
        } else {
            this.hasPower = false;
        }
    }

    private boolean checkTwoBatteriesSet() {
        boolean isSetTwoBatteries = true;
        for (int i = 0; i < batteries.length; i++) {
            if (batteries[i] == null) {
                isSetTwoBatteries = false;
                break;
            }
        }
        return isSetTwoBatteries;
    }
}
