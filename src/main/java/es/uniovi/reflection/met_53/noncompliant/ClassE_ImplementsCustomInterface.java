package es.uniovi.reflection.met_53.noncompliant;

import es.uniovi.reflection.met_53.compliant.ICustomInterface;

public class ClassE_ImplementsCustomInterface implements ICustomInterface {
    @Override
    public Object clone(){
        return null;
    }
}