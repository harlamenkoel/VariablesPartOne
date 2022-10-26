public class VariablesPartOne {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Переменная dog = " + dog);
        System.out.println("Переменная cat = " + cat);
        System.out.println("Переменная paper = " + paper);

        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Увеличили переменную dog на 4 = " + dog);
        System.out.println("Увеличили переменную cat на 4 = " + cat);
        System.out.println("Увеличили переменную paper на 4 = " + paper);

        System.out.println("Задача 3");
        var dog1 = 8.0;
        dog1 = dog1 - 3.5;
        cat = cat - 1.6;
        paper -= 7639;
        System.out.println("Уменьшили переменную dog на 3,5 = " + dog1);
        System.out.println("Уменьшили переменную cat на 1,6 = " + cat);
        System.out.println("Уменьшили переменную paper на 7639 = " + paper);

        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("Переменная friend = " + friend);
        friend += 2;
        System.out.println("Увеличили переменную friend на 2 = " + friend);
        friend /= 7;
        System.out.println("Разделили переменную friend на 7 = " + friend);

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("Переменная frog = " + frog);
        frog *= 10;
        System.out.println("Умножили переменную frog на 10 = " + frog);
        frog /= 3.5;
        System.out.println("Разделили переменную frog на 3.5 = " + frog);
        frog += 4;
        System.out.println("Увеличили переменную frog на 4 = " + frog);

        System.out.println("Задача 6");
        var fighterWeight1 = 78.2;
        var fighterWeight2 = 82.7;
        var fightersWeight = fighterWeight1 + fighterWeight2;
        System.out.println("Общий вес бойцов: " + fightersWeight);
        System.out.println("Разница веса бойцов через вычитание: " + fighterWeight2 + " кг");

        System.out.println("Задача 7");
        var fightersDifferenceWeight1 = fighterWeight2 - fighterWeight1;
        System.out.println("Разница веса бойцов через вычитание: " + fightersDifferenceWeight1 + " кг");
        var fightersDifferenceWeight2 = fighterWeight2 % fighterWeight1;
        System.out.println("Разница веса бойцов через остаток от деления: " + fightersDifferenceWeight2 + " кг");

        System.out.println("Задача 8");
        var generalHours = 640;
        var employeeHours = 8;
        var employees = generalHours / employeeHours;
        System.out.println("Всего работников в компании – " + employees + " человек");
        employees += 94;
        generalHours = employees * employeeHours;
        System.out.println("Если в компании работает " + employees + " человек, то всего " + generalHours + " часов работы может быть поделено между сотрудниками");


    }
}