package baseball.model;

import java.util.List;

public class Baseball {

    private InningList inningList;

    public List<Inning> getInningList(){
        return inningList.getList();
    }

    public void createBaseball(String numberString){
        this.inningList = new InningList(numberString);
    }


}
