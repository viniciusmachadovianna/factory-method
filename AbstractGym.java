public abstract class Gym {
    protected String name;
    protected int maxMembers;
    protected int currentMembers;

    public Gym(String name, int maxMembers) {
        this.name = name;
        this.maxMembers = maxMembers;
        this.currentMembers = 0;
    }

    public abstract boolean addMember(String memberName);

    public abstract boolean removeMember(String memberName);

    public int getCurrentMembers() {
        return currentMembers;
    }

    public String getName() {
        return name;
    }

    public int getMaxMembers() {
        return maxMembers;
    }

    public boolean isAtCapacity() {
        return currentMembers >= maxMembers;
    }
}