import java.time.LocalDateTime;

public class Task
{
    private int id;
    private String Description;
    private String status;
//    private LocalDateTime createdAt;
//    private LocalDateTime updatedAt;
//
//    public LocalDateTime getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(LocalDateTime createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public LocalDateTime getUpdatedAt() {
//        return updatedAt;
//    }
//
//    public void setUpdatedAt(LocalDateTime updatedAt) {
//        this.updatedAt = updatedAt;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Task(int id, String Description,String status)
    {
        if(Description==null||Description.isEmpty())
        {
            throw new IllegalArgumentException("Description Cannot be empty");
        }
        if(status ==null||status.isEmpty())
        {
            throw new IllegalArgumentException("Status cannot be Empty");
        }
        this.id=id;
        this.Description=Description;
        this.status=status;
    }
    public String toString()
    {

        return "Task{id=" +id+",name='"+Description+"' ,Status='"+status+"'}";
    }
}
