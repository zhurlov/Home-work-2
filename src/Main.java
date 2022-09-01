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


        // Переменные 2
        System.out.println("Переменные 2.");

        int i = 748; // Целочисленные
        byte b = 126;
        short s = 67;
        long l = 92233l;

        float f = 1.5f;  // Дробные
        double d = 6.85464;
        System.out.println("Значение переменной : " + "i = " + i + " ,b = " +b + " ,s = " + s + ",l = " + l
                + " ,f = " + f + " ,d = " + d);

        byte LyudmilaPavlovna = 23;
        byte AnnaSergeyevna = 27;
        byte EkaterinaAndreevna = 30;
        short TotalSheetsOfPaperPurchased = 480;
        var TotalStudents = LyudmilaPavlovna + AnnaSergeyevna + EkaterinaAndreevna;
        var OneStudents = TotalSheetsOfPaperPurchased / TotalStudents;
        System.out.println("На каждого ученика расчитано = " + OneStudents + " листов бумаги");

        var MachinePerformanceInTwoMinutes = 16;
        var NumberOfBottlesPerMinute = MachinePerformanceInTwoMinutes / 2;
        System.out.println("Производительность за 1 минуту = " + NumberOfBottlesPerMinute + " бутылок");
        var SpecifiedPeriodOfTime = 20 * 8;
        var SetTimeInterval_1Day = 24 * 60 * 8;
        var SetPeriodOfTime_3days = 3 * 24 * 60 * 8;
        var SetPeriodOfTime_1month = 30 * 24 * 60 * 8;
        System.out.println ("За 20 минут машина произвела = " + SpecifiedPeriodOfTime + " бутылок");
        System.out.println ("За сутки машина произвела = " + SetTimeInterval_1Day + " бутылок");
        System.out.println ("За 3 дня машина произвела = " + SetPeriodOfTime_3days + " бутылок");
        System.out.println ("За 1 месяц машина произвела = " + SetPeriodOfTime_1month + " бутылок");

        byte TotalCansForSchoolRenovation = 120;
        byte PerClassOfWhitePaint = 2;
        byte ForOneClassOfBrownPaint = 4;
        byte SumOfOneClass = 6;
        int TotalClassesInTheSchool = TotalCansForSchoolRenovation / SumOfOneClass;
        int AllWhitePaint = TotalClassesInTheSchool * PerClassOfWhitePaint;
        int AllBrownPaint = TotalClassesInTheSchool * ForOneClassOfBrownPaint;
        System.out.println("В школе, где " + TotalClassesInTheSchool + " классов, нужно "
                + AllWhitePaint + " банок белой краски и " + AllBrownPaint + " банок коричневой краски");

        float NumberOfBananaPieces = 5 * 80;
        float AmountOfMilkMl = 2 * 105;
        float NumberOfIceCreamPieces = 2 * 100;
        float NumberOfEggs = 4 * 70;
        float ToKilograms = (NumberOfBananaPieces + AmountOfMilkMl + NumberOfIceCreamPieces + NumberOfEggs) /1000;
        System.out.println ("Общий вес завтрака = " + ToKilograms + " кг");

        short NeedToDropGram = 7 * 1000;
        System.out.println("Для участия в соревнованиях, необходимо сбросить = " + NeedToDropGram + " грамм");
        short Diet_1 = 250;
        short Diet_2 = 500;
        int NumberOfDietDays_1 = NeedToDropGram / Diet_1;
        int NumberOfDietDays_2 = NeedToDropGram / Diet_2;
        System.out.println("Количество дней с рационом питания_1 = " + NumberOfDietDays_1 +
        " ,Количество дней с рационом питания_2 = " + NumberOfDietDays_2);

        int CarsCurrentSalary = 67760;
        int CarsCurrentDenis =83690;
        int CarsCurrentChistina = 76230;
        byte OneYear = 12;
        int SalaryAfterAnnualIncreaseMasha = 67760 * 100 /1000 + 67760;
        int SalaryAfterAnnualIncreaseDenis = 83690 * 100 /1000 + 83690;
        int SalaryAfterAnnualIncreaseChristina = 76230 *100 /1000 + 76230;
        int NewAnnualIncomeMasha = SalaryAfterAnnualIncreaseMasha * OneYear;
        int NewAnnualIncomeDenis = SalaryAfterAnnualIncreaseDenis * OneYear;
        int NewAnnualIncomeChristina = SalaryAfterAnnualIncreaseChristina * OneYear;
        int CurrentAnnualIncomeMasha = CarsCurrentSalary * OneYear;
        int CurrentAnnualIncomeDenis = CarsCurrentDenis * OneYear;
        int CurrentAnnualIncomeChristina = CarsCurrentChistina * OneYear;
        int DifferenceInAnnualIncomeMasha = NewAnnualIncomeMasha - CurrentAnnualIncomeMasha;
        int DifferenceInAnnualIncomeDenis = NewAnnualIncomeDenis - CurrentAnnualIncomeDenis;
        int DifferenceInAnnualIncomeChristina = NewAnnualIncomeChristina - CurrentAnnualIncomeChristina;
        System.out.println ("Ежемесячная зарплата с повышением на 10% от текущей зарплаты составила: Маша = "
        + SalaryAfterAnnualIncreaseMasha + " ,Денис = " + SalaryAfterAnnualIncreaseDenis + " ,Кристина = " + SalaryAfterAnnualIncreaseChristina);
        System.out.println("Разница между годовым доходом до и после повышения: Маша = " + DifferenceInAnnualIncomeMasha
        + " ,Денис = " + DifferenceInAnnualIncomeDenis + " , Кристина = " + DifferenceInAnnualIncomeChristina);
        // Все задачи выполнены



















    }


}

