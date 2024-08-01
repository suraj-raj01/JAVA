class FinallyBlock{
	public static void main(String args[])
	{
	int num=0;
        try{
            num = Integer.parseInt(args[0]);
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Please enter atleast one character");
        }
	finally{
        System.out.println("Result : "+(int)(Math.pow(num, 2)));
	System.out.println("This is finally Block");
	}
	}
}