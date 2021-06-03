package baseball.model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Baseball {

    private List<Inning> inningList;

    public List<Inning> getInningList(){
        return inningList;
    }

    public void createBaseball(String numberString){

        String[] strArray = numberString.trim().split("");

        this.inningList = IntStream.range(
                0,numberString.length()
        ).mapToObj(
                index -> new Inning(
                        index+1,
                        Integer.parseInt(strArray[index]))
        ).collect(Collectors.toList());
    }


}
