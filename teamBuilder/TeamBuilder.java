package teamBuilder;

import java.util.ArrayList;
import java.util.Random;

import units.*;

public class TeamBuilder {

    private ArrayList<Person> hollyTeam;
    private ArrayList<Person> darkTeam;

    public TeamBuilder() {
        this.hollyTeam = teamBuilder("holly");
        this.darkTeam = teamBuilder("dark");
    }

    public ArrayList<Person> getHollyTeam() {
        return hollyTeam;
    }

    public ArrayList<Person> getDarkTeam() {
        return darkTeam;
    }

    private ArrayList<Person> teamBuilder(String teamName) {
        ArrayList<Person> team = new ArrayList<Person>();
        int val;

        switch (teamName) {
            case "holly":
                val = 0;
                break;
            case "dark":
                val = 3;
                break;
            default:
                val = 0;
        }

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4) + val) {
                case 0:
                    team.add(new Crossbowman(getName(), new Random().nextInt(20, 61), 0, i));
                    break;
                case 1:
                    team.add(new Wizard(getName(), new Random().nextInt(20, 61), 0, i));
                    break;
                case 2:
                    team.add(new Pikeman(getName(), new Random().nextInt(20, 61), 0, i));
                    break;
                case 3:
                    team.add(new Peasant(getName(), new Random().nextInt(20, 61), val * 3, i));
                    break;
                case 4:
                    team.add(new Sniper(getName(), new Random().nextInt(20, 61), 9, i));
                    break;
                case 5:
                    team.add(new Monk(getName(), new Random().nextInt(20, 61), 9, i));
                    break;
                case 6:
                    team.add(new Robber(getName(), new Random().nextInt(20, 61), 9, i));
                    break;
            }
        }

        return team;
    }

    private String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}