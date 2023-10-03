public class Main {
    public static void main(String[] args)
    {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper); //задача 1

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper); //задача 2

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper); //задача 3

        var friend = 19;
        System.out.println (friend);
        friend = friend + 2;
        System.out.println (friend);
        friend = friend / 7;
        System.out.println (friend); //задача 4

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog); //задача 5

        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var weightTotal = weightFirstBoxer + weightSecondBoxer;
        System.out.println(weightTotal);
        var weightDifference = weightFirstBoxer - weightSecondBoxer; //в разнице должен обязательно получиться положительный результат? или это не важно?
        System.out.println(weightDifference); // задача 6

        weightDifference = weightSecondBoxer - weightFirstBoxer;
        System.out.println(weightDifference);
        weightDifference = weightSecondBoxer % weightFirstBoxer;
        System.out.println(weightDifference); //задача 7

        var workHoursGeneral = 640;
        var workHoursPersonality = 8;
        var workPeople = workHoursGeneral / workHoursPersonality;
        System.out.println("Всего работников в команде " + workPeople + " человек"); //задача 8.1

        workPeople = workPeople + 94;
        workHoursGeneral = workPeople * workHoursPersonality;
        System.out.println("Если в компании работает " + workPeople + " человек, то всего " + workHoursGeneral + " часов работы может быть поделено между сотрудниками"); //задача 8.2








    }
}