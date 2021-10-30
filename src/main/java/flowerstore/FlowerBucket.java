package flowerstore;

import lombok.*;
import java.util.ArrayList;

public class FlowerBucket extends Item{
    @Getter
    private ArrayList<FlowerPack> FlowerPacks = new ArrayList<>();
    public void addFlowerPack (FlowerPack bucket) {FlowerPacks.add(bucket);}
    @Override
    public double getPrice(){
        double price = 0;
        int i;
        for (i=0;i< FlowerPacks.size();i++){
            price+=FlowerPacks.get(i).getPrice();
        }
        return price;
    }
    public boolean searchFLower(Flower flower){
        int i;
        for (i=0;i<FlowerPacks.size();i++){
            FlowerPack flowerpack = FlowerPacks.get(i);
            if (flower.equals(flowerpack.getFlower())){
                return true;
            }
        }

        return false;
    }

    @Override
    public void getDescription() {
        System.out.println("It's a flower bucket!");
    }

    public boolean equals(FlowerBucket obj) {
        if (this.FlowerPacks.size() != obj.FlowerPacks.size()){
            return false;
        }else {
            int i;
            for (i=0;i<this.FlowerPacks.size();i++){
                if (this.FlowerPacks.get(i).equals(obj.FlowerPacks.get(i)) == false){
                    return false;
                }
            }
            return true;
        }
    }

}
