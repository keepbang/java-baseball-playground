package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static utils.NumberValidationUtil.MAX_ROUND;

public class RandomNumberUtil {
    private String number;

    public RandomNumberUtil() {
        List<Integer> numberList = new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8,9));
        this.number = createRandomNumbers(numberList);
    }

    public String getNumber(){
        return this.number;
    }

    private String createRandomNumbers(List<Integer> numberList) {
        List<Integer> randomList = new ArrayList<>();

        while (randomList.size() != MAX_ROUND) {
            Random random = new Random();

            int numberArraySize = numberList.size();

            int arrayIndex = random.nextInt(numberArraySize);

            int number = numberList.get(arrayIndex);

            randomList.add(number);
            numberList.remove(arrayIndex);
        }

        return IntegerListToInningList(randomList);
    }

    private String IntegerListToInningList(List<Integer> randomList){
        return randomList.stream()
                        .map(i -> String.valueOf(i))
                        .collect(Collectors.joining());
    }

}
