package es.uniovi.reflection.met_53.notcovered;

public class WithSwitchClass implements Cloneable{
    public Object clone() throws CloneNotSupportedException {
        int tipo = 1;
        switch (tipo) {
            case 1: return super.clone();
            case 2: return new WithSwitchClass();
            default: return super.clone();
        }
    }
}