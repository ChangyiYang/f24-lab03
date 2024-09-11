package edu.cmu.cs.cs214.rec04;



/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList {
    // Write your implementation below with API documentation

    private int addTrack = 0;

    /**
     * Add the given element to the list, return true if success.
     * @param num an integer to be added to the list
     * @return
     */
    @Override
    public boolean add(int num) {
        boolean res = super.add(num);
        if(res) addTrack++;
        return res;
    }

    @Override
    public boolean addAll(IntegerList list) {
        return super.addAll(list);
    }


    public int getTotalAdded(){
        return addTrack;
    }
}