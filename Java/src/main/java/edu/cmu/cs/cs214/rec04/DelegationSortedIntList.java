package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 */

public class DelegationSortedIntList implements IntegerList {

    /**
     * The list that contains all the data
     */
    private final SortedIntList list = new SortedIntList();
    private int addTrack = 0;

    /**
     * Adds the specified int to the list and tracking the added number
     *
     * @param num an integer to be added to the list
     * @return true if the list is changed as a result of the call
     */
    @Override
    public boolean add(int num) {
        boolean res = list.add(num);
        if (res) addTrack++;

        return res;
    }

    /**
     * Adds all the elements of the IntegerList to the list and tracking the added num
     *
     * @param list IntegerList containing elements to be added to the list
     * @return true if the list changed as a result of the call, false if any num add is failed
     */
    @Override
    public boolean addAll(IntegerList list) {
        boolean res = true;

        for (int i = 0; i < list.size(); i++) {
            res &= add(list.get(i));
        }

        return res;
    }

    /**
     * Returns the integer at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     */
    @Override
    public int get(int index) {
        return list.get(index);
    }

    /**
     * Removes the first occurrence of the specified element from the list,
     * if it is present (optional operation).
     *
     * @param num an integer to be removed from the list, if present
     * @return true if an element was removed as a result of this call
     */
    @Override
    public boolean remove(int num) {
        return list.remove(num);
    }

    /**
     * Removes from the list all of its elements that are contained in the
     * specified IntegerList.
     *
     * @param list IntegerList containing elements to be removed from
     *             the list
     * @return true if the list changed as a result of the call
     */
    @Override
    public boolean removeAll(IntegerList list) {
        return list.removeAll(list);
    }

    /**
     * Returns the number of elements in this list. If this list contains
     * more than Integer.MAX_VALUE elements, returns Integer.MAX_VALUE.
     *
     * @return number of elements in the list
     */
    @Override
    public int size() {
        return list.size();
    }

    /**
     * return the total successful added elements
     *
     * @return total successful added elements
     */
    public int getTotalAdded() {
        return addTrack;
    }


}