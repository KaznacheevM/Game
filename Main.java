// Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах". Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд). Создать абстрактный класс и иерархию наследников. Расположить классы в пакет так, чтобы в основной программе небыло видно их полей. В не абстрактных классах переопределить метод toString() так чтобы он возвращал название класса или имя. Создать в основной программе по одному обьекту каждого не абстрактного класса и вывести в консоль его имя.

import units.*;

public class Main {

    public static void main(String[] args) {
        Robber robber = new Robber("Andrey", 20);
        Peasant peasant = new Peasant("Anton", 20);
        Sniper sniper = new Sniper("Matvey", 20);
        Wizard wizard = new Wizard("Igor", 20);
        Pikeman pikeman = new Pikeman("Vasyli", 20);
        Crossbowman crossbowman = new Crossbowman("Aleksander", 20);
        Monk monk = new Monk("Nikita", 20);

        System.out.println(robber);
        System.out.println(peasant);
        System.out.println(sniper);
        System.out.println(wizard);
        System.out.println(pikeman);
        System.out.println(crossbowman);
        System.out.println(monk);

    }
}