public class IfElse {
    public static void main(String[] args) {
        //int grade = 65;
        //int grade = 40;
        //int grade = 50;
        int grade = 80;

        if (grade >= 80) {
            System.out.println("You got an A");
        }else if (grade >=70){
            System.out.println("You got B");
        }else if (grade >= 60){
            System.out.println("you got C");
        }else if (grade >= 50) {
            System.out.println("You got a D");
        }else {
            System.out.println("Study hard next time!");
        }
    }
}
