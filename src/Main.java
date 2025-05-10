import java.util.*;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Main{
    public static void main(String[] args){
        Supper supper = new Sub();
        supper.show();
        supper.display();
        System.out.println("SUPPER name:" + supper.name);
        Supper.Inner inner = supper.new Inner();
        inner.read();
        System.out.println("SUPPER age:" + inner.age);
    }
}

class Supper{
    String name = "SUPPER";
    public static void show(){
        System.out.println("show in SUPPER");
    }
    public void display(){
        System.out.println("display in SUPPER");
    }

    public class Inner{
        public int age = 40;
        public void read(){
            System.out.println("read in SUPPER");
        }
    }
}

class Sub extends Supper{
    String name = "Sub";
    public static void show(){
        System.out.println("show in Sub");
    }
    public void display(){
        System.out.println("display in Sub");
    }

    public class Inner{
        public int age = 20;
        public void read(){
            System.out.println("read in Sub");
        }
    }
}