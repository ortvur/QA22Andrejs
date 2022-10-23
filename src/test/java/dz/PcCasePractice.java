package dz;

import org.junit.jupiter.api.Test;

public class PcCasePractice {
    @Test
    public void workingWithPcCase () {
        PcCase firstPcCase = new PcCase();

        firstPcCase.setWeight(5,15);
        firstPcCase.setBrand("Colorful");
        firstPcCase.setHeight(48,5);

        PcCase secondPcCase = new PcCase();
        secondPcCase.setWeight(4,87);
        secondPcCase.setBrand("Sapphire");
        secondPcCase.setHeight(45,8);

        System.out.println("Labdien Dpils!");
        System.out.println("Colorful is cool");
        System.out.println(firstPcCase.getBrand());

        System.out.println("2nd PcCase:");
        System.out.println(secondPcCase.getWeight());
    }
}
