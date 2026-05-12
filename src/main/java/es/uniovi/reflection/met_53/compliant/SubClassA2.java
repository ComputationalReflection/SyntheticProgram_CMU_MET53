package es.uniovi.reflection.met_53.compliant;

public class SubClassA2 extends ClassA{
    @Override
    protected ClassA clone() throws CloneNotSupportedException {
        return (ClassA) super.clone();
    }
}