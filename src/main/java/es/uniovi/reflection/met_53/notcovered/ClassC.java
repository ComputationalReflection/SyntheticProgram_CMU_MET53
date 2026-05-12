package es.uniovi.reflection.met_53.notcovered;

import es.uniovi.reflection.met_53.compliant.ClassA;

public class ClassC extends ClassA {
    @Override
    protected ClassA clone() throws CloneNotSupportedException {
        return this.getMyClone();
    }
}