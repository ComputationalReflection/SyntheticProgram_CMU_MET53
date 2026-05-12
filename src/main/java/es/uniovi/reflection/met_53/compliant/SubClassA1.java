package es.uniovi.reflection.met_53.compliant;

public class SubClassA1 extends ClassA{
    @Override
    protected ClassA clone() throws CloneNotSupportedException {
        return this.callIndirectlySuperClone();
    }

    private ClassA callIndirectlySuperClone() throws CloneNotSupportedException{
        return this.anotherMethod();
    }

    private ClassA anotherMethod() throws CloneNotSupportedException{
        return (ClassA) super.clone();
    }
}