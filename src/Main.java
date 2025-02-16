public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        var dog = 8.0 ;
        System.out.println(dog) ;
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задание 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задание 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задание 6");
        var boxerWeight1 = 78.2;
        System.out.println(boxerWeight1 + "кг");
        var boxerWeight2 = 82.7;
        System.out.println(boxerWeight2 + "кг");
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println(totalWeight + "кг");
        var weihtDifference = boxerWeight2 - boxerWeight1;
        System.out.println(weihtDifference + "кг");

        System.out.println("Задание 7");
        var remainder = (boxerWeight1 - boxerWeight2)%totalWeight;
        System.out.println(remainder + "кг разница между боксёрами !");

        System.out.println("Задание 8");
        var totalTime = 640;
        System.out.println(totalTime);
        var workingTime = 8;
        System.out.println(workingTime);
        var workers=totalTime / workingTime;
        System.out.println("Всего работников в компании"+workers+"человек");
        var workers2 = 94;
        System.out.println(workers2);
        var totalTime2 = workers2 * workingTime;
        System.out.println("Если в компании работает" + workers2 + "человек, то всего" + totalTime2 + "часов работы может быть поделено между сотрудниками");
        





    }
}

