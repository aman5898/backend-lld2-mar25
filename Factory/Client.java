package Factory;


import Factory.components.Button.Button;
import Factory.components.Dropdown.Dropdown;
import Factory.components.Menu.Menu;

public class Client {
    public static void main(String[] args) {

//        Platform p = new Android(); // this is a simulation

        String str = "Android"; // This is a simulation
        Platform p = Platform.getPlatform(str);

        UIComponentFactory uiComponentFactory = p.createUIComponentFactory();
        Button b = uiComponentFactory.createButton();
        Dropdown d = uiComponentFactory.createDropdown();
        Menu menu = uiComponentFactory.createMenu();
    }
}