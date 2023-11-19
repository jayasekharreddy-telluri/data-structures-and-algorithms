package org.com.jai.pattrens.topkelements;

import java.util.Comparator;

public class ElementComparator implements Comparator<Element> {

    @Override
    public int compare(Element e1,Element e2) {

        if (e1.frequency != e2.frequency){

            return e2.frequency - e1.frequency;
        }
        return e2.sequenceNumber - e2.sequenceNumber;
    }
}
