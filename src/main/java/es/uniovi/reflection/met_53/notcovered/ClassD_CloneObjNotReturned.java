package es.uniovi.reflection.met_53.notcovered;

public class ClassD_CloneObjNotReturned implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clon = super.clone();
        return null;
    }
}