public class romanToInt{
    public static void main(String[] args) {
        String s = args[0];
        String[] romarr = s.split("");
        int counter = 0;
            if (romarr[0].equals("I")){
                counter ++;
                }
            if (romarr[0].equals("V")){
                counter += 5;
                }
            if (romarr[0].equals("X")){
                counter += 10;
                }
            if (romarr[0].equals("L")){
                counter += 50;
                }
            if (romarr[0].equals("C")){
                counter += 100;
                }
            if (romarr[0].equals("D")){
                counter += 500;
                }
            if (romarr[0].equals("M")){
                counter += 1000;
                }
            for (int i = 1; i < romarr.length; i++) {
                if (romarr[i].equals("I")){
                    counter ++;
                }
                if (romarr[i].equals("V") && !romarr[i-1].equals("I")){
                    counter += 5;
                }
                if (romarr[i].equals("V") && romarr[i-1].equals("I")){
                    counter += 3;
                }
                if (romarr[i].equals("X") && !romarr[i-1].equals("I")){
                    counter += 10;
                }
                if (romarr[i].equals("X") && romarr[i-1].equals("I")){
                    counter += 8;
                }
                if (romarr[i].equals("L") && !romarr[i-1].equals("X")){
                    counter += 50;
                }
                if (romarr[i].equals("L") && romarr[i-1].equals("X")){
                    counter += 30;
                }
                if (romarr[i].equals("C") && !romarr[i-1].equals("X")){
                    counter += 100;
                }
                if (romarr[i].equals("C") && romarr[i-1].equals("X")){
                    counter += 80;
                }
                if (romarr[i].equals("D") && !romarr[i-1].equals("C")){
                    counter += 500;
                }
                if (romarr[i].equals("D") && romarr[i-1].equals("C")){
                    counter += 300;
                }
                if (romarr[i].equals("M") && !romarr[i-1].equals("C")){
                    counter += 1000;
                }
                if (romarr[i].equals("M") && romarr[i-1].equals("C")){
                    counter += 800;
                }
        }
    System.out.println(counter);
    }
}
