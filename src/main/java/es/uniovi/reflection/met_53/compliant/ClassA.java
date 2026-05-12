package es.uniovi.reflection.met_53.compliant;

public class ClassA implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected ClassA getMyClone() throws CloneNotSupportedException {
        return (ClassA) clone();
    }
}