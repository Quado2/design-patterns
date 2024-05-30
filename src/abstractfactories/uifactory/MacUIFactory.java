package abstractfactories.uifactory;

import abstractfactories.Button;
import abstractfactories.CheckBox;
import abstractfactories.os.mac.MacButton;
import abstractfactories.os.mac.MacCheckBox;

public class MacUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
