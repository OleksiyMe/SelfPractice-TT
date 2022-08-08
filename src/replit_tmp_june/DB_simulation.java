package replit_tmp_june;

import java.util.Scanner;

public class DB_simulation {

    public static String lameDb(String db, String op, String id, String data) {
        System.out.println(db);
        String result = "", currentElement;
        char lastDigit = db.charAt(db.lastIndexOf("#") + 1);  //id of last element in db

        if (op.equals("add") && lastDigit < id.charAt(0))
            return db + "#" + id + data;  //adding new element at the end
        else if (op.equals("add")) {    //adding new element in the beginning or middle of the db
            for (char i = '1', k = '1'; i <= lastDigit; i++, k++) { // i -id of db, k -id of result
                if (i != lastDigit)
                    currentElement = db.substring(1, db.indexOf("#"));
                else currentElement = db.substring(1);
                db = db.replace("" + i + currentElement + "#", ""); //remove current element from db
                if (i == id.charAt(0)) {  //adding new element
                    if (i < lastDigit) result += "" + k + data + "#" + (++k) + currentElement + "#";
                    else result += "" + k + data + "#" + (++k) + currentElement;
                    //i--;
                    continue;
                }
                if (i < lastDigit) result += "" + k + currentElement + "#"; //adding current element to result
                else result += "" + k + currentElement;
            }
            return result;
        } else if (op.equals("edit")) {   //editing element with given id
            for (char i = '1'; i <= lastDigit; i++) {
                if (i != lastDigit)
                    currentElement = db.substring(1, db.indexOf("#"));
                else currentElement = db.substring(1);
                db = db.replace("" + i + currentElement + "#", "");
                if (i == id.charAt(0)) {
                    currentElement = data;

                }
                if (i < lastDigit) result += "" + i + currentElement + "#";
                else result += "" + i + currentElement;

            }
            return result;

        } else {   //if op == delete
            for (char i = '1', k = '1'; i <= lastDigit; i++, k++) {
                if (i != lastDigit)
                    currentElement = db.substring(1, db.indexOf("#"));
                else currentElement = db.substring(1);
                db = db.replace("" + i + currentElement + "#", "");
                if (i == id.charAt(0)) {  //omit element with given id
                    k--;                   //decrementing id of result
                    continue;               //skip other statements of the loop
                }
                if (i < lastDigit) result += "" + k + currentElement + "#";
                else result += "" + k + currentElement;

            }
        }
        return result;
    }//end lameDb


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //  System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));

        System.out.println(lameDb("1alpha#2bravo#3charlie", "delete", "1", "XXX"));

    }

}


