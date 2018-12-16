package Folder1;

import static Folder1.Constants.*;

public class MyWater {

    private int largeBotlesCount = 0;
    private int mediumBotlesCount = 0;
    private int smallBotlesCount = 0;


    public MyWater() {

    }


    public void addLarge(int pieces) {
        this.largeBotlesCount = this.largeBotlesCount + pieces;

    }
     public void addMedium(int pieces) {
        this.mediumBotlesCount = this.mediumBotlesCount + pieces;

    }

    public void addSmall(int pieces) {
        this.smallBotlesCount = this.smallBotlesCount + pieces;

    }

    public double getTotalAmount(){
        return this.largeBotlesCount*Constants.LARGE_BOTLE_VOLUME
                + this.mediumBotlesCount*Constants.MEDIUM_BOTLE_VOLUME
                + this.smallBotlesCount*Constants.SMALL_BOTLE_VOLUME;
    }


    public int getLargeBotlesCount() {
        return largeBotlesCount;
    }

    public int getMediumBotlesCount() {
        return mediumBotlesCount;
    }

    public int getSmallBotlesCount() {
        return smallBotlesCount;
    }

    public double getSmallBottleVolume() {
        return SMALL_BOTLE_VOLUME;
    }

    public double getMediumBottleVolume() {
        return MEDIUM_BOTLE_VOLUME;
    }
    public double getLargeBottleVolume() {
        return LARGE_BOTLE_VOLUME;
    }


}