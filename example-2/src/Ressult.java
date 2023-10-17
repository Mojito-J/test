import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Ressult {
    private int active;   
    private int inactive;
    private int deleted;



    public static int getCountByStatus(Statuss status, Ressult result) {

        Map<Statuss, Integer> statusMap = new HashMap<>();
        statusMap.put(Statuss.ACTIVE, result.active);
        statusMap.put(Statuss.INACTIVE, result.inactive);
        statusMap.put(Statuss.DELETED, result.deleted);

        return statusMap.get(status);

    }



    public Ressult(int active, int inactive, int deleted) {
        this.active = active;
        this.inactive = inactive;
        this.deleted = deleted;
    }

    public int getActive() {
        return active;
    }

    public int getInactive() {
        return inactive;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public void setInactive(int inactive) {
        this.inactive = inactive;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ressult ressult = (Ressult) o;
        return active == ressult.active && inactive == ressult.inactive && deleted == ressult.deleted;
    }

    @Override
    public int hashCode() {
        return Objects.hash(active, inactive, deleted);
    }

    @Override
    public String toString() {
        return "Ressult{" +
                "active=" + active +
                ", inactive=" + inactive +
                ", deleted=" + deleted +
                '}';
    }


}
