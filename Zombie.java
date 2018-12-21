import java.util.*;


public class Zombie{
	
	public static void main(String args[])
	{
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter your matrix's size");
		   int r = sc.nextInt();
		   int c = sc.nextInt();
		   int[][] matrix = new int [r][c];
		   int[][] result = new int [r][c];
		   System.out.println("Enter values : ");
		   
		   for(int n =0;n<r;n++)
		   {
			   for(int m =0;m<c;m++)
			   {
				   matrix[m][n] = sc.nextInt();
				   result[m][n] = sc.nextInt();
			   }
		   }
		   
		        int[] x = {-1, -1, 0, 1, 1, 1, 0, -1};
		        int[] y = {0, 1, 1, 1, 0, -1, -1, -1};
		        
		        for(int i=0; i<r; i++)
		        {
		            for(int j=0; j<c; j++)
		            {
		                int count=0;
		                for(int k=0; k<8; k++)
		                {
		                    int nx = i + x[k];
		                    int ny = j + y[k];
		                    if(nx>=0 && nx<r && ny>=0 && ny<c && (matrix[nx][ny]&1)==1)
		                        count++;
		                }
		                if(matrix[i][j]==1 && count<2)
		                    result[i][j]=0;
		                
		                else if(matrix[i][j]==1 && count>3)
		                    result[i][j]=0;
		                
		                else if(matrix[i][j]==0 && count==3)
		                    result[i][j]=1;
		                
		                else
		                    result[i][j]=matrix[i][j];     
		            }
		        } 
		       
		        
		      
		        for (int i = 0; i<r; i++)
		        {
		            for (int j = 0; j<c ; j++)
		            {
		                System.out.print(result[i][j]+"\t");
		            }
		             
		            System.out.println();
		        }
		    }
		    
		}
  
    

 
