package es.uniovi.reflection.met_53.noncompliant;

class Base implements Cloneable {
    public Object clone() throws CloneNotSupportedException {
        return new Base();
    }
    protected void doLogic() {
        System.out.println("Superclass doLogic");
    }
}

public class MET_53_CMU_Examples_Noncompliant extends Base {
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    protected void doLogic() {
        System.out.println("Subclass doLogic");
    }
    public static void main(String[] args) {
        MET_53_CMU_Examples_Noncompliant dev = new MET_53_CMU_Examples_Noncompliant();
        try {
            Base devClone = (Base)dev.clone(); // Has type Base instead of Derived
            devClone.doLogic();  // Prints "Superclass doLogic" instead of "Subclass doLogic"
        } catch (CloneNotSupportedException e) { /* ... */ }
    }
}