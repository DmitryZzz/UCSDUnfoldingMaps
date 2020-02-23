package study;

import demos.Airport;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LinearSearch {

    public static String findAirportCode (String toFind, Airport[] airports) {

        String result = "";

        for (int i = 0; i < airports.length; i++) {
            if(airports[i].getCity() == toFind) {
                result = airports[i].getCode3();
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        HashMap<String, String> data = new HashMap<>();
        data.put("Moscow", "MSK");
        data.put("Piter", "SPB");
        data.put("Omsk", "OMK");
        data.put("Tver", "TVR");
        data.put("Sochi", "SOC");

        Airport[] airports = new Airport[5];

        int counter = 0;
        for (Map.Entry<String, String> entry : data.entrySet()) {

            //  System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

        }


        int[] arr = new int[8];
        arr[0] = 10;
        arr[1] = 2;
        arr[2] = 18;
        arr[3] = 1;
        arr[4] = 77;
        arr[5] = 22;
        arr[6] = 100;
        arr[7] = 1;

        //System.out.println(Arrays.toString(arr));

        Integer[] arr2 = Arrays.stream( arr.clone() ).boxed().toArray( Integer[]::new );
        

        System.out.println("arr.clone() = " + Arrays.toString(arr2));
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println("Arrays.sort(arr2); = " + Arrays.toString(arr2));

        for (int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j < arr.length-1; j++) {
                int tmp;
                if(arr[j+1] < arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;

                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }

}
