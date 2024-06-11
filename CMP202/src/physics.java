

public class physics {

    float calculateVelocity (float distance, int time){
        return distance/time;

    }
    float calculateVelocity(float initialVelocity, float acceleration, int time){
        return initialVelocity + (acceleration * time);
    }

    public static void main(String[] args){
        physics calculate = new physics();
        System.out.println(calculate.calculateVelocity(20,34));
        System.out.println(calculate.calculateVelocity(100,10,20));
    }
}

