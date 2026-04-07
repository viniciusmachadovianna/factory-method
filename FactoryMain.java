public class FactoryMain {
    public static void main(String[] args) {
        // factory - create basic gym 
        Gym basicGym = GymFactory.createGym("basic");
        System.out.println("Created: " + basicGym.getName() + " with capacity " + basicGym.getMaxMembers());

        // add members to basic
        basicGym.addMember("Marco");
        basicGym.addMember("Antonio");

        // factory - create premium gym 
        Gym premiumGym = GymFactory.createGym("premium");
        System.out.println("Created: " + premiumGym.getName() + " with capacity " + premiumGym.getMaxMembers());

        // add members to premium
        premiumGym.addMember("Araujo");
        for (int i = 0; i < 5; i++) {
            premiumGym.addMember("Member" + (i + 1));
        }

        // remove member
        premiumGym.removeMember("Araujo");

        // status check
        System.out.println("\nBasic Gym - Current members: " + basicGym.getCurrentMembers());
        System.out.println("Premium Gym - Current members: " + premiumGym.getCurrentMembers());
        System.out.println("Basic Gym at capacity? " + basicGym.isAtCapacity());
        System.out.println("Premium Gym at capacity? " + premiumGym.isAtCapacity());
    }
}