public class VarArgs {
    // int Add(int a, int b){

    //     return a+b;
    // }

    int Add(int...arr){
        int result = 0;
        for (int c : arr) {
            result+=c;
        }
        return result;
    }
    public static void main(String[] args) {
        
        VarArgs a1 = new VarArgs();
        System.out.println(a1.Add(5678, 34567));
        System.out.println(a1.Add(78, 9, 7,5,4334,334,2345,34445,3333,335667,6675,9));
    }
}
