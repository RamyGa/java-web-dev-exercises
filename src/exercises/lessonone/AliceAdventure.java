package exercises;

import java.util.Scanner;

public class AliceAdventure {

    public static void main(String[] args) {
        String aliceAdventure = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?";

      Scanner input = new Scanner(System.in);

        System.out.println("please type a term that might be included in the sentence of the alice adventure: ");
       // aliceAdventure.equals(input.nextLine());
      String a =  aliceAdventure.toLowerCase();
      String inputFromUser = input.nextLine().toLowerCase();

      String part1 = "";
      String part2 = "";


        if(a.contains(inputFromUser)){
            int index = a.indexOf(inputFromUser);
            int length = inputFromUser.length();
            System.out.println("index of term: "+ index);
            System.out.println("length of term: "+ length);
            System.out.println("true");
//            System.out.println(a.split(inputFromUser, a.indexOf(inputFromUser) ), );
            part1 = a.substring(0,index);
            part2 = a.substring(index + length);
            System.out.println(part1 + part2);



            //System.out.println(a.split(inputFromUser).toString());
           // System.out.println(a.replaceAll(inputFromUser, " "));
            ;

        }






    }
}
