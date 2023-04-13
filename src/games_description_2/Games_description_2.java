package Games_description_2;
import java.util.Scanner;

class Games{
    Scanner scanner = new Scanner(System.in);
    char ch;
    
    void Info(){
        System.out.println("Доступные категории:");
        System.out.println("\t1.Quake");
        System.out.println("\t2.Doom");
        System.out.println("\t3.Atomic heart");
        System.out.println("\t4.The Witcher 3");
        System.out.println("\t5.Wolfenstein: the new order");
        System.out.println("\t6.Half-Life");
        System.out.println("\t7.Heroes of might and magic 3"); 
        System.out.println("q - выйти из программы");
    }
    
    void Error(){
    System.out.println("Неверная команда");
    }
    
    void Сategories(){
        System.out.print("Категория: ");
    }
    
    void Descriptions(char ch){
        switch(ch){
            case '1': 
                    System.out.println("Quake круто");
                    break;
                case '2':
                    System.out.println("Doom круто");
                    break;
                case '3':
                    System.out.println("Atomic heart круто");
                    break;
                case '4':
                    System.out.println("The Witcher 3 круто");
                    break;
                case '5':
                    System.out.println("Wolfenstein: the new order круто");
                    break;
                case '6':
                    System.out.println("Hal-Life круто");
                    break;
                case '7':
                    System.out.println("Heroes of might and magic 3 круто");
                    break;
        }
    }
    
    void Exit(){
        System.out.println("Выход");
    }
    
}
public class Games_description_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Games games = new Games();
        char ch;
        games.Info();
        
        stop: start:
        for(;;) {
          games.Сategories();
                ch = (char) scanner.next().charAt(0);
                if(ch == 'q'){
                    games.Exit();
                    break stop;
                }
                if(ch < '1' || ch > '7'){
                    games.Error();
                    continue start;
                }    
                do{
                    games.Descriptions(ch);  
                } while(ch < '1' || ch > '7');
            }
    }
}