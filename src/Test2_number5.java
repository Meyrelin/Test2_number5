public class Test2_number5

{

    public static void main(String[] args)
    {
        int a = (int) (Math.random() *10);
        int c = (int) (Math.random() *10);
        double b;
         if(a>c)
         {

             System.out.println("Katet a = " +c);
             System.out.println("Gipotenuza c = " +a);
             b=Math.sqrt(Math.pow(a, 2) - Math.pow(c, 2));
             System.out.printf("Katet b = "+b);


         }
            else
         {
                System.out.println("Katet a = " +a);
                System.out.println("Gipotenuza c = " +c);
             b=Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
             System.out.printf("Katet b = "+b);


         }

        }
    }


