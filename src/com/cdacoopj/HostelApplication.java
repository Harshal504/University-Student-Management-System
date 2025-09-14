//● Add priority applicants at front
//        ● Add regular applicants at end
//        ● Remove from both ends for allocation
//Add regular(105): [105]
//        Add priority(101): [101, 105]
//        Remove front: [105

package com.cdacoopj;

import java.util.Deque;
import java.util.List;

public class HostelApplication {
    int rollNo;

    static <T> void addRegular(Deque<T> hostelqueue, T rollNo){
        hostelqueue.add(rollNo);
        System.out.println(hostelqueue);
    }

    static <T> void addPriority(Deque<T> hostelqueue, T rollNo){
        hostelqueue.addFirst(rollNo);
        System.out.println(hostelqueue);

    }

    static <T> void removeFirst(Deque<T> hostelqueue){
        hostelqueue.removeFirst();
        System.out.println(hostelqueue);

    }
    static <T> void removeLast(Deque<T> hostelqueue){
        hostelqueue.removeLast();
        System.out.println(hostelqueue);

    }



}
