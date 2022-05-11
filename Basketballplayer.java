package Assignment;

import org.w3c.dom.ls.LSOutput;

    public class BasketballPlayer {
        protected String name;
        protected String position;
        protected String team;
        protected int height;
        protected int weight;
        protected int agility;
        protected int speed;
        protected int ballHandling;
        int value;

        //constructors
        public BasketballPlayer() {
            String name = "unknown";
            String position = "unknown";
            String team = "unknown";
            int height = 0;
            int weight = 0;
            int agility = 0;
            int speed = 0;
            int ballHandling = 0;
        }

        public BasketballPlayer(String name , String position , String team) {
            this.name = name;
            this.position = position;
            this.team = team;
            int height = 0;
            int weight = 0;
            int agility = 0;
            int speed = 0;
            int ballHandling = 0;
        }

        public BasketballPlayer(String name,String position,String team,int height,int weight,int agility,int speed,int ballHandling) {
            this.name = name;
            this.position = position;
            this.team = team;
            this.height = height;
            this.weight = weight;
            this.agility = agility;
            this.speed = speed;
            this.ballHandling = ballHandling;
        }
        // accessors
        public String getName() {

            return name;
        }
        public String getPosition() {

            return position;
        }
        public String getTeam() {
            return team;
        }
        public int getHeight() {
            return height;
        }
        public int getWeight() {

            return weight;
        }
        public int getAgility() {
            return agility;
        }
        public int getSpeed() {
            return speed;
        }
        public int getBallHandling() {
            return ballHandling;
        }

        //toString
        public String toString() {
            return "Name: " + getName() + "\n" + "Position: " + getPosition() + "\n" + "Team: " + getTeam();
        }

        //getValue
        public int getValue() {

            // Center Position
            if (position=="centre") {
                if (height>=82&&(weight>=220&&weight<=250)&&ballHandling>5) {
                    value=10;
                } else if (height>=80&&(weight>=210&&weight<=260)&&ballHandling>5) {
                    value=8;
                } else if (height >= 80&&ballHandling>4) {
                    value=6;
                } else if (height >= 78&&agility > 7) {
                    value=5;
                } else if (height >= 78) {
                    value=4;
                } else if (height >= 76&&agility > 5) {
                    value=2;
                } else {
                    value=0;
                }
            }

            // Forward Position
            if (position=="forward") {
                if (height>=80&&(agility>8||speed>7)) {
                    value=10;
                } else if (height>=78&&agility>6&&speed>5) {
                    value=8;
                } else if (height >= 77&&agility>5) {
                    value=6;
                } else if (height >= 76&&speed > 4) {
                    value=5;
                } else if (height >= 75&&(agility>3||speed>3)) {
                    value=3;
                } else if (height >= 74) {
                    value=1;
                } else {
                    value=0;
                }
            }

            // Guard Position
            if (position=="guard") {
                if (height>=78&&(agility>7||speed>7)&&ballHandling>7) {
                    value=10;
                } else if (height>=76&&(agility>6||speed>6)&&ballHandling>7) {
                    value=8;
                } else if (height >= 74&&ballHandling>5&&agility>5&&speed>6) {
                    value=6;
                } else if (ballHandling>6&&agility>6&&speed>5) {
                    value=4;
                } else if (ballHandling>4 && agility > 4) {
                    value=2;
                } else {
                    value=0;
                }
            }
            return value;
        }


    }

}
