package com.company;

public class Distance {

    public int meter;
    public int cm;

    public Distance(){

    }

    public Distance(int meter, int cm){
        this.cm = cm;
        this.meter = meter;
    }

    public boolean compare(Distance d1, Distance d2){
        return d1.meter > d2.meter;
    }

    public void sortDistances(Distance[] distances){
        for(int x=1; x<distances.length-1; x++){
            this.compare(distances[x], distances[x+1]);
        }
    }

    public void print(){
        System.out.println("Distance in meter: " + this.meter );
        System.out.println("Distance in cm: " + this.cm);
    }

}
