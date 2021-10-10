package com.test.china.springboot0506;

public class Test1 {
    public static void main(String[] args) {
        for (Week week : Week.values()){
            System.out.println("week:"+week);
        }

        System.out.println("-----------------------");

        switch (Week.MON){
            case SUN:
                break;
            case FIF:
                break;
            case FRI:
                break;
            case SAT:
                break;
            case THR:
                break;
            case TUS:
                break;
            case MON:
                break;
        }


    }
}
