package es.uniovi.reflection.met_53.compliant;

public class WithCustomCloneClass implements Cloneable{
    public Object clone(int foo) {
        return new WithCustomCloneClass();
    }
}