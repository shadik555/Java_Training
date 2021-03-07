package HomeWork_23;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer("Pavel1");
        Programmer programmer2 = new Programmer("Pavel2");
        Programmer programmer3 = new Programmer("Pavel3");
        Driver driver1 = new Driver("Artyom1");
        Driver driver2 = new Driver("Artyom2");
        Driver driver3 = new Driver("Aryom3");
        Cook cook1 = new Cook("Sergey1");
        Cook cook2 = new Cook("Sergey2");
        Cook cook3 = new Cook("Sergey3");
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(programmer1);
        workers.add(programmer2);
        workers.add(programmer3);
        workers.add(driver1);
        workers.add(driver2);
        workers.add(driver3);
        workers.add(cook1);
        workers.add(cook2);
        workers.add(cook3);
        for (Worker worker : workers) {
            worker.voice();
        }
        ArrayList<CodeWritable>programmers = new ArrayList<>();
        programmers.add(programmer1);
        programmers.add(programmer2);
        programmers.add(programmer3);
        for(CodeWritable programmer: programmers){
            programmer.writecode();
        }

        ArrayList<Drivable>drivers = new ArrayList<>();
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
        for(Drivable driver : drivers){
            driver.capableOfDriving();
        }

        ArrayList<Cookable>cookers = new ArrayList<>();
        cookers.add(cook1);
        cookers.add(cook2);
        cookers.add(cook3);
        for(Cookable cooker : cookers){
            cooker.ableToMake();
        }


    }
}
