class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < tickets.length; i++) {
            queue.add(i);
        }

        int time = 0;
        while (true) {
            int person = queue.poll();
            tickets[person]--;
            time++;

            if (tickets[person] > 0) {
                queue.add(person);
            }

            // If the person is k and has no tickets left, we're done
            if (person == k && tickets[person] == 0) {
                break;
            }
        }

        return time;
    }
}
