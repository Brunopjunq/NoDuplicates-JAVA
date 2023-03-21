public class FindDuplicates {
    public static void main(String[] args) {
        String[] array1 = new String[] {"Orange","Apple","Banana","Pear","Peach"};
        String[] array2 = new String[] {"Banana","Watermelon","Apple","Pineapple"};
        boolean duplicates = false;

        for (int i = 0; i < array1.length; i++) {
            for(int j = 0; j < array2.length; j++) {
                if(array1[i].equals(array2[j])) {
                    System.out.println(array1[i]);
                    duplicates = true;
                }
            }
        }
        if(!duplicates) {
            System.out.println("There are no duplicates");
        }
    }
}
