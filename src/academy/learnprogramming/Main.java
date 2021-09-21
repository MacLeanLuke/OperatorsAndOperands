package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int results = 1+2; // 1+2=3
        System.out.println("1+2="+results);
        int previousResult = results;
        System.out.println("previousResult = " + previousResult);
        results = results - 1;
        System.out.println("3-1="+results);
        System.out.println("previousResult = " + previousResult);

        results = results * 10;
        System.out.println("2*10=" + results);

        results = results / 5;
        System.out.println("20/5=" + results);

        results = results % 3;
        System.out.println("4%3="+results);

        // result = result + 1;
        results++;
        System.out.println("1+1="+results);

        results--;
        System.out.println("2-1="+results);

        results += 2;
        System.out.println("1+2="+results);

        results*=10;
        System.out.println("3*10="+results);

        // result  = result /3
        results /=3;
        System.out.println("30/3="+results);

        //result = result - 2;
        results -= 2;
        System.out.println("10-2="+results);

        boolean isAlien = false;
        if (isAlien == false){
            System.out.println("is is not an alien!");
            System.out.println("and I am scared of aliens");
        }
        int topScore = 80;
        if (topScore == 100){
            System.out.println("You got the high score!");
        }
        if (topScore != 100){
            System.out.println("You got the high score!");
        }
        if (topScore >= 100){
            System.out.println("You got the high score!");
        }
        if (topScore <= 100){
            System.out.println("You got the high score!");
        }
        if (topScore < 100){
            System.out.println("You got the high score!");
        }
        if (topScore > 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greter than second top score and less than 100");
        }

        if ((topScore > 90) || (topScore <= 90)){
            System.out.println("Either of both of hte conditions are true");

        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if(!isCar){
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wascar is true");
        }

        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient == 20 )? true : false;
        if(isEighteenOrOver){
            System.out.println("isEighteenOrOver is true");
        }


    }
}
