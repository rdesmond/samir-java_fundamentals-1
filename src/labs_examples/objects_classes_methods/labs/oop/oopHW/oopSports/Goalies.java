package labs_examples.objects_classes_methods.labs.oop.oopHW.oopSports;

public class Goalies extends Players {

    int goalsAllowed;
    double rating;

//    public Goalies(String teamName, String homeTown, int place2022) {
//        super(teamName, homeTown, place2022);
//    }

    public int getGoalsAllowed() {
        return goalsAllowed;
    }
    public Goalies(String namePlayer, double height, int weight) {
        super(namePlayer, height, weight);

        public void setGoalsAllowed(int goalsAllowed) {
        this.goalsAllowed = goalsAllowed;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


    }


        }


}
