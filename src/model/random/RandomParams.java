package model.random;

import java.util.Random;

public class RandomParams {

    private static Random r = new Random();

    public static String generateFullName(){
        return generateName() + " " + generateLastname();
    }


    private static String generateName(){
        String[] firstname = {
                "Johnathon",
                "Anthony",
                "Erasmo",
                "Raleigh",
                "Nancie",
                "Tama",
                "Camellia",
                "Augustine",
                "Christeen",
                "Luz",
                "Diego",
                "Lyndia",
                "Thomas",
                "Georgianna",
                "Leigha",
                "Alejandro",
                "Marquis",
                "Joan",
                "Stephania",
                "Elroy",
                "Zonia",
                "Buffy",
                "Sharie",
                "Blythe",
                "Gaylene",
                "Elida",
                "Randy",
                "Margarete",
                "Margarett",
                "Dion",
                "Tomi",
                "Arden",
                "Clora",
                "Laine",
                "Becki",
                "Margherita",
                "Bong",
                "Jeanice",
                "Qiana",
                "Lawanda",
                "Rebecka",
                "Maribel",
                "Tami",
                "Yuri",
                "Michele",
                "Rubi",
                "Larisa",
                "Lloyd",
                "Tyisha",
                "Samatha",
    };


        return firstname[r.nextInt (firstname.length - 1)];
    }

    private static String generateLastname(){
        String[] lastname = {
                "Mischke",
                "Serna",
                "Pingree",
                "Mcnaught",
                "Pepper",
                "Schildgen",
                "Mongold",
                "Wrona",
                "Geddes",
                "Lanz",
                "Fetzer",
                "Schroeder",
                "Block",
                "Mayoral",
                "Fleishman",
                "Roberie",
                "Latson",
                "Lupo",
                "Motsinger",
                "Drews",
                "Coby",
                "Redner",
                "Culton",
                "Howe",
                "Stoval",
                "Michaud",
                "Mote",
                "Menjivar",
                "Wiers",
                "Paris",
                "Grisby",
                "Noren",
                "Damron",
                "Kazmierczak",
                "Haslett",
                "Guillemette",
                "Buresh",
                "Center",
                "Kucera",
                "Catt",
                "Badon",
                "Grumbles",
                "Antes",
                "Byron",
                "Volkman",
                "Klemp",
                "Pekar",
                "Pecora",
                "Schewe",
                "Ramage",
        };
        return lastname[r.nextInt (lastname.length -1)];
    }

    public static String generateCity(){

        String[] cities = {
                "Cambridge",
                "Birmingham",
                "Edinburgh",
                "Lincoln",
                "Liverpool",
                "Manchester",
                "London",
                "Leicester",
                "Durham"
        };

        return cities[r.nextInt(cities.length - 1)];
    }

    public static String generateStreet(){
        String[] streets = {
                "Abbey Road",
                "Alfred Street",
                "Becklow Place",
                "Back Lane",
                "Blendon Road",
                "Mount Row",
                "Tower Street",
                "Vernon Street",
                "Weston Street"
        };

        return streets[r.nextInt(streets.length - 1)];
    }

    public static int generatePostalCode(){
        return r.nextInt(10000);
    }
}
