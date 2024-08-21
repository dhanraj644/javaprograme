class str4
{
    public static void main(String args[])
    {
     String str= "Hello ! How are you ? ";
        char c = 'H';
         int coun = 0;
   
         for(int i =0; i<str.length();i++)
       {
        if(str.charAt(i)==c)
        {
           coun++;
           
        }

    }
    System.out.println(coun);
    }
}