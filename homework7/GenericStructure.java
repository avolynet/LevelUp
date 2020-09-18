package org.levelup.homework7;

import com.sun.jdi.Type;

public interface GenericStructure<TYPE> {

    public abstract int getSize();

   void add(TYPE value);

}
