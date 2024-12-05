
public class BuilderDemo {

    public static void main(String[] args) {
        CDBuilder cdBuilder = new CDBuilder();

        CDType cdType1 = cdBuilder.buildSonyCD();
        cdType1.showItems();
        System.out.println("==========\n");

        CDType cdType2 = cdBuilder.buildSamsungCD();
        cdType2.showItems();
        System.out.println("==========\n");

        CDType cdType3 = cdBuilder.buildPolytronCD();
        cdType3.showItems();

    }
}
