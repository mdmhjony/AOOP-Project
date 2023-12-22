package controllers;

public class Session {
    static public boolean loggedIn;
    static public String userName;
    static public String userType;
    static public String FullName = "Tauhid Hasan";

    Session(String userName,String fullName){
        this.loggedIn = true;
        this.FullName = fullName;
        this.userName = userName;
    }
    static void endSession(){
//        loggedIn = false;
//        userName = null;
//        userType = null;
//        FullName = null;
        System.out.println(userName);
    }

}
