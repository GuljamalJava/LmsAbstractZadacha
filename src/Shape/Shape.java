package Shape;

public abstract  class  Shape {

        protected String color;



        public  abstract double getPerimeter();


        public Shape(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }





        @Override
        public String toString() {
            return "Shape{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }


