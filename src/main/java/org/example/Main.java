package org.example;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list1 = new ListNode();
        list1.val = 1;
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode();
        list2.val = 1;
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        ListNode result  = solution.mergeTwoLists(list1, list2);

                while (result != null) {
            System.out.println(result.val);
                    result = result.next;
        }
    }
}