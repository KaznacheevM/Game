/*
Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах".
Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд).
Создать абстрактный класс и иерархию наследников. Расположить классы в пакет так, чтобы в основной программе небыло видно их полей.
В не абстрактных классах переопределить метод toString() так чтобы он возвращал название класса или имя.
Создать в основной программе по одному обьекту каждого не абстрактного класса и вывести в консоль его имя.
*/

/*
Создать две команды по 10 человек. Первая команда: крестьянин, волшебник, арбалетчик, копейщик.
Вторая: крестьянин, снайпер, монах и вор. Каждому задать случайное имя и вывести в консоль.
Добавить в проект класс, предназначенный для хранения координат.
Добавить в абстрактный класс поле, экземпляр класс координат.
Пробросить координаты через конструкторы наследников так, чтобы создавая объекты вы передавали в параметрах имя и аоординаты.
Скорректировать алгоритм заполнения комманд. Кроме имён каждый персонаж должен иметь координаты.
Одна комманда находится с левой стороны другая с правой(у=0 и у=9).
В класс лучников добавить метод поиск ближайшего противника. Алгоритм расчёта расстояний реализовать в классе координат.
*/

/*
Добавить в файл интерфейса метод void step() это будет основной метод взаимодействыия с объектами.
Добавить интерфейс в базовый абстрактный класс. Реализовать этот метод во всех классах наследниках.
Для начала просто заглушкой. Доработать классы лучников.
Лучник должен во первых проверить жив ли он и есть ли у него стрелы, если нет то завершить метод.
Есль всё да, то найти ближайшего противника и выстрелить по немы и, соответственно потратить одну стрелу.
Реализовать весь функционал лучников в методе step(). Добавить в абстрактный класс int поле инициатива.
В классах наследников инициализировать это поле. Крестьянин = 0, маги=1, пехота=2, лучники=3.
В мэйне сделать так, чтобы сначала делали ход персонажи с наивысшей инициативой из обеих комманд а с наименьшей в конце.
*/

/*
Реализовать метод step() пехоты. Первое проверяем живы ли мы, потом ищем ближайшего противника.
Если противник в соседней клетке, наносим повреждение. Иначе двигаемся в сторну противника.
Алгоритм движения, если dX>dY двигаемся по x иначе по y. dX и dY (разница наших координат и ближайшего противника)
знаковые, от знака зависит направление.
*/

/*
Добавить в проект классы View и AnsiColors. Доработать проект так, чтобы выводилось состаяние в консоль.
Если в одной из комманд погибли все, приложение закрывается с поздравлением победившей команды.
Добавить в интерфейс метод getInfo() в котором хранится название персонажа,
что он сделал в этот ход(выстрелил, вылечил, сходил), и с ком он это сделал!)
*/

import java.util.ArrayList;
import java.util.Scanner;

import teamBuilder.TeamBuilder;
import units.*;

public class Main {
    static ArrayList<Person> hollyTeam;
    static ArrayList<Person> darkTeam;
    static ArrayList<Person> sorted = new ArrayList<Person>();

    public static void main(String[] args) {
        TeamBuilder teams = new TeamBuilder();
        hollyTeam = teams.getHollyTeam();
        darkTeam = teams.getDarkTeam();
        sorted.addAll(hollyTeam);
        sorted.addAll(darkTeam);
        sorted.sort(new TeamsSorter());

        Scanner in = new Scanner(System.in);

        while (true) {
            View.view();
            for (Person person : sorted) {
                if (hollyTeam.contains(person)) {
                    person.step(darkTeam, hollyTeam);
                } else if (darkTeam.contains(person)) {
                    person.step(hollyTeam, darkTeam);
                }
            }

            in.nextLine();
            if (isEmpty(hollyTeam)) {
                View.view();
                System.out.println("Победила тёмная команда");
                break;
            }
            if (isEmpty(darkTeam)) {
                View.view();
                System.out.println("Победила светлая команда");
                break;
            }
        }
    }
    
    private static boolean isEmpty(ArrayList<Person> team) {
        for (Person person : team) {
            if (person.isAlive()) {
                return false;
            }
        }
        return true;
    }
}