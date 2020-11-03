package Part01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Class02 {
    public static void main(String[] args) {

    }

    public  int addition(int a, int b ){
        return a+b;

    }

    public int substruction(int a, int b){

        return a-b;
    }

    public int multiplication(int a, int b){
        return a*b;
    }

    public int  division (int a, int b){
        return a/b;

    }

    public int square ( int a){
        return a*a;

    }

    public void multiOperation (int a, int b){
        if(a<b) {
            System.out.println((a*2)+b);
        } else if(a>b) {
            System.out.println((b*3)+a);
        }
    }

}
