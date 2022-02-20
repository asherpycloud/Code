package CCL1.C202109;

import java.util.Locale;
import java.util.Scanner;

public class C013Light {
        boolean on; //status of light
        boolean burntOut; //if light is burned out or not
        String color; //colour of the light bulb

        public C013Light(){ // this is default constructor (setting everything as the default)
                on = true;
                burntOut = false;
                color = "white";
        }

        //stuf in the brackets are called parameters
        public C013Light(boolean pOn, boolean pburntOut, String pColor){ // this constructor is to customize your light
                on = pOn;
                burntOut = pburntOut;
                if(burntOut) on = false; //if the light bulb is burnt out, then its just broken so you gotta set on to false
                color = pColor.toLowerCase(); //set the pcolor string to lowercase to make consistent
                if(!(color.equals("red") || color.equals("green") || color.equals("blue"))) color = "white";
        }

        public String toString(){ //this function is for printing the object in the string
                StringBuilder sb = new StringBuilder(); //this is a datatype which is creating a new object
                if(on) sb.append("on"); //to print if light bulb is on
                else sb.append("off"); // to print to if light bulb is off
                sb.append(" "); // to add a space between everything
                sb.append(color); // to print the color
                sb.append("\t"); // add a tab before burnt out or not
                if(burntOut) sb.append("burnt off"); // to print if your light bulb is burnt out or not
                else sb.append("not burnt off"); // to print if your light bulb is not burnt out
                return sb.toString(); // to turn string builder into a string
        }

        public void flip(){
                if(on) on = false;
                else on = true;
        }

        public String getColor(){
                return color;
        }

        public void setColor(String c){
                color = c.toLowerCase(); //set the pcolor string to lowercase to make consistent
                if(!(color.equals("red") || color.equals("green") || color.equals("blue"))) color = "white";
        }

        public boolean isOn(){
                return on;
        }

        public void burnOut(){
                burntOut = true;
                on = false;
        }
}

