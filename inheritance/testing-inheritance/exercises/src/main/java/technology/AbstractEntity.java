package technology;


public abstract class AbstractEntity {
    private static int idCounter = 0;
    private String id;

    public AbstractEntity() {
        assignId();
    }

    private void assignId() {
        idCounter++;
        id = "ID" + idCounter;
    }

    public String getId() {
        return id;
    }
}
