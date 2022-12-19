public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 3
        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //Задача 6
        System.out.println("Задача 6");
        var fistBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var sumBoxerWeight = fistBoxerWeight + secondBoxerWeight; // сумма весов боксеров
        var diffBoxerWeight = secondBoxerWeight - fistBoxerWeight; // разница весов боксеров
        System.out.println(sumBoxerWeight);
        System.out.println(diffBoxerWeight);
        //Задача 7
        System.out.println("Задача 7");
        var diffBoxWeight = secondBoxerWeight - fistBoxerWeight; // разница весов боксеров через вычитание
        var diffBoxWeight1 = secondBoxerWeight % fistBoxerWeight; // разница весов боксеров через остаток от деления
        // выводить на печать в задаче 7 не требовалось =)
        //Задача 8
        System.out.println("Задача 8");
        var hours = 640;
        var hoursWorker = 8;
        var workers = hours / hoursWorker;
        System.out.println("Всего работников в компании - " + workers + " человек");
        workers = workers + 94;
        var newHours = 8 * workers;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + newHours + " часов работы может быть поделено между сотрудниками");
    }
}