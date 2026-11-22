public class Exercise {
    private String nameOfExercise;
    private int[] reps = new int[20];
    private double[] weightPerRep = new double[20];
    private int numOfSets = 0;

    public Exercise(String name) {
        nameOfExercise = name;
    }

    public String getNameOfExercise() {
        return nameOfExercise;
    }

    public int getNumberOfSets() {
        return numOfSets;
    }

    public int getNumOfReps(int idex) {
        return reps[idex];
    }

    public double getWeightAtSet(int idex) {
        return weightPerRep[idex];
    }

    public boolean logSet(int repeitions, double weight) {
        if (numOfSets >= 20) {
            return false;
        }
        else {

            reps[numOfSets] = repeitions;
            weightPerRep[numOfSets] = weight;
            numOfSets++;
            return true;

        }
        
    }

    public int getMaxReps() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numOfSets; i++) {
            if (reps[i] > max) {
                max = reps[i];
            }
        }
        return max;
    }

    public double getMaxWeigt() {
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < numOfSets; i++) {
            if (weightPerRep[i] > max) {
                max = weightPerRep[i];

            }
        }
        return max;
    }

    @Override 
    public String toString() {
        if (numOfSets == 0) {
            return nameOfExercise + " 0 sets.";
        }
        String result = "";
        if (numOfSets > 0) {
            for (int i = 0; i < numOfSets; i++) {
                if (i != 0) {
                    result = result + "\n";
                }
                result = result + nameOfExercise + ": " + reps[i] + " x " + weightPerRep[i];
            }
        }
        return result;
    }
}
