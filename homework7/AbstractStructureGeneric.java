package org.levelup.homework7;

import org.levelup.homework7.GenericStructure;

public abstract class AbstractStructureGeneric<TYPE> implements GenericStructure {

    protected int size;

    @Override
    public int getSize(){
        return size;
    }


}
