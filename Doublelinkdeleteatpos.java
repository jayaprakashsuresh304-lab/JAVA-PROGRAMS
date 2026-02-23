void deleteatpos(int pos){
    if(pos<=0 || pos size){
        System.out.println("Invalid pos");
        return;
    }
    if(pos=1){
        deleteatbeg();
        return;
    }
    if(pos==size){
        deleteatlast();
        return;
    }
    Node temp=head;
    for (int i =1;i<pos-1;i++){
        temp=temp.next;
    }
    Node temp1=temp.next;
    temp.next=temp1.next;
    temp.next.prev=temp;
}