void search(int d){
    if(head==null){
        System.out.println("There is no data to search");
        return;
    }
    Node temp=head;
    while(temp!=null){
        if(temp.data==d){
            System.out.println("Data found");
            return;
        }
        temp=temp.next;
    }
    System.out.println("There is no data");
}