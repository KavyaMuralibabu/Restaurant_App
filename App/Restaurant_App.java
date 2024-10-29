package App;

import java.util.*;

public class Restaurant_App extends inheritance {  

    public static void main(String[] args) {
        full();
    }

    public static void full() {
        System.out.println("\t\t\t\t\t\t-----------------------------------");
        System.out.println("\t\t\t\t\t\t\tQUICK RESTRO");
        System.out.println("\t\t\t\t\t\t===================================");
        product();
        System.out.println("\n\n\t\t\t1.New Customer");
        System.out.println("\t\t\t2.Old Customer");
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\t\t\tPlease Press(1/2) :");
        c = sc.nextLine().charAt(0);
        if (c == '1') {
            newc obj = new newc(); //for newcustomer;
            obj.cni();
        } else if (c == '2') {
            oldc obj2 = new oldc(); //for oldcustomer;
            obj2.cid();
        } else {
            full();
        }
        Scanner bc = new Scanner(System.in);
        System.out.println("\n\n\t\tPress m to return main menu or press any other key to exit");
        int b = bc.nextLine().charAt(0);
        if (b == 'm') {
            full();
        }

    }

}

class inheritance {

    public static void product() {
        System.out.println("\t\t------------------------------\t\t");
        System.out.println("\t\t|Product Name|| Product Code|\t\t");
        System.out.println("\t\t------------------------------\t\t");
        System.out.println("\t\t|Panner Fried Rice|| PFR11|\t\t");
        System.out.println("\t\t------------------------------\t\t");
        System.out.println("\t\t|Momos Veg|| MV11|\t\t");
        System.out.println("\t\t------------------------------\t\t");
        System.out.println("\t\t|Vegetable Biryani|| VG11|\t\t");
        System.out.println("\t\t------------------------------\t\t");
        System.out.println("\t\t|Burger|| BU11|\t\t");
        System.out.println("\t\t------------------------------");
        System.out.println("\t\t|Mutton Rezala|| MR11|\t\t");
        System.out.println("\t\t------------------------------\t\t");
        System.out.println("\t\t|Fish Tikka|| FT11|\t\t");
        System.out.println("\t\t------------------------------\t\t");
        System.out.println("\t\t|Mutton Fry|| MF11|\t\t");
        System.out.println("\t\t------------------------------\t\t");
        System.out.println("\t\t|Chicken Biryani|| CB11|\t\t");
        System.out.println("\t\t------------------------------\t\t");
        System.out.println("\t\t|Cold Drinks|| CD11|\t\t");
        System.out.println("\t\t------------------------------\t\t");
        System.out.println("\t\t|Ice Cream|| IC11|\t\t");
        System.out.println("\t\t------------------------------\t\t");
        System.out.println("\t\t|Mushroom Briyani|| MB11|\t\t");
        System.out.println("\t\t------------------------------\t\t");
        System.out.println("\t\t|Panner Tikka|| PT11|\t\t");
        System.out.println("\t\t------------------------------\t\t");
        System.out.println("\t\t|Chicken Noodels|| CN11|\t\t");
        System.out.println("\t\t------------------------------\t\t");
        System.out.println("\t\t|Seshwan Veg Noodels|| SVN11|\t\t");
        System.out.println("\t\t------------------------------\t\t");
    }
}

class newc {

    static int i = 235;
    static double t;//total;

    public static void cni() {
        String cname;
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\t\t\tCustomer Name: ");
        cname = sc.nextLine();
        System.out.print("\t\t\tCustomer ID: " + (i++));
        prices();
        footer();
    }

