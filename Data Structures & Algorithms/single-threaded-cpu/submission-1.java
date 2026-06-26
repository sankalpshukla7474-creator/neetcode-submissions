class Solution {
    
    // Custom class to hold task data: enqueueTime (et), processingTime (pt), index (ind)
    class Task{
        int et;
        int pt;
        int ind;
        
        public Task(int e, int p, int i){
            this.et = e;
            this.pt = p;
            this.ind = i;
        }
    }
    
    public int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        Task[] sortedTasks = new Task[n]; // Renamed from 'at'
        
        // 1. Convert int array to Task objects
        for(int i = 0; i < n; i++){
            sortedTasks[i] = new Task(tasks[i][0], tasks[i][1], i);
        }
        
        // 2. Sort all tasks by Enqueue Time (et)
        Arrays.sort(sortedTasks, (a, b) -> a.et - b.et);

        // 3. Min-Priority Queue for Available Tasks (Min-Heap)
        // Priority: Smallest Processing Time (pt), then smallest index (ind)
        PriorityQueue<Task> availableTasks = new PriorityQueue<>( // Renamed from 'at'
            (a, b) ->{
                if(a.pt != b.pt){
                    return a.pt - b.pt; // Primary: Shorter processing time
                }
                return a.ind - b.ind; // Secondary: Smaller index (tie-breaker)
            }
        );
        
        long currentTime = 0; // The CPU's current time
        int taskIndex = 0;    // Pointer for the sortedTasks array
        int[] result = new int[n];
        int resultIndex = 0;
        
        // Loop until all tasks are processed (resultIndex == n)
        while(resultIndex < n){
            
            // A. Move arrived tasks from sortedTasks into the Priority Queue
            // The condition must use the Task array's length 'n' and compare 'et' to 'currentTime'
            while(taskIndex < n && sortedTasks[taskIndex].et <= currentTime){
                availableTasks.offer(sortedTasks[taskIndex]);
                taskIndex++;
            }
            
            // B. Execute the next task or advance time
            if(availableTasks.isEmpty()){
                // CPU is idle. Advance current time to the arrival time of the next waiting task.
                if(taskIndex < n){
                    currentTime = sortedTasks[taskIndex].et;
                }
            }
            else{
                // Execute the task with the shortest processing time
                Task currentTask = availableTasks.poll(); // CORRECTED: Get and remove the task
                
                // Update time: Current time + processing time
                currentTime += currentTask.pt;
                
                // Record the task index in the result
                result[resultIndex++] = currentTask.ind;
            }
        }
        
        return result;
    }
}