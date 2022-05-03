public class Main {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        ByReferenceVariable Vr = new ByReferenceVariable();
        Vr.display();
        System.out.println("---------------------------");

        ByMethod Mt = new ByMethod();
        int result = Mt.Number(a, b);
        System.out.println("Summary is: "+ result);
        System.out.println("---------------------------");

        ByConstructor cn = new ByConstructor();
		System.out.println("I hope you are happy: "+cn.z);
		System.out.println("---------------------------");
    }
}