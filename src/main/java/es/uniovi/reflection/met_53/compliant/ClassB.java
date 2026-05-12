package es.uniovi.reflection.met_53.compliant;

public class ClassB implements Cloneable{
    @Override
    protected ClassB clone() throws CloneNotSupportedException {
        return this.callSuperClone();
    }

    private ClassB callSuperClone() throws CloneNotSupportedException {
        return (ClassB) super.clone();
    }
}