package week1;

import javax.swing.event.SwingPropertyChangeSupport;

public class Machines {



String name = "Jon";

public String getName() {

return name;

}


public int nameLength(String name) {
   int nameLength = name.length();

    return nameLength;

}

public String nameUpperCase(String name) {
    String nameUpperCase = name.toUpperCase();

    return nameUpperCase;
}


}













