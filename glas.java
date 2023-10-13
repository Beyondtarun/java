public class glas{

    String color;

    void colour(String color){
     this.color =color;
    }
    void display(){
        System.out.println(color);
    }
}


class BlackLensKart extends glas {

    public BlackLensKart() {
        super.colour("Black");
    }

    
    public void displayDetails() {
        super.display();
    }
}

 class Main {
    public static void main(String[] args) {
        
        BlackLensKart tarun = new BlackLensKart();
        
        tarun.displayDetails();
    }
}
