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
       System.out.println(
         "\n Sold to:" + buyer +
         "          Date:"+ date + "\n"+
         "Address:" + address +
         "                     Contact Number:" +
         contact + "\n \n"
       );
    }
}