package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int countForwards = 0;
        int countBackwards = 0;
        for(int i = startIndex; i < this.playList.length; i++){
            if(this.playList[i].equals(selection)){
                break;
            }
            countForwards++;
        }

        for(int i = startIndex; i < this.playList.length; i--){
            if(this.playList[i].equals(selection)){
                break;
            }
            if(i == 0){
                i = this.playList.length-1;
            }
            countBackwards++;
        }

        if(countForwards < countBackwards){
            return countForwards;
        }

        return countBackwards;
    }
}
