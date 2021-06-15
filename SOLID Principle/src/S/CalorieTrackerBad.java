public class CalorieTrackerBad {

    private int maxCalories;
    private int currentCalories = 0;

    CalorieTrackerBad(int maxCalories) {
        this.maxCalories = maxCalories;
    }

    public void trackCalories(int calorieCount) {
        this.currentCalories += calorieCount;
        if (this.currentCalories > this.maxCalories) {
            this.logCaloriesSurplus();
        }
    }

    public void logCaloriesSurplus() {
        System.out.println("Max calories exceeded");
    }

}
