public class Workout {
    private String nameOfWorkout;
    private Exercise[] chosenExercise = new Exercise[20];
    private Exercise[] availibleExercisesPerDay;
    private int exerciseCount = 0;

    public Workout(String nameOfWorkout, Exercise[] availible) {
        this.nameOfWorkout = nameOfWorkout;
        availibleExercisesPerDay = availible;
    }


    public String getName() {
        return nameOfWorkout;
    }

    public int getExerciseCount() {
        return exerciseCount;
    }

    public Exercise getExercise(int index) {
        return chosenExercise[index];
    }

    public boolean addExercise(Exercise e) {
        if (exerciseCount >= 20) {
            return false;
        }
        else {
            chosenExercise[exerciseCount] = e;
            exerciseCount++;
            return true;
        }
    }
}
