package keerthana.trainmanager;

import java.util.LinkedHashMap;
import java.util.Map;

public class TrainManagement {

    public static Map<String , String> map = new LinkedHashMap<>();


    public static void main(String[] args) {
        A a = new A() {
            @Override
            public void hello() {

            }

            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
        a.hello();

    }



}

class  C     extends B{

    @Override
    public void hello() {
        System.gc();
    }

}
abstract class B implements  A{
    public String name;
    public String phoneNumber;


    public abstract void hello();


}

interface A{
    void hello();
}

