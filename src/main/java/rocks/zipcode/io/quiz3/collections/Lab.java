package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    String name;
    LabStatus labStatus;
    public Lab() {
        this(null);
    }

    public Lab(String labName) {
    }

    public String getName() {

        return this.name;
    }

    public void setStatus(LabStatus labStatus) {
        this.labStatus = labStatus;
    }

    public LabStatus getStatus() {
        return labStatus;
    }
}
