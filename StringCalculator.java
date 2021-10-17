package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

class StringCalculator 
{
	
	//test case 1
//    public int add(String input) 
//    {
//    	int a = 0; int b = 0; int sum = 0;
//    	StringTokenizer st = new StringTokenizer(input,",");
//    	if(st.hasMoreTokens())
//    	{
//    		String temp = st.nextToken();
//    		try
//    		{
//    			a = Integer.parseInt(temp);
//    		}
//    		catch(Exception e)
//    		{
//    			a = 0;
//    		}
//    	}
//    	if(st.hasMoreTokens())
//    	{
//    		String temp = st.nextToken();
//    		try
//    		{
//    			b = Integer.parseInt(temp);
//    		}
//    		catch(Exception e)
//    		{
//    			b = 0;
//    		}
//    	}
//    	sum = a + b;
////    	System.out.println(input+"  "+sum);
//        return sum;
//    }
    
	//test case 2
//    public int add(String input) 
//    {
//    	int sum = 0;
//    	StringTokenizer st = new StringTokenizer(input,",");
//    	while(st.hasMoreTokens())
//    	{
//    		int a = 0;
//    		String temp = st.nextToken();
//    		try
//    		{
//    			a = Integer.parseInt(temp);
//    		}
//    		catch(Exception e)
//    		{
//    			a = 0;
//    		}
//    		sum = sum + a;
//    	}
//    	
//    	System.out.println(input+"  "+sum);
//        return sum;
//    }
	
