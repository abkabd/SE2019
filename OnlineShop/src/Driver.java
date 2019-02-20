import soft.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Driver {
    private static Scanner in = new Scanner(System.in);
    private static Mall mall = new Mall();

    public Driver(){
        mall.setName("Mega Center");
    }

    public static void login() {
        boolean quit = false;
        while (!quit) {
            int choice = 0;
            String msg = "";
            do {

                System.out.println(msg);
                System.out.println("[1] - Enter as Customer");
                System.out.println("[2] - Enter as Manager");
                System.out.println("[3] - Exit");
                choice = in.nextInt();
                msg = "Wrong input format, try again\n";
            }
            while(choice<1 || choice>3);

            switch (choice)
            {
                case 1:
                    System.out.println("Please, write your username: ");
                    String username = in.next();
                    //runCustomer(username);
                    break;
                case 2:
                    break;
                case 3:
                    quit = true;
                    break;
            }
        }
    }
/*
    private static void runCustomer(String username){
        Customer cs = new Customer(username);
        System.out.println(String.format("You're welcome, %s", cs.getName()));
        while(true)
        {
            int choice = 0;
            int pos=1;
            String msg = "";
            do{
                System.out.println(msg);

                HashMap<String, Store> hm = mall.getStores();
                Iterator it = hm.entrySet().iterator();
                while (it.hasNext()){
                    HashMap.Entry pair = (HashMap.Entry)it.next();
                    Store st = (Store)pair.getValue();
                    System.out.println(String.format("[%d] - %s : %s", pos++, st.getName(), st.getClass()));
                }


                System.out.printf("[%d] - Shopping cart", pos);
                System.out.printf("[%d] - Exit", pos+1);

                choice = in.nextInt();
                msg = "Wrong input format, try again\n";
            }
            while(choice<1 || choice>pos+1);

            final int a1 = pos;

            if(choice == pos){
                cs.showItems();
            }
            else if(choice == pos+1){
                return;
            }
            else
            {
                runStore();
            }
        }
    }
*/
    private static void runStore(){

    }

}
