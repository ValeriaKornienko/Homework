package Shape;

abstract class Shape {

    private String title;


    public Shape(String title){
        this.title = title;
    }

    public String getTitle(){return title;}

    public void setTitle(java.lang.String title) {
        this.title = title;

    }
    abstract void calculatorArea();
    abstract void calculatorPerimeter();
}
