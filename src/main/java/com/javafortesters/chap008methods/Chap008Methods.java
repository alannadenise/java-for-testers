package com.javafortesters.chap008methods;

public class Chap008Methods {

    public static String catOrCats(int numOfCats){
        String text = numOfCats == 1 ? "cat" : "cats";

        System.out.println(text);
        return text;
    }

    public static String countryIs(String abbreviation){
        String country;

        switch(abbreviation.toUpperCase()){
            case "UK":
                country = "United Kingdom";
                break;
            case "USA":
                country = "United States";
                break;
            default:
                country = "Rest of the world";
                break;
        }
        System.out.println(country);
        return country;
    }

    public static String writeNumber(int number){
        String writtenNumber = "";

        switch(number){
            case 1:
                writtenNumber = "One";
                break;
            case 2:
                writtenNumber = "Two";
                break;
            case 3:
                writtenNumber = "Three";
                break;
            default:
                if(number > 3){
                    writtenNumber ="Too big";
                }
                if(number < 1){
                    writtenNumber = "Too small";
                }
                break;
        }
        System.out.println(writtenNumber);
        return writtenNumber;
    }

}
