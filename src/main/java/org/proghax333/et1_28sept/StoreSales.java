package org.proghax333.et1_28sept;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class SalesRecord {
    public int id;
    public int sales;

    public SalesRecord(int id, int sales) {
        this.id = id;
        this.sales = sales;
    }
}

public class StoreSales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int MAX_RECORDS = 10;

        SalesRecord[] records = new SalesRecord[MAX_RECORDS];

        for(int i = 0; i < MAX_RECORDS; ++i) {
            int sales = sc.nextInt();
            records[i] = new SalesRecord(i + 1, sales);
        }

        // Sorting records in descending order.
        Arrays.sort(records, (a, b) -> {
            return b.sales - a.sales;
        });

        // top 3 selling records
        List<SalesRecord> topThreeSelling = Arrays.stream(records).limit(3).toList();

        System.out.println("Top 3 best-selling: ");
        for(SalesRecord r : topThreeSelling) {
            System.out.println("id: " + r.id + " | sales: " + r.sales);
        }

        // Display sorted by descending products
        System.out.println("\nSorted by descending:");
        for(SalesRecord r : records) {
            System.out.println("id: " + r.id + " | sales: " + r.sales);
        }


        sc.close();
    }
}
