public class cafe{
    public static void main(String[] args) {
    int menu=1;
    switch(menu){
        case 1 :
            System.out.println("Coffee");
            break;
        case 2:
            System.out.println("Caramel Custard");
            break;
        case 3:
            System.out.println("Tea"); 
            break;
        default:
            System.out.println("Out of stock");
    }    
    }
}