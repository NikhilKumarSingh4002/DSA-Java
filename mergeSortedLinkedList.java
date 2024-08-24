class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode result = (list1.val>list2.val)?list2:list1;
        if(list1.val>list2.val){
            result.next=mergeTwoLists(list1,list2.next);
        }else{
            result.next=mergeTwoLists(list1.next,list2);
        }
        return result;
    }
}