package com.amine;

public  class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    public Object getValue() {
        return super.getValue();
    }

    @Override
    public void setValue(Object value) {
        super.setValue(value);
    }

    @Override
    ListItem next() {
        return this.righLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.righLink = item;
        return  this.righLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item) {
         if(item != null){
             return ((String) super.getValue()).compareTo((String)item.getValue());
         }else{
             return -1;
         }
    }
}
