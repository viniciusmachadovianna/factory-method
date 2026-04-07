public class PremiumGym extends Gym {
    public PremiumGym() {
        super("Premium Gym", 200);
    }

    @Override
    public boolean addMember(String memberName) {
        if (currentMembers < maxMembers) {
            currentMembers++;
            System.out.println("Member " + memberName + " added to " + name + ". Current members: " + currentMembers);
            return true;
        } else {
            System.out.println("Cannot add " + memberName + ". Gym is at full capacity (" + maxMembers + ")");
            return false;
        }
    }

    @Override
    public boolean removeMember(String memberName) {
        if (currentMembers > 0) {
            currentMembers--;
            System.out.println("Member " + memberName + " removed from " + name + ". Current members: " + currentMembers);
            return true;
        } else {
            System.out.println("Cannot remove " + memberName + ". No members in the gym.");
            return false;
        }
    }
}