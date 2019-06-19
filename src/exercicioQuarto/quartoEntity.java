package exercicioQuarto;

public class quartoEntity {
    private String name;
    private String email;
    private int room;

    public quartoEntity(String name, String email, int room) {
        this.name = name;
        this.email = email;
        this.room = room;
    }
    public String toString(){
        return getRoom()
                +": "
                +getName()
                +", "
                +getEmail();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }
}
