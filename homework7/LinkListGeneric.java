package org.levelup.homework7;

import org.levelup.homework7.AbstractStructureGeneric;
import org.levelup.homework7.GenericStructure;
import org.levelup.structure.GenericElement;


public class LinkListGeneric<TYPE> extends AbstractStructureGeneric<TYPE> implements GenericStructure<TYPE> {

    GenericElement head;


    @Override
    public void add(TYPE value) {
        GenericElement element = new GenericElement(value);//сразу задаем элемент
        if (head==null){// если head==null, то список пуст
            head = element;
        }else{
            GenericElement current = head;
            while (current.getNext()!=null){
                current=current.getNext();
            }
            //current ссылается на текущий последний элемент списка
            current.setNext(element);
        }
        size++;

    }



}