	//test case 3
//  public int add(String input) 
//  {
//	  	int sum = 0;int a = 0;
//	  	int length = input.length();
//	  	String temp = "";
//	  	for(int i=0;i<length;i++)
//	  	{
//	  		char curr = input.charAt(i);
//	  		if(curr==',' || curr=='\n')
//	  		{
//	  			a = 0;
//	  	  		try
//	  	  		{
//	  	  			a = Integer.parseInt(temp);
//	  	  		}
//	  	  		catch(Exception e)
//	  	  		{
//	  	  			a = 0;
//	  	  		}
//	  	  		sum = sum + a;
//	  	  		temp = "";
//	  		}
//	  		else
//	  		{
//	  			temp = temp + curr;
//	  		}
//	  	}
//	  	
//	  	a = 0;
//		try
//		{
//			a = Integer.parseInt(temp);
//		}
//		catch(Exception e)
//		{
//			a = 0;
//		}
//		sum = sum + a;
//		temp = "";
//	  	
//	  	System.out.println(input+"  "+sum);
//	    return sum;
//  }
	
//	test case 4
//  public int add(String input) 
//  {
//	  	int i=0;
//	  	int sum = 0;int a = 0;
//	  	int length = input.length();
//	  	String temp = "";
//	  	TreeSet<Character> del = new TreeSet();
//	  	del.add('\n');
//	  	del.add(',');
//	  	
//	  	if(length>1 && input.charAt(0)=='/' && input.charAt(1)=='/')
//	  	{
//	  		for(i=2;i<length && input.charAt(i)!='\n';i++)
//		  	{
//		  		del.add(input.charAt(i));
//		  	}
//	  	}
//	  	
//	  	for(;i<length;i++)
//	  	{
//	  		boolean cont = false;
//	  		char curr = input.charAt(i);
//	  		Iterator<Character> it = del.iterator();
//	  		while(it.hasNext())
//	  		{
//	  			if(curr==it.next())
//	  			{
//	  				a = 0;
//		  	  		try
//		  	  		{
//		  	  			a = Integer.parseInt(temp);
//		  	  		}
//		  	  		catch(Exception e)
//		  	  		{
//		  	  			a = 0;
//		  	  		}
//		  	  		sum = sum + a;
//		  	  		temp = "";
//		  	  		cont = true;
//		  		}
//		  		if(cont)
//		  		{
//		  			temp = temp + curr;
//		  		}
//	  		}
//	  	}
//	  	
//	  	a = 0;
//		try
//		{
//			a = Integer.parseInt(temp);
//		}
//		catch(Exception e)
//		{
//			a = 0;
//		}
//		sum = sum + a;
//		temp = "";
//	  	
//	  	System.out.println(input+"  "+sum);
//	    return sum;
//  }
	
//	test case 5
//  public int add(String input) 
//  {
//	  	int i=0;
//	  	int sum = 0;int a = 0;
//	  	int length = input.length();
//	  	String temp = "";
//	  	TreeSet<Character> del = new TreeSet();
//	  	del.add('\n');
//	  	del.add(',');
//	  	ArrayList<Integer> negatives = new ArrayList();
//	  	
//	  	if(length>1 && input.charAt(0)=='/' && input.charAt(1)=='/')
//	  	{
//	  		for(i=2;i<length && input.charAt(i)!='\n';i++)
//		  	{
//		  		del.add(input.charAt(i));
//		  	}
//	  	}
//	  	
//	  	for(;i<length;i++)
//	  	{
//	  		boolean cont = false;
//	  		char curr = input.charAt(i);
//	  		Iterator<Character> it = del.iterator();
//	  		while(it.hasNext())
//	  		{
//	  			if(curr==it.next())
//	  			{
//	  				a = 0;
//		  	  		try
//		  	  		{
//		  	  			a = Integer.parseInt(temp);
//		  	  		}
//		  	  		catch(Exception e)
//		  	  		{
//		  	  			a = 0;
//		  	  		}
//		  	  		if(a<0)
//		  	  		{
//		  	  			negatives.add(a);
//		  	  		}
//		  	  		else
//		  	  		{
//			  	  		sum = sum + a;
//			  	  		temp = "";
//			  	  		
//		  	  		}
//		  	  		cont = true;
//		  		}
//		  		if(cont)
//		  		{
//		  			temp = temp + curr;
//		  		}
//	  		}
//	  	}
//	  	
//	  	a = 0;
//		try
//		{
//			a = Integer.parseInt(temp);
//		}
//		catch(Exception e)
//		{
//			a = 0;
//		}
//		if(a<0)
//	  	{
//	  		negatives.add(a);
//	  	}
//	  	else
//	  	{
//	  		sum = sum + a;
//  	  		temp = "";	
//	  	}
//		int n_neg = negatives.size();
//		if(n_neg>0)
//		{
//			class MyException extends Exception
//			{
//				String exc = "";
//				public MyException(String exc)
//				{
//					super(exc);
//					this.exc = exc;
//				}
//				
//				@Override
//				public String toString()
//				{
//					return "negatives not allowed"+exc;
//				}
//			}
//			try
//			{
//				throw new MyException(Arrays.toString(negatives.toArray()));
//			}
//			catch(MyException e)
//			{
//				System.out.println(e);
//			}
//			
//		}
//		
//	  	
//	  	System.out.println(input+"  "+sum);
//	    return sum;
//  }
	
//	//test case 6
//	public int add(String input) 
//	  {
//		  	int i=0;
//		  	int sum = 0;int a = 0;
//		  	int length = input.length();
//		  	String temp = "";
//		  	TreeSet<Character> del = new TreeSet();
//		  	del.add('\n');
//		  	del.add(',');
//		  	ArrayList<Integer> negatives = new ArrayList();
//		  	
//		  	if(length>1 && input.charAt(0)=='/' && input.charAt(1)=='/')
//		  	{
//		  		for(i=2;i<length && input.charAt(i)!='\n';i++)
//			  	{
//			  		del.add(input.charAt(i));
//			  	}
//		  	}
//		  	
//		  	for(;i<length;i++)
//		  	{
//		  		boolean cont = false;
//		  		char curr = input.charAt(i);
//		  		Iterator<Character> it = del.iterator();
//		  		while(it.hasNext())
//		  		{
//		  			if(curr==it.next())
//		  			{
//		  				a = 0;
//			  	  		try
//			  	  		{
//			  	  			a = Integer.parseInt(temp);
//			  	  		}
//			  	  		catch(Exception e)
//			  	  		{
//			  	  			a = 0;
//			  	  		}
//			  	  		if(a<0)
//			  	  		{
//			  	  			negatives.add(a);
//			  	  		}
//			  	  		else if(a<=1000)
//			  	  		{
//				  	  		sum = sum + a;
//				  	  		temp = "";
//				  	  		
//			  	  		}
//			  	  		cont = true;
//			  		}
//			  		if(cont)
//			  		{
//			  			temp = temp + curr;
//			  		}
//		  		}
//		  	}
//		  	
//		  	a = 0;
//			try
//			{
//				a = Integer.parseInt(temp);
//			}
//			catch(Exception e)
//			{
//				a = 0;
//			}
//			if(a<0)
//		  	{
//		  		negatives.add(a);
//		  	}
//		  	else if(a<=1000)
//		  	{
//		  		sum = sum + a;
//	  	  		temp = "";	
//		  	}
//			int n_neg = negatives.size();
//			if(n_neg>0)
//			{
//				class MyException extends Exception
//				{
//					String exc = "";
//					public MyException(String exc)
//					{
//						super(exc);
//						this.exc = exc;
//					}
//					
//					@Override
//					public String toString()
//					{
//						return "negatives not allowed"+exc;
//					}
//				}
//				try
//				{
//					throw new MyException(Arrays.toString(negatives.toArray()));
//				}
//				catch(MyException e)
//				{
//					System.out.println(e);
//				}
//				
//			}
//			
//		  	
//		  	System.out.println(input+"  "+sum);
//		    return sum;
//	  }
	
