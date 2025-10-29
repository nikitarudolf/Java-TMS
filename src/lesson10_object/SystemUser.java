package lesson10_object;

import java.util.Objects;

public class SystemUser {
    private int id;
    private String name;
    private boolean isAdmin;

    SystemUser(int i, String n, boolean isAdmin) {
        this.id = i;
        this.name = n;
        this.isAdmin = isAdmin;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if(!(obj instanceof SystemUser)) {
            return false;
        }
        SystemUser other = (SystemUser)obj;
        boolean nameEquals = (this.name == null && other.name == null) ||
                (this.name != null && other.name != null && this.name.equals(other.name));
        return this.id == other.id && this.isAdmin == other.isAdmin && nameEquals;

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, isAdmin);
    }

    @Override
    public String toString() {
        return "SystemUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
