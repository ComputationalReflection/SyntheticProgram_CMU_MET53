package es.uniovi.reflection.met_53.noncompliant;

public class ClassC implements Cloneable{
    @Override
    protected ClassA clone() throws CloneNotSupportedException {
        return null;
    }
}