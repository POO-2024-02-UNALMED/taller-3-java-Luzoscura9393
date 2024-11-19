package taller3.televisores;

public class Control {
    private TV tv;


    public void turnOn() {
        if (tv != null) {
            tv.turnOn();
        }
    }

    public void turnOff() {
        if (tv != null) {
            tv.turnOff();
        }
    }

       public void canalUp() {
        if (tv != null) {
            tv.canalUp();
        }
    }

    public void canalDown() {
        if (tv != null) {
            tv.canalDown();
        }
    }

    
    public void volumenUp() {
        if (tv != null) {
            tv.volumenUp();
        }
    }
}

