package lesson_03.homework.task_1;

public class Dot {
    String name;
    float x,y;

    Dot(String name,float x,float y){
        this.name=name;
        this.x=x;  this.y=y;
    }
    Dot(){
        name="Нулевая";
        x=0;   y=0;
    }
    void distance(Dot a){
        System.out.println("Расстояние между точкой "+this.name+" и точкой "+a.name+" равно "+Math.sqrt(Math.pow(a.x-this.x,2)+Math.pow(a.y-this.y,2)));
    }
}
