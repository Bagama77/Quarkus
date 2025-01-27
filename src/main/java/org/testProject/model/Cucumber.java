package org.testProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.testProject.enums.SizeCategory;

import java.util.Random;
import java.util.UUID;

@AllArgsConstructor
@Data
public class Cucumber {

    private static int MAX_SIZE = 10;
    private static Random random = new Random();
    private static String DEFAULT_ADDRESS = "Address 12";

    private String uid;
    private int size;
    private SizeCategory sizeCategory;
    private int pimpleCount;
    private String address;

    public Cucumber() {
        this.uid = UUID.randomUUID().toString();
        this.size = random.nextInt(1, MAX_SIZE);
        this.sizeCategory = SizeCategory.getCategory(this.size);
        this.pimpleCount = random.nextInt(1000);
        this.address = DEFAULT_ADDRESS;
    }
}
