public class GymFactory {
    public static Gym createGym(String type) {
        switch (type.toLowerCase()) {
            case "basic":
                return new BasicGym();
            case "premium":
                return new PremiumGym();
            default:
                throw new IllegalArgumentException("Unknown gym type: " + type);
        }
    }
}