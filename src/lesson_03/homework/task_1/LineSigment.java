package lesson_03.homework.task_1;

public class LineSigment {
    String name;
    float x1,y1,x2,y2;

    LineSigment(String name,float x1,float y1,float x2,float y2) {
        if(x1==x2&&y1==y2){
            System.out.println("Отрезок построен неверно");
        }else {
            this.name = name;
            this.x1 = x1;   this.y1 = y1;
            this.x2 = x2;   this.y2 = y2;
        }
    }
    LineSigment(){
        name="Пробный";
        x1=0;     y1=0;
        x2=1;     y2=1;
    }
    void comparisone(LineSigment A){
        if(Math.sqrt(Math.pow(A.x2-A.x1,2)+Math.pow(A.y2-A.y1,2))>Math.sqrt(Math.pow(this.x2-this.x1,2)+Math.pow(this.y2-this.y1,2))){
            System.out.print("Отрезок "+A.name+" больше отрезка "+this.name);
        }else {
            if(Math.sqrt(Math.pow(A.x2-A.x1,2)+Math.pow(A.y2-A.y1,2))==Math.sqrt(Math.pow(this.x2-this.x1,2)+Math.pow(this.y2-this.y1,2))){
                System.out.print("Отрезок "+A.name+" и отрезок "+this.name+" равны");
            }else{
                System.out.print("Отрезок "+this.name+" больше отрезка "+A.name);
            }
        }
    }
}

