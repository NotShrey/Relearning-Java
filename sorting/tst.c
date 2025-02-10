#include <stdio.h>
#include <limits.h>

#define TASKS 4
#define MACHINES 3

void min_min_scheduling(int exec_time[TASKS][MACHINES], int task_assignment[TASKS]) {
    int remaining_tasks[TASKS]; 
    for (int i = 0; i < TASKS; i++) 
        remaining_tasks[i] = 1;

    for (int t = 0; t < TASKS; t++) {
        int min_time = INT_MAX, min_task = -1, best_machine = -1;

        for (int i = 0; i < TASKS; i++) {
            if (!remaining_tasks[i]) continue;

            for (int j = 0; j < MACHINES; j++) {
                if (exec_time[i][j] < min_time) {
                    min_time = exec_time[i][j];
                    min_task = i;
                    best_machine = j;
                }
            }
        }

        task_assignment[min_task] = best_machine;
        remaining_tasks[min_task] = 0;
    }
}

int main() {
    int exec_time[TASKS][MACHINES] = {
        {8, 16, 12},
        {12, 14, 7},
        {9, 6, 14},
        {14, 5, 10}
    };

    int task_assignment[TASKS];

    min_min_scheduling(exec_time, task_assignment);

    printf("Task Assignment (Task -> Machine):\n");
    for (int i = 0; i < TASKS; i++)
        printf("Task %d -> Machine %d\n", i, task_assignment[i]);

    return 0;
}
