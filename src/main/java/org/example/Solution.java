package org.example;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Слуйчай когда оба заданных листа или один из них равен null
        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        return getNode(list1, list2);
    }

    public ListNode getNode(ListNode list1, ListNode list2) {
        ListNode resultList = null;
        if (list1 != null || list2 != null) {
            if (list1 == null) {
                resultList = list2;
            } else if (list2 == null) {
                resultList = list1;
            } else if (list1.val <= list2.val) {
                resultList = list1;
                list1 = list1.next;
                resultList.next = getNode(list1, list2);
            } else {
                resultList = list2;
                list2 = list2.next;
                resultList.next = getNode(list1, list2);
            }
        }
        return resultList;
    }
}

