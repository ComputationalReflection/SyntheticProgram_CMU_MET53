package es.uniovi.reflection.met_53.noncompliant;

public class ClassB implements Cloneable{
    @Override
    protected ClassB clone() throws CloneNotSupportedException {
        return null;
    }
}