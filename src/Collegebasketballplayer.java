package Assignment;

    public class CollegeBasketballPlayer extends BasketballPlayer {
        private int eligibilityRemaining;
        private String role;

        public CollegeBasketballPlayer() {
            super();
            int eligibilityRemaining = 4;
            String role = "bench";
        }

        public CollegeBasketballPlayer(String name, String position, String team) {
            super(name, position, team);
            int eligibilityRemaining = 4;
            String role = "bench";
        }

        public CollegeBasketballPlayer(String name, String position, String team, int height, int weight, int agility, int speed, int ballHandling, int eligibilityRemaining, String role) {
            super(name, position, team, height, weight, agility, speed, ballHandling);
            this.eligibilityRemaining = eligibilityRemaining;
            this.role = role;
        }

        public int getEligibilityRemaining() {
            return eligibilityRemaining;
        }

        public String getRole() {
            return role;
        }

        public String toString() {
            return super.toString() + "\n" + "Role: " + getRole() + "\nEligibility: " + getEligibilityRemaining();
        }

        public boolean draftable() {
            if ((role == "Starter" && super.getValue() > 4) || (role == "Bench" && super.getValue() >= 8)) {
                // This is unnecessary , just my shobo
                System.out.println("Player is draftable");
            }
            return true;
        }
    }

}
