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
                        currentItem.setNext(newItem).setPrevious(currentItem);
                        return true;
                    }
            }else if (comparaison >0)
            {
                // newItem is less, so insert befor
                if(currentItem.previous() != null)
                {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                }else
                    {
                        // the node with previous is the root
                        newItem.setNext(this.root).setPrevious(newItem);
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
       if(item != null)
       {
           System.out.println("Deleting Item " + item.getValue());

       }
       ListItem currentItem = this.root;
       while (currentItem != null)
       {
            int comparaison = currentItem.compareTo(item);
            if(comparaison == 0)
            {
                // found the item to delete
                if(currentItem == this.root)
                {
                    this.root = currentItem.next();
                }else
                    {
                        currentItem.previous().setNext(currentItem.next());
                        if(currentItem.next() != null)
                        {
                            currentItem.next().setPrevious(currentItem.previous());
                        }
                    }
                return true;
            }else if( comparaison < 0)
            {
                currentItem = currentItem.next();
            }else
                {
                    // comparaison greater then 0
                    // we are at an item greater then one to be deleted
                    // so item is not in the list
                    return false;
                }
       }
       // we have reached the end of list
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null)
        {
            System.out.println("The list is empty!");
        }else{
            while(root != null){
                System.out.println(root.getValue());
                root = root.next();
            }
        }

    }
}
