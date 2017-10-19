package lesson_03.homework.task_1;

public class Triangle {
    String name;
    float x1,y1,x2,y2,x3,y3;

    Triangle(String name,float x1,float y1,float x2,float y2,float x3,float y3)
    {
        if(x1==x2&&y1==y2||x3==x2&&y3==y2||x1==x3&&y1==y3||Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2))>=Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2))+Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2))||Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2))>=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2))+Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2))||Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2))>=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2))+Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2))){
            System.out.println("Треугольник построен неверно");
        }else {
            this.name=name;
            this.x1=x1; this.y1=y1;
            this.x2=x2; this.y2=y2;
            this.x3=x3; this.y3=y3;
        }
    }
    Triangle(){
        name="Простой";
        x1=1;y1=1;
        x2=2;y2=2;
        x3=3;y3=3;
    }
}

