package es.uniovi.reflection.met_53.noncompliant;

import es.uniovi.reflection.met_53.compliant.ClassA;

public class SubClassA2 extends ClassA{
    @Override
    protected ClassA clone() throws CloneNotSupportedException {
        return clone();
    }
}