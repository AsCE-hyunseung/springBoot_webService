package qwer;

import java.util.*;

public class Printer {
    public int solution(int[] priorities, int location) {
        PriorityQueue<A4> priorityQueue = new PriorityQueue<A4>();
        A4[] a4 = new A4[priorities.length];
        int answer = 1;
        char name = 'a';

        for (int i = 0; i < a4.length; i++, name++) {
            a4[i] = new A4(name, priorities[i]);
            priorityQueue.offer(a4[i]);
        }

        while (!priorityQueue.isEmpty()) {
            A4 temp = priorityQueue.poll();
            if (temp.name == a4[location].name) {
                break;
            }
            answer++;
        }
        return answer;
    }
}

class A4 implements Comparable<A4> {
    char name;
    int weight;

    public A4(char name, int weight) {
        super();
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(A4 paper) {
        if (this.weight < paper.weight) {
            return 1;
        } else if (this.weight > paper.weight) {
            return -1;
        }
        return 0;
    }
}
