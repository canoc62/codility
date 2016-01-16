class FizzBuzz {
    public static void solution(int N) {
        // write your code in Java SE 8
        int count = 0;
        int contCount = 0;

        for(int i = 1; i<=N;i++){

            if((i % 3 == 0) && (i % 5 == 0) && (i % 7 == 0)){
                System.out.println("FizzBuzzWoof");
            }
            else if((i % 3 == 0) && (i % 5 == 0)){
                contCount++;
                if(contCount%2 == 0){
                    System.out.println("FizzWoof");
                }
                else{
                    System.out.println("FizzBuzz");
                }
            }
            else if((i % 3 == 0) && (i % 7 == 0)){
                contCount++;
                if(contCount%2 == 0){
                    System.out.println("FizzWoof");
                }
                else{
                    System.out.println("FizzBuzz");
                }  
            }
            else if((i % 5 == 0) && (i % 7 == 0)){
                contCount++;
                if(contCount%2 == 0){
                    System.out.println("FizzWoof");
                }
                else{
                    System.out.println("FizzBuzz");
                }
            }
            else if( (i % 3 == 0) || (i % 5 == 0) || (i % 7 == 0)){
                count++;
                if(count%2 == 0 && count%4 != 0){
                    System.out.println("Buzz");
                }
                else if(count % 4 == 0){
                    System.out.println("Woof");
                }
                else{
                    System.out.println("Fizz");
                }
            }
            else{
                System.out.println(i);   
            }
        }
    }

    public static void main(String[] args){

        solution(105);

    }
}