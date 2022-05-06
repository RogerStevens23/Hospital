package Hospital;

public class Patient
{
    // Fields
    private int healthLevel;
    private int bloodLevel;

    // Getters
    public int getHealthLevel() {return healthLevel;}
    public int getBloodLevel() {return bloodLevel;}

    // Constructor
    public Patient()
    {
        healthLevel = 10; // Default.
        bloodLevel = 20;
    }
    public Patient(int healthLevel, int bloodLevel)
    {
        this.healthLevel = healthLevel;
        this.bloodLevel = bloodLevel;
    }

    // Methods
    public void increaseHealthLevel(int healthIncreaseAmount)
    {
        healthLevel += healthIncreaseAmount;
    }
    public void decreaseBloodLevel(int bloodDecreaseAmount)
    {
        bloodLevel -= bloodDecreaseAmount;
    }
}