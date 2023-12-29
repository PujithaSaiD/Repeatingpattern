import java.util.*;
public class Repeatingpattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        for(int j=0;j<l.size();j++){
            for(int k=1;k<=l.get(j);k++){
                for(int m=1;m<=k;m++){
                    System.out.print(k);
                }
                System.out.println();
            }
        }
        
    }
    
}

