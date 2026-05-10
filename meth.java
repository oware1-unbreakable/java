class hing{
    public void GetRequest(){
        System.out.println("Loading..");
    }
    public int GetDetails(){
        System.out.println("This will return but for now not worth it!");
        return 9;
    }
    public String GetMeAPen(){
        return "Fuck";
    }
    public int GetAdd(int n1,int n2){
        return n1+n2;
    }
    public double GetDiff(double numb,int num2){
        return numb+num2;
    }

}
public class meth {
    public static void main(String[] args){
        int n1=7;
        int n2=6;
        double numb=5;
        int num2=67;

        hing obj=new hing();
        obj.GetRequest();
        obj.GetDetails();
        /*Ther will be diffrence in printing whole function it will reurn value: */
        System.out.println(obj.GetDetails());
        obj.GetMeAPen();
        System.out.println(obj.GetAdd(n1,n2));
        System.out.println(obj.GetDiff(numb,num2));


        

    }
    
}
