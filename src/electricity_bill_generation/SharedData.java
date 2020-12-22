/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricity_bill_generation;

/**
 *
 * @author sumit
 */
public class SharedData {
    public  static String userID;

        public static void setUserID(String userid) {
            SharedData.userID = userid;
        }

        public static String getUserID() {
            return userID;
        }
}
