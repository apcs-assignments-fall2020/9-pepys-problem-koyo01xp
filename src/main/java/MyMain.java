import java.util.zip.ZipEntry;

public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int probs = 0;
        for (int a = 0;a < 10000;a++){
            for(int b = 0;b<6;b++){
                int numb = (int)((Math.random() * 6)+1);
                if(numb ==6){
                    probs+=1;
                    break;
                }
            }
        }
        double c = (float)probs / (float)10000* 100;
        return (c);
    }
    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int probs = 0;
        for (int a = 0;a < 10000;a++){
            int counter = 0;
            for(int b = 0;b<12;b++){
                int numb = (int)((Math.random() * 6)+1);
                if((numb ==6)&&(counter == 1)){
                    probs+=1;
                    break;
                }
                else if(numb == 6){
                    counter+= 1;
                }
            }
        }
        double c = (float)probs / (float)10000* 100;
        return (c);
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int probs = 0;
        for (int a = 0;a < 10000;a++){
            int counter = 0;
            for(int b = 0;b<18;b++){
                int numb = (int)((Math.random() * 6)+1);
                if((numb ==6)&&(counter == 2)){
                    probs+=1;
                    break;
                }
                else if(numb == 6){
                    counter+= 1;
                }
            }
        }
        double c = (float)probs / (float)10000* 100;
        return (c);
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
        System.out.println(probabilityOneSix());
        System.out.println(probabilityTwoSixes());
        System.out.println(probabilityThreeSixes());
    }
}
