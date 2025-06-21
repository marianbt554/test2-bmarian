import java.util.Scanner;

public class FindLetter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine();
        String newSentence = sentence.toLowerCase();

        int firstM = newSentence.indexOf('m');
        int lastM = newSentence.lastIndexOf('m');

        if (firstM != -1){

            System.out.println(" Letter 'm' appears first at " + firstM);
            System.out.println("Letter 'm' appears last at " + lastM);
        }else {
            System.out.println("There is no 'm' in the sentence");
        }
    }
}
