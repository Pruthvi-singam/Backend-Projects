public enum TaskStatus {
    TODO("ToDO"),
    IN_PROGRESS("In_Progress"),
    DONE("Done");
    private final String status;

    TaskStatus(String status) {
        this.status=status;
    }
    public String getStatus() {
        return this.status;
    }
    public static TaskStatus fromString(String status) {
        for(TaskStatus taskStatus:TaskStatus.values())
        {
            if(taskStatus.status.equalsIgnoreCase(status))
            {
                return taskStatus;
            }
        }
        throw new IllegalArgumentException("Invalid stauts. must be ToDo ,IN_PROGRESS,or Done");
    }
}
