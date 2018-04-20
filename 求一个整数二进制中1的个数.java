public class class3 {

    public static void main(String[] args) {
        int result = 0;

        Scanner in = new Scanner(System.in);

        String start = Integer.toBinaryString(in.nextInt());

        String[] startArray = start.split("");

        for(int i=0;i<startArray.length;i++){
            if(startArray[i].equals("1")){
                result++;
            }
        }
        System.out.println(result);
    }
}
