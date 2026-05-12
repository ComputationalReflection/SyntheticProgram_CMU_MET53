package es.uniovi.reflection.met_53.compliant;

public class WithoutCloneableClass {
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}