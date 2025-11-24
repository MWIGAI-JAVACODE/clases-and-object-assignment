#CLASES AND OBJECT
#QUESTION 1
#NAME:JENTRIX MWIGAI
#ADM:J77-11431-2024

class coffeeorder{
  string size;
  double price;
coffeeorder(string size,double price){
   this.size=size;
   this.price=price;
}
void.display(){
 system.out.println("Size:"+size);
 system.out.println("price"+price);
}
}
class Coffeeprogram{
 public static void main(string[]args){
  Coffeeorder coffee1=new Coffeeorder("Small",100);
  Coffeeorder coffee2=new Coffeeorder("Medium",300);

coffee1.display();
coffee2.display();
}
}
