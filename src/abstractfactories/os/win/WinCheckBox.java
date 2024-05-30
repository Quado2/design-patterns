package abstractfactories.os.win;

import abstractfactories.CheckBox;

public class WinCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Win Checkbox");
    }
}
