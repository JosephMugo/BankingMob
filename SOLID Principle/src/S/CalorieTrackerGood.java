public class CalorieTrackerGood {

    private int maxCalories;
    private int currentCalories = 0;

    CalorieTrackerGood(int maxCalories) {
        this.maxCalories = maxCalories;
    }

    public void trackCalories(int calorieCount) {
        this.currentCalories += calorieCount;
        if (this.currentCalories > this.maxCalories) {
            SurplusNotifier.consoleLogNotify("Max Calories exceeded");
        }
    }
}
