public class loop {
    public static void main(String[] args){
    int i=1;
    while(i<=5){
        System.out.println("");
        int j=1;
        while(j<=5){
            System.out.print(j+ " ");
            j++;
        }
        i++;

    }
    int k=1;
    do{
        System.out.println("This will execute at least once");
    }while(k<0);

    System.out.println("while and do while loop completed");
}
}
