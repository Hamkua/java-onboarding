package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        List<Integer> answer = new ArrayList<>();

        int currMoney = money;
        int[] moneyUnit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};

        for(int unit : moneyUnit){
            answer.add(currMoney / unit);
            currMoney %= unit;
        }
        return answer;
    }
}
