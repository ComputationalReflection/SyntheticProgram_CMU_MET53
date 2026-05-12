package es.uniovi.reflection.met_53.noncompliant;

public class ClassA implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return null;
    }
}