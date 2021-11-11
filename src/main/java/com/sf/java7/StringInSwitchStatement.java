package com.sf.java7;

public class StringInSwitchStatement {

    public static void main(String[] args) {
        String game = "Cricket";
        switch(game){
            case "Hockey":
                System.out.println("Let's play Hockey");
                break;
//            case "Cricket":
//                System.out.println("Let's play Cricket");
//                break;
            case "Chess": case"Card-Games": case"Cricket": case"Indoor basketball":
                System.out.println("Let's play cricket");
                break;
        }
    }
}
