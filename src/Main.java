public class Main {
    public static void main(String[] args) {
       String headerdots="****************************";
       String companyname="C026-01-0714/2023";
       String location="#99 ACS Building Gilmore Ave. New Mla.. Quezon City *  ";
       String phoneno="123-4567";
       String vatreg="098-765-4321-0000";
       String buyer="Nderi Lincoln Mwangi";
       String date="28/04/2020";
       String address="private bag";
       String contact="0100100100";

       System.out.println(headerdots + companyname + headerdots + "\n"  +
                location + " Tel. No:"+ phoneno + "\n" +
                "               VAT REG.  TIN " + vatreg +"\n" +
                "                   SALES INVOICE \n"
        );
       // the buyer section
       System.out.println(
         "\n Sold to:" + buyer +
         "          Date:"+ date + "\n"+
         "Address:" + address +
         "                     Contact Number:" +
         contact + "\n \n"
       );
       //the table header...bruuuh
        System.out.println(
                "-------------------------------------------------------------------------------"
        );
       System.out.printf(
                       "%-5s %-20s %-15s %20s%n", "Qty" , "|   Item Description    " , "|  Unit Price  " , "| Amount   "
       );
       System.out.println(
               "-------------------------------------------------------------------------------\n"
       );
        System.out.printf(
                "%-5s %-20s %-15s %20s%n", "4" , "|   Pencil        " , "|  28  " , "| 80.00   "
        );
        System.out.printf(
                "%-5s %-20s %-15s %20s%n", "10" , "|   Duster    " , "|  50  " , "| 500.00   "
        );
        System.out.printf(
                "%-5s %-20s %-15s %20s%n", "9" , "|   Pens    " , "|  30  " , "| 270.00   "
        );
        System.out.printf(
                "%-5s %-20s %-15s %20s%n", "4" , "|   crayon    " , "|  80  " , "| 800.00   "
        );
        System.out.println(
                "-------------------------------------------------------------------------------\n" +
                "-------------------------------------------------------------------------------\n"
        );
        //the totals
    double subtotals=(80+500+270+800);
    double vat=(subtotals*0.16);
    double amountdue=(subtotals+vat);
    //printing the totals : )
    System.out.println(                        "                   ------------------------------\n" +

                    "                   |Subtotal           |   " + subtotals + "\n" +
                       "                   ------------------------------\n" +
    "                   |VAT(16%)           |   " + vat + "\n" +
                       "                   ------------------------------\n" +
    "                   |Total Amount       |   " + amountdue + "\n" +
                       "                   ------------------------------\n"
    );
    }
}
