package baseball.model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InningList {

    private List<Inning> inningList;

    public InningList(String numberString){
        String[] strArray = numberString.trim().split("");

        this.inningList = IntStream.range(
                0,numberString.length()
        ).mapToObj(
                index -> new Inning(
                        index+1,
                        Integer.parseInt(strArray[index]))
        ).collect(Collectors.toList());
    }

    public List<Inning> getList(){
        return inningList;
    }

}
