import java.util.Scanner;
class dress
{
    String men;
    String children;
    String women;
    public void sectiondisplay(){
        System.out.println(men);
        System.out.println(children);
        System.out.println(women);

    }
    
    
    }
    class food extends dress{ //inheritance
    
        String food1;
        String food2;
        void displayfood(){
            System.out.println(food1);
            System.out.println(food2);
        }
    }
    public class mall{
        public static void main(String[] args) {
            food d=new food();
            d.food1="dosa";
            d.food2="idli";
            d.displayfood();
            d.men="jean";
            d.children="tshirt";
            d.women="tshirt";
            d.sectiondisplay();
        }

    }

