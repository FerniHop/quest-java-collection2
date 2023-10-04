import java.util.*;

public class Thanos {

        public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        Hero Black_Widow = new Hero ("Black Widow", 34);
        Hero Captain_America = new Hero ("Captain America", 100);
        Hero Vision = new Hero ("Vision", 3);
        Hero Iron_Man = new Hero ("Iron Man", 48);
        Hero Scarlet_Witch = new Hero ("Scarlet Witch", 29);
        Hero Thor = new Hero ("Thor", 1500);
        Hero Hulk = new Hero ("Hulk", 49);
        Hero Doctor_Strange = new Hero ("Doctor Strange", 42);

    List<Hero> listHeroes = new ArrayList<>();
        // TODO 2 : Add those heroes to the list

        listHeroes.add(Black_Widow);
        listHeroes.add(Captain_America);
        listHeroes.add(Vision);
        listHeroes.add(Iron_Man);
        listHeroes.add(Scarlet_Witch);
        listHeroes.add(Thor);
        listHeroes.add(Hulk);
        listHeroes.add(Doctor_Strange);

        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42

        // TODO 3 : It's Thor birthday, now he's 1501

        Thor.setAge(1501);

        // TODO 4 : Shuffle the heroes list

        Collections.shuffle(listHeroes);

        // TODO 5 : Keep only the half of the list

        int halfSize = listHeroes.size() / 2;
        List<Hero> heroAlive = listHeroes.subList(0, halfSize);

        // TODO 6 : Loop throught the list and display the name of the remaining heroes

        System.out.println("$ Heros Alive : ");
        for (Hero hero : heroAlive){
            System.out.println(hero.getName());
        }

        //TODO 7 : Sort by Name

        Collections.sort(heroAlive);

        System.out.println("\n$ Order by name :");
        for (Hero hero : heroAlive) {
            System.out.println("$ " + hero.getName() + ", " + hero.getAge());
        }

        //Comparator

        Comparator<Hero> ageComparator = new Comparator<Hero>() {
        @Override
        public int compare(Hero hero1, Hero hero2) {
            return hero2.getAge() - hero1.getAge();
            }
        };

        // Order by age

        Collections.sort(heroAlive, ageComparator);

        System.out.println("\n$ Order by age :");
        for (Hero hero : heroAlive) {
            System.out.println("$ " + hero.getName() + ", " + hero.getAge());
        }
    }
}
