package es.uniovi.reflection.met_53.notcovered;

public class WithLoopClass implements Cloneable{
    public Object clone() throws CloneNotSupportedException {
        for (int i = 1; i < 0; i++) {
            return super.clone();
        }
        return null;
    }
}
