public class TestPermutation{
public static void main (String[] args){
NbEntier a=new NbEntier(10);
NbEntier b=new NbEntier(5);

System.out.println("Avant permutation a= "+a.getValue()+" b= "+b.getValue());


Permutation.permute(a,b);
 
 
System.out.println("Apres permutation a= "+a.getValue()+" b= "+b.getValue());
 
 
}
}