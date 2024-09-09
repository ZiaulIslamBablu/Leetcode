class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int s = commands.size();
        int sum=0;
        for(int i=0;i<s;i++){
            if(commands.get(i).equals("RIGHT")){
                sum+=1;
            }
            else if(commands.get(i).equals("DOWN")){
                sum+=n;
            }
            else if(commands.get(i).equals("UP")){
                sum-=n;
            }
            else{
                sum-=1;
            }
        }
        return sum;
    }
}