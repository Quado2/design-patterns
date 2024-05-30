package abstractfactories.os.mac;


import abstractfactories.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac Button");
    }
}
