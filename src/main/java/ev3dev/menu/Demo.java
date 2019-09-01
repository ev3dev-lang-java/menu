package ev3dev.menu;

import java.io.File;
import lejos.ev3.startup.JarMain;

public class Demo {

    public static void main(String[] args) {

        System.out.println("Running another jar");
        try {
            File file = new File("./demo.jar");
            JarMain jar = new JarMain(file);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

    }
}
