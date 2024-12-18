package com.example.project;
import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    private static int totalTime;

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        private String name;
        private int speed;
        private int timeRun;
        private int timeRest;
        private int distance = 0;
        private int time = 0;

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.timeRun = runDuration;
            this.timeRest = restDuration;
        }

        public int getDistanceTraveled(){ // this method is required
            distance = 0;
            int cycleTime = timeRun + timeRest;
            int cycles = time / cycleTime;
            int remainTime = time % cycleTime;
            distance += cycles * (speed * timeRun);
            distance += remainTime * speed;
            return distance;
        }

        public String getName() {
            return name;
        }
        

        public void simulateSecond(){ //this method is required but not tested
            time++;
        }

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        int maxDistance = 0;
        Reindeer winner = reindeers[0];
        for(int i = 0; i < reindeers.length; i ++) {
            for(int j = 0; j < time; j ++) {
                reindeers[i].simulateSecond();
            }
            if(reindeers[i].getDistanceTraveled() > maxDistance) {
                maxDistance = reindeers[i].getDistanceTraveled();
                winner = reindeers[i];
            }
        }
        return winner.getName();
    }

    
    public static void main(String[] args) { // for testing purposed
        // Day4.Reindeer[] reindeers = {
        //     new Day4.Reindeer("Dasher", 100, 5, 2),
        //     new Day4.Reindeer("Dancer", 120, 4, 3),
        //     new Day4.Reindeer("Prancer", 70, 6, 1)
        // };

        // String winner = Day4.simulateRace(5, reindeers);
        // System.out.println(reindeers[0].getDistanceTraveled());
        // System.out.println(reindeers[1].getDistanceTraveled());
        // System.out.println(reindeers[2].getDistanceTraveled());

        Day4.Reindeer reindeer = new Day4.Reindeer("Dasher", 100, 5, 2);

        // Siamulate 5 seconds of running
        for (int i = 0; i < 5; i++) {
            reindeer.simulateSecond();
        }
        
    }

 
}