    public static void prices() {
        String pcode;
        double tp = 0, tv = 0;//tp=total price &tv=total vat;
        int j;
        for (j = 0; j < 20; j++) {
            System.out.println("\n\t\t\t\t\t\t(Press t for calculate total :)\n");
            System.out.print("\n\t\t\tCode :");
            Scanner pr = new Scanner(System.in);
            pcode = pr.nextLine();
            int price;
            double vat;
            if ("t".equals(pcode)) {
                break;
            }
            switch (pcode) {
                case "PFR11":
                case "pfr11":
                    price = 210;
                    vat = 0 * price;
                    tp = tp + price;
                    tv = tv + vat;
                    System.out.println("\t\t\tProduct :Panner Fried Rice");
                    System.out.println("\t\t\tOld Price : " + price + "RS");
                    System.out.println("\t\t\tOld Vat : " + vat + "RS");
                    break;
                case "MV11":
                case "mv11":
                    price = 60;
                    vat = 0 * price;
                    tp = tp + price;
                    tv = tv + vat;
                    System.out.println("\t\t\tProduct :Momos Veg");
                    System.out.println("\t\t\tOld Price : " + price + "RS");
                    System.out.println("\t\t\tOld Vat : " + vat + "RS");
                    break;
                case "VG11":
                case "vg11":
                    price = 195;
                    vat = 0 * price;
                    tp = tp + price;
                    tv = tv + vat;
                    System.out.println("\t\t\tProduct :Vegetable Biryani");
                    System.out.println("\t\t\tOld Price : " + price + "RS");
                    System.out.println("\t\t\tOld Vat : " + vat + "RS");
                    break;
                case "BU11":
                case "bu11":
                    price = 80;
                    vat = Math.ceil(0.1 * price);//math.ceil() is used for round value;
                    tp = tp + price;
                    tv = tv + vat;
                    System.out.println("\t\t\tProduct :Burger");
                    System.out.println("\t\t\tOld Price : " + price + "RS");
                    System.out.println("\t\t\tOld Vat : " + vat + "RS");
                    break;
                case "MR11":
                case "mr11":
                    price = 50;
                    vat = Math.ceil(0.1 * price);//math.ceil() is used for round value;
                    tp = tp + price;
                    tv = tv + vat;
                    System.out.println("\t\t\tProduct :Mutton Rezala");
                    System.out.println("\t\t\tOld Price : " + price + "RS");
                    System.out.println("\t\t\tOld Vat : " + vat + "RS");
                    break;
                case "FT11":
                case "ft11":
                    price = 215;
                    vat = Math.ceil(0.1 * price);//math.ceil() is used for round value;
                    tp = tp + price;
                    tv = tv + vat;
                    System.out.println("\t\t\tProduct :Fish Tikka");
                    System.out.println("\t\t\tOld Price : " + price + "RS");
                    System.out.println("\t\t\tOld Vat : " + vat + "RS");
                    break;
                case "MF11":
                case "mf11":
                    price = 150;
                    vat = Math.ceil(0.1 * price);//math.ceil() is used for round value;
                    tp = tp + price;
                    tv = tv + vat;
                    System.out.println("\t\t\tProduct :Mutton Fry");
                    System.out.println("\t\t\tOld Price : " + price + "RS");
                    System.out.println("\t\t\tOld Vat : " + vat + "RS");
                    break;
                case "CB11":
                case "cb11":
                    price = 220;
                    vat = Math.ceil(0.1 * price);//math.ceil() is used for round value;
                    tp = tp + price;
                    tv = tv + vat;
                    System.out.println("\t\t\tProduct :Chicken Biryani");
                    System.out.println("\t\t\tOld Price : " + price + "RS");
                    System.out.println("\t\t\tOld Vat : " + vat + "RS");
                    break;

                case "CD11":
                case "cd11":
                    price = 82;
                    vat = Math.ceil(0.1 * price);//math.ceil() is used for round value;
                    tp = tp + price;
                    tv = tv + vat;
                    System.out.println("\t\t\tProduct :Cold Drinks(2 Litr)");
                    System.out.println("\t\t\tOld Price : " + price + "RS");
                    System.out.println("\t\t\tOld Vat : " + vat + "RS");
                    break;
                case "MB11":
                case "mb11":
                    price = 195;
                    vat = Math.ceil(0.1 * price);//math.ceil() is used for round value;
                    tp = tp + price;
                    tv = tv + vat;
                    System.out.println("\t\t\tProduct :Mushroom Briyani");
                    System.out.println("\t\t\tOld Price : " + price + "RS");
                    System.out.println("\t\t\tOld Vat : " + vat + "RS");
                    break;
                case "IC11":
                case "ic11":
                    price = 55;
                    vat = Math.ceil(0.1 * price);//math.ceil() is used for round value;
                    tp = tp + price;
                    tv = tv + vat;
                    System.out.println("\t\t\tProduct :Ice Cream(2 Cone)");
                    System.out.println("\t\t\tOld Price : " + price + "RS");
                    System.out.println("\t\t\tOld Vat : " + vat + "RS");
                    break;
                case "PT11":
                case "pt11":
                    price = 125;
                    vat = Math.ceil(0.1 * price);//math.ceil() is used for round value;
                    tp = tp + price;
                    tv = tv + vat;
                    System.out.println("\t\t\tProduct :Panner Tikka");
                    System.out.println("\t\t\tOld Price : " + price + "RS");
                    System.out.println("\t\t\tOld Vat : " + vat + "RS");
                    break;
                case "CN11":
                case "cn11":
                    price = 235;
                    vat = Math.ceil(0.1 * price);//math.ceil() is used for round value;
                    tp = tp + price;
                    tv = tv + vat;
                    System.out.println("\t\t\tProduct :Chicken Noodels");
                    System.out.println("\t\t\tOld Price : " + price + "RS");
                    System.out.println("\t\t\tOld Vat : " + vat + "RS");
                    break;
                case "SVN11":
                case "svn11":
                    price = 210;
                    vat = Math.ceil(0.1 * price);//math.ceil() is used for round value;
                    tp = tp + price;
                    tv = tv + vat;
                    System.out.println("\t\t\tProduct :Seshwan Veg Noodels");
                    System.out.println("\t\t\tOld Price : " + price + "RS");
                    System.out.println("\t\t\tOld Vat : " + vat + "RS");
                    break;
                    
                default:
                    System.out.println("\t\t\tPlease enter correct code");
            }
        }
        System.out.println("\n\t\t\tTotal Price: " + tp + "RS");
        System.out.println("\n\t\t\tTotal Vat: " + tv + "RS");
        t = tp + tv;
        System.out.println("\n\t\t\tTotal : " + t + "RS");
    }

    public static void footer() {
        System.out.println("\n\t\t\t\t Thank you....");
        System.out.println("\t\t\t\t\t\t\t\t\tQUICK RESTRO");
        System.out.println("\t\t\t\t\t\t\t\t\t---------------");
        System.out.println("\t\t\t\t\t\t\t\t\tSignature");
    }

}

class oldc {

    public static void cid() {
        newc obj3 = new newc();
        Scanner pr = new Scanner(System.in);
        System.out.print("\n\t\t\tCustomer Id:");
        int id;
        id = pr.nextInt();
        if (id >= 235 && id <= obj3.i) {
            obj3.prices();
            System.out.println("\t\t\t You got 5% discount");
            obj3.t = (obj3.t) - (.05 * (obj3.t));
            System.out.println("\t\t\t Total with Discount:" + (Math.ceil(obj3.t)) + "RS");
            obj3.footer();

        } else {
            System.out.println("\t\t Sorry.You are not our old Customer");
            obj3.cni();
        }
    }
}