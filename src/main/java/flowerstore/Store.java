package flowerstore;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;

public class Store {
    @Getter
    private ArrayList<FlowerBucket> buckets = new ArrayList<>();
    public boolean search(FlowerBucket bucket){
        int i;
        for (i=0;i< buckets.size();i++){
            if (bucket.equals(buckets.get(i))){
                return true;
            }
    }return false;
}
    public void addFlowerBucket (FlowerBucket bucket) {buckets.add(bucket);}
}
