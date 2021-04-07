package demo;

import java.util.Scanner;

public class Search {
    // function return string array;
    public String[] listSearch(){
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.printf("Enter size docs:");
        size = scanner.nextInt();
        scanner.nextLine();
        String[] docs = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter string elemet " + (i + 1) + ": ");
            docs[i] = scanner.nextLine();
        }
        return docs;
    }


    //function return index you want search
    public int[] findDocs(String keyword, String[] docs){
        int size = docs.length;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (docs[i].contains(keyword)) {
                count++;
            }
        }
        int[] result = new int[count];
        count = 0;
        for (int i = 0; i < size; i++) {
            if (docs[i].contains(keyword)) {
                result[count] = i;
                count++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Search search = new Search();
        String[] docs = search.listSearch();

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter keyword search: ");
        String keyWord = scanner.nextLine();

        int[] result = search.findDocs(keyWord,docs);

        for (int i = 0; i < result.length; i++) {
            if (result[i] != result[result.length - 1]) {
                System.out.printf(result[i] + ",");
            } else {
                System.out.printf("" + result[i]);
            }

        }
    }
}
