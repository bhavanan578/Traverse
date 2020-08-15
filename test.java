 class Test{
	public static void traverse(int[][] input)
	{
int n=0,total=5;
for(int i=0;i<total;i++)
{
int num,next;
if(i%2!=0)
{
	num=0;
	next=i;
	for(int j=0;j<=i;j++)
	{
		//System.out.print("("+num+","+next+")");
	System.out.print(input[num][next]+",");
	num++;
	next--;
	}
}	
else{
	num=i;
	next=0;
	for(int j=i;j>=0;j--)
	{
		//System.out.print("("+num+","+next+")");
	System.out.print(input[num][next]+",");
	num--;
	next++;
}
}
num=0;
//System.out.println();
}
int total1=total-1;
int count=1;
for(int i=total1;i>0;i--)
{
	int c=count,max=total1;
	if(i%2==0)
	{
	for(int j=0;j<i;j++)
	{
	System.out.print(input[c][max]+",");
	c++;
	max--;
	}
	}
	else
	{
      for(int j=0;j<i;j++)
      {
      System.out.print(input[max][c]+",");
      max--;
      c++;
      }
	}
	count++;
	//System.out.println();
}
}
public static void main(String[] args){
	int input[][]=
	{
    {1, 2, 3,4,5},
    {6, 7, 8,9,10},
    {11, 12, 13,14,15},
    {16,17,18,19,20},
    {21,22,23,24,25}
     }; 
      traverse(input);
}
}
