public class multi_dimentionalArray {

    public static void main(String[] args) {

        int nums[][] = new int[3][4];

        nums[0][3] = 8;
        nums[1][3] = 5;

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                nums[i][j] = (int)(Math.random() * 10);
            }
        }

        System.out.println("After random values:");

    
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
