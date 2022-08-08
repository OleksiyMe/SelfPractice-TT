package mentorSession;

import java.util.Locale;

public class AnimalTask {

    public static void main(String[] args) {

        String animal1 = "lion king",
                dish1 = "lagmang g7";

        boolean isAllowedToBringTheDish = false;


        if (animal1.charAt(0) == dish1.toLowerCase().charAt(0)
                && animal1.toLowerCase(Locale.ROOT).charAt(animal1.length() - 1) == dish1.charAt(dish1.length()-1)) {

           isAllowedToBringTheDish = true;
        } //else isAllowedToBringTheDish =false;


        System.out.println("isAllowedToBringTheDish = " + isAllowedToBringTheDish);
    }






        /*All the animals are having a feast! Each animal is bringing one dish. There is just one rule:
        The dish must start and end with the same letters as the animal's name. For example, the great blue heron
        is bringing garlic naan and the chickadee is bringing chocolate cake.

        Write a method that takes the animal's name and dish as arguments and returns true or false to indicate
         whether the beast is allowed to bring the dish to the feast.
        Assume that beast and dish are always lowercase strings, and that each has at least two letters.
         Beast and dish may contain hyphens and spaces, but these will not appear at the beginning or end of the string.
         They will not contain numerals.
*/
}

