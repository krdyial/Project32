package Part01;

public class Class01 {

    public static void main(String[] args) {

        Class02 obj = new Class02();
        obj.multiOperation(3,2); //9
        System.out.println(obj.addition(104, 5)); //109

        System.out.println(obj.substruction(5, 10));//  -5


        obj.multiOperation(2,3); //7

        int a = 10;

        for (int i= 0; i<a; i++){
            System.out.print(a*i+ " ");
        }

    }

}
