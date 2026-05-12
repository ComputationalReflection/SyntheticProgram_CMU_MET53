package es.uniovi.reflection.met_53.compliant;

class Base implements Cloneable {
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    protected void doLogic() {
        System.out.println("Superclass doLogic");
    }
}

public class MET_53_CMU_Examples_Compliant extends Base{
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    protected void doLogic() {
        System.out.println("Subclass doLogic");
    }
    public static void main(String[] args) {
        MET_53_CMU_Examples_Compliant dev = new MET_53_CMU_Examples_Compliant();
        try {
            // Has type Derived, as expected
            Base devClone = (Base)dev.clone();
            devClone.doLogic();  // Prints "Subclass doLogic" as expected
        } catch (CloneNotSupportedException e) { /* ... */ }
    }
}