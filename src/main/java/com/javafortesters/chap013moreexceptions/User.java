package com.javafortesters.chap013moreexceptions;

public class User {


    private String username;
    private String password;

    public User() {
        try {
            this.username = "username";
            setPassword("Passw0rd");
        }catch(InvalidPassword e){
            throw new IllegalArgumentException(
                    "Default password incorrect ", e);
        }
    }

    public User(String username, String password) throws InvalidPassword {
        this.username = username;
        setPassword(password);
    }

    public void setPassword(String password) throws InvalidPassword {

        if(password.length()<7){
            throw new InvalidPassword("Password must be > 6 chars");
        }

        if(!password.matches(".*[0123456789]+.*")){
            throw new InvalidPassword("Password must contain a number");
        }

        if(!password.matches(".*[A-Z]+.*")){
            throw new InvalidPassword("Password must contain one uppercase letter");
        }

        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    /*  unused exceptions - might use later
        if(!password.matches(".*[0123456789]+.*")){
            throw new IllegalArgumentException("Password must have a digit");
        }
        if(!password.matches(".*[A-Z]+.*")){
            throw new IllegalArgumentException("Password must have an Uppercase Letter");
        }
     */

}
