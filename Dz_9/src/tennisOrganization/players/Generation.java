package tennisOrganization.players;

import java.util.Random;

public class Generation {
    private String [] name = new String[48];

    private Random random = new Random();



    private void generationName() {
        try {
            for (int i = 0; i < name.length; i++) {
                name[i] = "Player[" + (i + 1) + "]";
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    protected String getName() {
        generationName();
        int name = random.nextInt(this.name.length);
        return this.name[name];
    }


    protected int getAge() {
        int age = 20 - (int)(Math.random() * (20 - 40));
        return age;
    }

    protected int getSkillPlay() {
        int skill = random.nextInt(100);
        return skill;
    }

}


