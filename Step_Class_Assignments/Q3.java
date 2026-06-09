//package Step_Class_Assignments;
//
//public class Q3 {
//    public static void main(String[] args) {
//        characterEncription("COVID");
//    }
//    public static void characterEncription(String s){
//        StringBuilder encription = new StringBuilder();
//        long sumValues = 0;
//        for(char i : s.toCharArray()){
//            int value = -1;
//            if(i >= 'a' && i <= 'z'){
//                value = i -'a' + 1;
//            } else if(i >= 'A' && i <= 'Z'){
//                value = i - 'A' + 27;
//            } else if(i == ' '){
//                value = 0;
//            } else if(i == '.'){
//                value = 99;
//            }
//            if(value != -1){
//                encription.append(value).append(" ");
//                sumValues += value;
//            }
//        }
//        System.out.println(encription.toString().trim());
//        PrintStream stream = new PrintStream(System.out);
//        stream.print(sumValues);
//    }
//}
