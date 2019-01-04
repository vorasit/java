package com.company;
public class TestArray4 {
    public static void main(String[] args)
    {
        int score[]={32,50,75,66,82};
        int size=score.length;
        int gr;
        for (int i=0;i<size;i++)
        {
            int x=score[i];
            if(x>=80) {
                gr = 4;
            }
            else if(x>=70) {
                gr = 3;
            }
            else if(x>=60) {
                gr = 2;
            }
            else if(x>=50) {
                gr = 1;
            }
            else {
                gr = 0;
            }
                System.out.println("Score[" + i + "]" + x + " grade = " + gr);

        }//for
        System.out.print("vorasit phusuwan");
    }//main
}//class
