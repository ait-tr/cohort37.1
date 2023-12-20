public enum Transport {

    CAR(60), TRUCK(40),TRAIN(90);
    private int speed;


    Transport( int speed){
        this.speed = speed;
    }

    int getSpeed(){
        return speed;
    }
}
