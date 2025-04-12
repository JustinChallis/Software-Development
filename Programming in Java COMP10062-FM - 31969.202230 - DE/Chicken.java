package Assignment2;

public class Chicken {
        private String name = "Nancy";
        private int hearts = 4;
        private double weight = 0.1;
        private String mood = "Happy";
        private String status = "Alive";



        public String toString() {
                return "Chicken{" + "name='" + name + '\'' + ", hearts=" + hearts + ", weight=" + weight + ", mood='" + mood + '\'' + ", status='" + status + '\'' + '}';
        }


        public String getName() {
                return name;
        }


        public void setName(String name) {
                this.name = name;
        }


        public int getHearts() {
                return hearts;
        }



        public void setHearts(int hearts) {
                this.hearts = hearts;
        }


        public double getWeight() {
                return weight;
        }



        public void setWeight(double weight) {
                this.weight = weight;
        }



        public String getMood() {
                return mood;
        }



        public void setMood(String mood) {
                this.mood = mood;
        }



        public String getStatus() {
                return status;
        }



        public void setStatus(String status) {
                this.status = status;
        }
}
