package org.launchcode;

//public class DVD {
//    // TODO: Implement your custom interface.
//
//    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
//    //  need to be declared separately.
//}
public class DVD extends BaseDisc implements OpticalDisc {

    public DVD (String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName, maxCapacity, aType, someUsedCapacity);
    }

    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    public void readData() {
        System.out.println("I'm sorry, Dave. I'm afraid I can't do that.");
    }

}//dvd.aName