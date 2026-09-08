class Solution {
    public int countCommas(int n) {
        int comma=0;
        if(n>=1000 && n<10000){
           for(int i = 1000;i<=n;i++){
            comma++;
           }
           return comma;
        }
        else if(n>=10000 && n<100000){
            for(int i = 1000;i<=n;i++){
                comma++;
            }
            return comma;
        }
        else if(n>=100000 && n<1000000){
            for(int i = 1000;i<=n;i++){
                comma++;
            }
            return comma;
        }
        else return 0;   
    }
}