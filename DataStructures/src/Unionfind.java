import java.util.Scanner;

public class Unionfind {
	 int count,id[] ;
	Unionfind(int N){
		
		 id =new int[N]; 
		count=N;
		 for(int i=0;i<N;i++)
		 {
			 id[i]=i;
		 }
		 
	}
	int count(){
		return count;
	}
	boolean isConnected(int p,int q){
		validate(p);
		validate(q);
			return id[p]==id[q];
	}
	 void validate(int p) {
	        int N = id.length;
	        if (p < 0 || p >= N) {
	            throw new IndexOutOfBoundsException("index " + p + " is not between 0 and " + (N-1));
	}
	    }
	  public int find(int p) {
	        validate(p);
	        return id[p];
	    }
	public void union(int p, int q) {
		
	validate(p);
	validate(q);
		int pID = id[p];   // needed for correctness
        int qID = id[q];   // to reduce the number of array accesses

        // p and q are already in the same component
        if (pID == qID) return;
        for (int i = 0; i < id.length; i++)
        {     
	System.out.print(id[i]+"\t");}
        System.out.println();
        for (int i = 0; i < id.length; i++)
        {       if (id[i] == pID) id[i] = qID;
	System.out.print(id[i]+"\t");}
        count--;
		
	}

	public static void main(String[] args) {
		int N;
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		Unionfind uf=new Unionfind(N);	
		 for(int i=0;i<N;i++)
		 {
			 int p,q;
			 p= s.nextInt();
			 q=s.nextInt();
			 if(uf.isConnected(p,q))
			 continue;
			 uf.union(p,q);
		 System.out.println(p+" "+q);
		
		 }
		 System.out.println(uf.count()+" "+"componets");	
 }
}


