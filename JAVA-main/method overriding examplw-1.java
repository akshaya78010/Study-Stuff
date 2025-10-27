class Bank{
    String name;
    int noOfCustomers;
    public  double intrest{
        return 0.0;
    }
    String Canara extends Bank{
        public double intrest{
            return 4.5;
        }
    }
    String Sbi extends Bank{
       public  double intrest{
            return 7.7;
        }
    }
    }
    class Example1{
        public static void main(String args[])
        {
            Canara c1 = new Canara();
            Sbi s1 = new Sbi();

        }
    }
}