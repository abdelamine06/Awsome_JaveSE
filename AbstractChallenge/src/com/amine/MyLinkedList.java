package com.amine;

public class MyLinkedList implements NodeList  {
    private ListItem root=null;

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null)
        {
            // this list was empty, so this item becomes the head of list
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparaison = (currentItem.compareTo(newItem));
            if(comparaison<0){
                // newItem is greater, move right if possible
                if(currentItem.next() != null )
                {
                    currentItem = currentItem.next();
                }else
                    {
                        // there is no next, so insert at end of list
                        currentItem.setNext(newItem);
                        newItem.setPrevious(currentItem);
                        return true;
                    }
            }else if (comparaison >0)
            {
                // newItem is less, so insert befor
                if(currentItem.previous() != null)
                {
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                }else
                    {
                        // the node with previous is the root
                        newItem.setNext(this.root);
                        this.root.setPrevious(newItem);
                        this.root = newItem;

                    }
                return true;
            }else
                {
                    // equal
                    System.out.printf(newItem.getValue() + " is already present!, not added");
                    return false;
                }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
