package ThirdClass;

public class StringManupulationProgram {
    public static void main(String[] args) {
        String countryName = "Bangladesh";

        String name="hasibol islam";
        String Email="hasib2026@gmai1l.com";
        System.out.println(Email.substring(5,9));

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name.trim());
        System.out.println(name.replace('o','u'));
        System.out.println(Email.replaceAll("[0-9]"," "));
        System.out.println(name.replaceAll(" ",""));
        System.out.println();
//        System.out.println(Email.trim();


        System.out.println("Total length of country : " + countryName.length());
        System.out.println("index of country : " + countryName.charAt(5));
        System.out.println("character of country : " + countryName.indexOf('g'));

        if (countryName.contains("Bang")) {
            System.out.println("Match data");
        } else {
            System.out.println("Not match");
        }


        if (countryName.equals("Bangladesh")) {
            System.out.println("Match data");
        } else {
            System.out.println("Not match");
        }
    }
}
