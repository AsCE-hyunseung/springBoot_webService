package qwer;

import java.util.*;

public class plotExam {
    public int[] solution(int[] answers) {
        Vector<Integer> answer = new Vector<>();
        int index = 0;
        int temp = 0;
        int tempCount = 0;
        int highScore = 0;

        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] point = {0, 0, 0};

        num1Point(answers, num1, point);
        num2Point(answers, num2, point);
        num3Point(answers, num3, point);

        Map<Integer, Integer> supoja = new HashMap<>();//수포자 인덱스와 점수 넣을 해시 생성

        supoja.put(1, point[0]);
        supoja.put(2, point[1]);
        supoja.put(3, point[2]);
        plotExam.sortByValue(supoja);

        for (int key : supoja.keySet()) {
            if (tempCount == 0) {
                answer.add(key);
                highScore = supoja.get(key);
                tempCount += 1;
            } else {
                if (highScore == supoja.get(key)) {
                    answer.add(key);
                }
            }
        }
        int[] answer2 = new int[answer.size()];
        for (int i : answer) {
            answer2[index] = answer.get(index);
            index++;
        }
        return answer2;
    }

    public void num1Point(int[] answers, int[] num1, int[] point) {
        int index = 0;
        for (int ans : answers) {
            if (num1[index] == ans) {
                point[0]++;
            }
            index++;
            if (index > 4) {
                index = 0;
            }
        }
    }

    public void num2Point(int[] answers, int[] num2, int[] point) {
        int index = 0;
        for (int ans : answers) {
            if (num2[index] == ans) {
                point[1]++;
            }
            index++;
            if (index > 8) {
                index = 0;
            }
        }
    }

    public void num3Point(int[] answers, int[] num3, int[] point) {
        int index = 0;
        for (int ans : answers) {
            if (num3[index] == ans) {
                point[2]++;
            }
            index++;
            if (index > 10) {
                index = 0;
            }
        }
    }

    public static List sortByValue(final Map map) {
        List<String> list = new ArrayList();
        list.addAll(map.keySet());

        Collections.sort(list, new Comparator() {

            public int compare(Object o1, Object o2) {
                Object v1 = map.get(o1);
                Object v2 = map.get(o2);

                return ((Comparable) v1).compareTo(v2);
            }
        });
        Collections.reverse(list);
        return list;
    }
}
