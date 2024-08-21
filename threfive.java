class threfive
{
    public static void main(String[] args) {
        int num=10;
        int sum=0;

        for(int i=0;i<=100;i++)
        {
            if(i%3==0||i%5==0)
            {
                if(i<num)
                {
                    sum+=i;
                }
            }
            // int three=3*i;
            // int five=5*i;

            // if(three < 10)
            // {
            //      sum += three;
            // }
            // if(five <10)
            // {
            //     sum+=five;
            // }
        }

        System.out.println(sum);

    }
}