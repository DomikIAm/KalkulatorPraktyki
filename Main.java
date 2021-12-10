public class Main{

public int sum(int a, int b){
        return a + b;
    }


public int min(int a, int b){
    return a-b;
}
public int divide(int a,int b) {
    if (a == 0 || b == 0) {
        return 0;
    }
    else{
            return a / b;
        }
    }

public int multiply(int a, int b){
    if(a==0 || b==0){
        return 0;
    }
    else{
        return a*b;
    }

}
public int exp(int a){
    return a*a;
}
}
