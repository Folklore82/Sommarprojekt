public class HelloWorld{
    public static void main(String[] args) {
        int x = 7;
        while(x > 0){
            int a = 1;
            int b = 5;
            System.out.println(a+b+x);
            x -= 2;
        }
        System.out.println(sillyMethod(3,4));

        public int sillyMethod(int a, int b){
            if(a < b ){
                return b;
            }
            else if(a > b){
                return a;
            }
            else{
                return 11000000;
            }
        }

        
    }
}