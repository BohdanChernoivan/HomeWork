package bohdan.homework.com.fightersFactory.randomСharacteristics;


import bohdan.homework.com.fighters.base.abilities.ElementalFighter;


public class YourElement implements RandomChar {


    ElementalFighter elementalFighter;

    public int randomOneElement() {
        return elementalFighter.elements[random.nextInt(elementalFighter.elements.length)];
    }

    public int randomManyElements() { // needed remake;

        int sumElements = random.nextInt(elementalFighter.elements.length);

        int sum = 0;

        for(int i = 0; i < 4; i++)
        {
            sum += sumElements;
        }
        return sum;
    }

}
