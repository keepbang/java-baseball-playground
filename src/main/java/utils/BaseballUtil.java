package utils;

import model.Inning;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BaseballUtil {

    public static List<Inning> stringToInningList(String s) {
        String[] strArray = s.trim().split("");

        return IntStream.range(
                0,
                s.length()
        ).mapToObj(
                index -> new Inning(
                        index+1,
                        Integer.parseInt(strArray[index])
                )).collect(Collectors.toList());
    }
}
