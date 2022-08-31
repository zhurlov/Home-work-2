import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Main {
    public static void main(String[] args) {
        var dog = 8;
        System.out.println(dog);
        dog = dog +4;
        System.out.println(dog);
        var dogpos = 12.0;
        System.out.println(dogpos);
        dogpos = dogpos -3.5;
        System.out.println(dogpos);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat +4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper +4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend /7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);

        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var totalWeightOfTwoFighters = boxerOne + boxerTwo;
        System.out.println("Общий вес двух бойцов " + totalWeightOfTwoFighters + " кг");

        var weightDifferenceBetweenFighters = boxerTwo - boxerOne;
        System.out.println("Разница в весе между бойцами " + weightDifferenceBetweenFighters + " кг");

        var weightDifferenceOfAthletes = (boxerOne - boxerTwo) % totalWeightOfTwoFighters;
        System.out.println("Разница в весе по остаточному делению " + weightDifferenceOfAthletes + " кг");

        var totalHours = 640;
        var workingTimePerEmployee = 8;
        var totalEmployeesInTheCompany = totalHours / workingTimePerEmployee;
        System.out.println("Всего работников в компании - " + totalEmployeesInTheCompany + " человек");


        var moreThanTheStaffOfAnotherCompany = 94;
        var numberOfPeopleOfAnotherCompany = moreThanTheStaffOfAnotherCompany + totalEmployeesInTheCompany;
        var numberOfHoursForAllEmployees = workingTimePerEmployee * numberOfPeopleOfAnotherCompany;
        System.out.println("Если в компании работает " + numberOfPeopleOfAnotherCompany + " ,то всего " + numberOfHoursForAllEmployees
        + " часов работы может быть поделено между сотрудниками.");












    }


}

