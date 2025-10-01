package org.proghax333.class_11sept;

public class SearchStringInArray {
    public static <T> boolean searchString(T arr, String value) {
        if(arr.getClass().isArray()) {
            for(var x : (Object[]) arr) {
                if(searchString(x, value)) {
                    return true;
                }
            }
        } else {
            if(arr.equals(value)) {
                return true;
            }
        }

        return false;
    }



    public static void main(String[] args) {
        String[][][] arr = {
            {
                {
                    "hello", "world"
                },
                {
                    "how", "are", "you", "doing"
                }
            },
            {
                {
                    "i'm", "doing", "fine"
                },
                {
                    "thank", "you"
                }
            }
        };

        System.out.println(searchString(arr, "thank"));
        System.out.println(searchString(arr, "doing"));
        System.out.println(searchString(arr, "absent"));
    }
}
