class Solve{
    //Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int N)
    {
        ArrayList<String> ans = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while(N-- > 0){
            String current = q.remove();
            ans.add(current);
            q.add(current + "0");
            q.add(current + "1");
        }
        return ans;
    }
    
}