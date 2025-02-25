package com.example.projec.repositoriy;

public class Food {
    private int foodid;
    private String namefood;

    public Food(int foodid, String namefood) {
        this.foodid = foodid;

        this.namefood = namefood;
    }

    public int getFoodid() {
        return foodid;
    }

        public String getNamefood() {
        return namefood;
    }

    public void setFoodid(int foodid) {
        this.foodid = foodid;
    }



    public void setNamefood(String namefood) {
        this.namefood = namefood;
    }

    public Food() {

    }
}
