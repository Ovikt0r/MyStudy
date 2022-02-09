package com.company.oviktor.bookexamples;

public class FindOutlier{
    static int odd = 0;
    static int even = 0;
    static int find(int[] integers){

        for(int i = 0; i<integers.length-1;i++) {

            if (integers[i]%2==0 && integers[i+1]%2==0 ){
                even++;
                continue;
            }
            if (even>0 && integers[i]%2 !=0){
                return integers[i];
            }
            if(even>0 && integers[i+1]%2 !=0)
                return integers[i+1];

            else if (integers[i]%2!=0 && integers[i+1]%2!=0) {
                odd++;
                continue;
            }
            if (odd>0 && integers[i]%2 == 0) {
                return integers[i];
            }
            if(odd>0 && integers[i+1]%2 ==0) {
                return integers[i + 1];
            }
            if (integers[i]%2 != 0 && integers[i+1]%2 == 0 && integers[i+2]%2 == 0) {
                return integers[i];
            }
            if (integers[i]%2 == 0 && integers[i+1]%2!=0 && integers[i+2]%2 !=0) {
                return integers[i];
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
        int b = find(a);
        System.out.println(b);
    }
}
