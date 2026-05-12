package es.uniovi.reflection.met_53.notcovered;

public class WithTernaryOperatorClass2 implements Cloneable{
    public Object clone() throws CloneNotSupportedException {
        return (false ? super.clone() : new WithTernaryOperatorClass2());
    }
}