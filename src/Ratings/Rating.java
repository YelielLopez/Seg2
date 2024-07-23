package Ratings;

public class Rating {

    private double fisics;
        private double quimic;
        private double biology;
        private double math;
        private double informatic;


        public double getFisics() {
            return fisics;
        }

        public void setFisics(double fisics) {
            this.fisics = fisics;
        }

        public double getQuimic() {
            return quimic;
        }

        public void setQuimic(double quimic) {
            this.quimic = quimic;
        }

        public double getBiology() {
            return biology;
        }

        public void setBiology(double biology) {
            this.biology = biology;
        }

        public double getMath() {
            return math;
        }

        public void setMath(double math) {
            this.math = math;
        }

        public double getInformatic() {
            return informatic;
        }

        public void setInformatic(double informatic) {
            this.informatic = informatic;
        }


        public double calcEverage() {
            return (fisics + quimic + biology + math + informatic) / 5;
        }


        public String getRating(double average) {
            if (average >= 0 && average <= 5.9) {
                return "Mala";
            } else if (average >= 6 && average <= 8) {
                return "Buena";
            } else if (average > 8) {
                return "Excelente";
            } else {
                return "Promedio no válido";
            }
        }
}
