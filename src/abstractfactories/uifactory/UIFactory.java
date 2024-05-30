package abstractfactories.uifactory;

import abstractfactories.Button;
import abstractfactories.CheckBox;

public interface UIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
