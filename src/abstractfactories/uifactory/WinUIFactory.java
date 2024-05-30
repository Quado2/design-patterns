package abstractfactories.uifactory;

import abstractfactories.Button;
import abstractfactories.CheckBox;
import abstractfactories.os.win.WinButton;
import abstractfactories.os.win.WinCheckBox;

public class WinUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