	//test case 7 and rest
//	public int add(String input) 
//	  {
//		  	int i=0;
//		  	int sum = 0;int a = 0;
//		  	int length = input.length();
//		  	String temp = "";
//		  	TreeSet<String> del = new TreeSet();
//		  	del.add("\n");
//		  	del.add(",");
//		  	ArrayList<Integer> negatives = new ArrayList();
//		  	
//		  	if(length>1 && input.charAt(0)=='/' && input.charAt(1)=='/')
//		  	{
//		  		boolean start = false;
//		  		String del_temp = "";
//		  		for(i=2;i<length && input.charAt(i)!='\n';i++)
//			  	{
//		  			if(start)
//		  			{
//		  				if(input.charAt(i)==']')
//			  			{
//		  					if(del_temp.length()>0)
//		  						del.add(del_temp);
//		  					del_temp = "";
//			  				start=false;
//			  			}
//		  				else
//		  				{
//		  					del_temp = del_temp + input.charAt(i);
//		  				}
//		  			}
//		  			else
//		  			{
//		  				if(input.charAt(i)=='[')
//		  				{
//			  				start=true;
//			  			}
//		  			}
//			  	}
//		  	}
//		  	
//		  	for(;i<length;i++)
//		  	{
//		  		boolean cont = false;
//		  		char curr = input.charAt(i);
//		  		Iterator<String> it = del.iterator();
//		  		while(it.hasNext())
//		  		{
//		  			String del_curr = it.next();
//		  			boolean del_found = false;
//		  			for(int j=0;j<del_curr.length();j++)
//		  			{
//		  				if(del_curr.charAt(j)!=input.charAt(i+j))
//		  				{
//		  					del_found=true;
//		  				}
//		  			}
//		  			if(del_found)
//		  			{
//		  				a = 0;
//			  	  		try
//			  	  		{
//			  	  			a = Integer.parseInt(temp);
//			  	  		}
//			  	  		catch(Exception e)
//			  	  		{
//			  	  			a = 0;
//			  	  		}
//			  	  		if(a<0)
//			  	  		{
//			  	  			negatives.add(a);
//			  	  		}
//			  	  		else if(a<=1000)
//			  	  		{
//				  	  		sum = sum + a;
//				  	  		temp = "";
//				  	  		
//			  	  		}
//			  	  		cont = true;
//			  		}
//			  		if(cont)
//			  		{
//			  			temp = temp + curr;
//			  		}
//		  		}
//		  	}
//		  	
//		  	a = 0;
//			try
//			{
//				a = Integer.parseInt(temp);
//			}
//			catch(Exception e)
//			{
//				a = 0;
//			}
//			if(a<0)
//		  	{
//		  		negatives.add(a);
//		  	}
//		  	else if(a<=1000)
//		  	{
//		  		sum = sum + a;
//	  	  		temp = "";	
//		  	}
//			int n_neg = negatives.size();
//			if(n_neg>0)
//			{
//				class MyException extends Exception
//				{
//					String exc = "";
//					public MyException(String exc)
//					{
//						super(exc);
//						this.exc = exc;
//					}
//					
//					@Override
//					public String toString()
//					{
//						return "negatives not allowed"+exc;
//					}
//				}
//				try
//				{
//					throw new MyException(Arrays.toString(negatives.toArray()));
//				}
//				catch(MyException e)
//				{
//					System.out.println(e);
//				}
//				
//			}
//			
//		  	
//		  	System.out.println(input+"  "+sum);
//		    return sum;
//	  }
}