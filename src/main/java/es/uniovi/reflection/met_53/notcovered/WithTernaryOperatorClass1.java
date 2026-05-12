package es.uniovi.reflection.met_53.notcovered;

public class WithTernaryOperatorClass1 implements Cloneable{
    public Object clone() throws CloneNotSupportedException {
        int a = 9;
        char c = (char) 9.8;
        int test = 0;
        Object clon;
        System.out.println((clon = a == c ? super.clone() : null).hashCode());
        test++;
        return clon;
    }
}