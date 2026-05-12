package es.uniovi.reflection.met_53.noncompliant;

public class SubClassA1 extends ClassA{
    @Override
    protected ClassA clone() throws CloneNotSupportedException {
        return null;
    }
}