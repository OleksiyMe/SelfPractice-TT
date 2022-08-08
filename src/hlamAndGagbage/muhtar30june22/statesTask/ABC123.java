package hlamAndGagbage.muhtar30june22.statesTask;

public class ABC123 {

    public static void main(String[] args) {

        double distance=1;
        double radius=10;
        String result = "";
        for (int i = 0; i <= 2 * radius; i++) {
            for (int j = 0; j <= 2 * radius; j++) {
                distance = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius));
                if(distance > radius - 0.5 && distance < radius + 0.5){
                    result += "*";
                } else {
                    result += " ";
                }
            }
            result += "\n";
        }
        System.out.println(result);


    }
}
