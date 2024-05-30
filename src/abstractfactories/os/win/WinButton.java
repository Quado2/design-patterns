package abstractfactories.os.win;

import abstractfactories.Button;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Win Button");
    }
}
