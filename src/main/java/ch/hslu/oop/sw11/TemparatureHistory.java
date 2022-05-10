package ch.hslu.oop.sw11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collection with Temparatures in Celsius.
 */
public final class TemparatureHistory {
    
    private List<Temperature> temparatureHistoryList;


    public TemparatureHistory() {
        temparatureHistoryList = new ArrayList<Temperature>();
    }

    public void add(Temperature temparature){
        temparatureHistoryList.add(temparature);
    }

    public void clear(){
        temparatureHistoryList.clear();
    }

    public int getCount(){
        return temparatureHistoryList.size();
    }

    public Temperature getMaximum(){
        if (getCount() == 0) return null;
        return Collections.max(temparatureHistoryList);
    }

    public Temperature getMinimum(){
        if (getCount() == 0) return null;
        return Collections.min(temparatureHistoryList);
    }

    /**
     * 
     Returns the average Temparature from the List in Celsius.
     * @return
     */
    public float getAverage(){
        double sum = 0;
        int counter = 0;
        for(final Temperature t : temparatureHistoryList){
            sum += t.getCelsius();
            counter++;
        }
        if(counter == 0){
            return Float.NaN;
        }
        return (float) sum/counter;
    }


}
