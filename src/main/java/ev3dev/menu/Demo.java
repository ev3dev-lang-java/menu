package ev3dev.menu;

import java.io.File;
import java.util.stream.IntStream;
import lejos.ev3.startup.JarMain;

public class Demo {

    public static void main(String[] args) {

        System.out.println("Running another jar some times");

        Demo demo = new Demo();

        IntStream.rangeClosed(1, 5).boxed()
                .forEach(i -> {
                    demo.runAnotherJar();
                    System.out.println("Jar process finished");
                });
    }

    private void runAnotherJar() {

        try {
            File file = new File("./demo.jar");
            JarMain jar = new JarMain(file);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
