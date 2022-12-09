package dz;

public class ChosePhone {
    public void workingWithChosePhone () {
        ChosePhone firstChosePhone = new ChosePhone();
        firstChosePhone.setBrand("Meizu");
        firstChosePhone.setWeight(166.2);
        firstChosePhone.setColor("White");

        ChosePhone secondChosePhone = new ChosePhone();
        secondChosePhone.setBrand("Motorolla");
        secondChosePhone.setWeight(180.2);
        secondChosePhone.setColor("Black");

        System.out.println("Hello Moto!");
        System.out.println("1st chosePhone");
        System.out.println(firstChosePhone.getBrand());

        System.out.println("2nd chosePhone");
        System.out.println(secondChosePhone.getWeight());


    }

}
