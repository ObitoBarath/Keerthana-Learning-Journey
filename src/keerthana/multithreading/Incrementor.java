package keerthana.multithreading;

import jdk.jfr.Threshold;
import org.w3c.dom.ls.LSOutput;

public class Incrementor extends Thread{
    public void run(){
        System.out.println("Hello there");
    }
    public void hello(){
        System.out.println("hey thereee");
    }

    public static void main(String[] args) {
        Thread object = new Incrementor();
        Incrementor newl =new Incrementor();
        object.start();
        newl.hello();
    }

}
