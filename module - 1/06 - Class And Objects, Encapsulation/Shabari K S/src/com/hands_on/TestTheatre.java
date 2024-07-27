package com.hands_on;

class Theatre{
    private int theatreId;
    private String theatreName;
    private int totalTheatreScreens;
    private String theatreLocation;

    Theatre(int theatreId, String theatreName, int totalTheatreScreens, String theatreLocation){
        this.theatreId = theatreId;
        this.theatreName = theatreName;
        this.totalTheatreScreens = totalTheatreScreens;
        this.theatreLocation = theatreLocation;
    }

    public void display(){
        System.out.println("---------------------  Theater Details  ---------------------");
        System.out.println("Theater ID: " + theatreId);
        System.out.println("Theater Name: " + theatreName);
        System.out.println("Total Screens: " + totalTheatreScreens);
        System.out.println("Theater Location: " + theatreLocation);
        System.out.println("-------------------------------------------------------------");
    }
}

public class TestTheatre {
    public static void main(String[] args) {
        Theatre t1 = new Theatre(1, "PVR", 5, "Hyderabad");
        Theatre t2 = new Theatre(2, "INOX", 3, "Bangalore");
        Theatre t3 = new Theatre(3, "Cinepolis", 4, "Chennai");
        t1.display();
        t2.display();
        t3.display();
    }
}