void deleteatlast(){
    if(head=null){
        System.out.println("There is no element to delete");
        return;
    }
    
    if (head==tail){
        head=tail=null;
        System.out.println("All the data deleted");
    }
    else{
        tail=tail.prev;
        tail.next=null;
    }
    size--;
}