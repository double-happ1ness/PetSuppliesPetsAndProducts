package petsuppliespetsandproducts;

public class PetAndProductTest {

    public static void main(String[] args) {
        SortedADT sorted_pet = new Pet();
        SortedADT sorted_product = new Product();
        String pet;
        String product;
        Integer option;
        do {
            System.out.println("0: quit");
            System.out.println("1: insert pet");
            System.out.println("2: remove pet");
            System.out.println("3: find pet");
            System.out.println("4: show traversals");
            System.out.println("5: display pets");
            System.out.println("6: insert product");
            System.out.println("7: remove product");
            System.out.println("8: find product");
            System.out.println("9: display products");
            option = Input.getInteger("option: ");
            switch (option) {
                case 0:
                    System.out.println("quitting program");
                    break;
                case 1:
                    pet = Input.getString("pet: ");
                    try {
                        sorted_pet.insert(pet);
                        System.out.println("inserted");
                    } catch (SortedADT.NotUniqueException e) {
                        System.out.println("insert invalid - pet not unique");
                    }
                    break;
                case 2:
                    pet = Input.getString("pet: ");
                    try {
                        pet = (String) sorted_pet.remove(pet);
                        System.out.println(pet + " removed");
                    } catch (SortedADT.NotFoundException e) {
                        System.out.println("remove invalid - pet not found");
                    }
                    break;
                case 3:
                    pet = Input.getString("pet: ");
                    try {
                        pet = (String) sorted_pet.find(pet);
                        System.out.println(pet + " found");
                    } catch (SortedADT.NotFoundException e) {
                        System.out.println("pet not found");
                    }
                    break;
                case 4:
                    // downcast as method not part of the interface
                    System.out.println(((Pet) sorted_pet).getTraversals());
                    break;
                case 5:
                    System.out.println(sorted_pet);
                    break;
                case 6:
                    product = Input.getString("product: ");
                    try {
                        sorted_product.insert(product);
                        System.out.println("inserted");
                    } catch (SortedADT.NotUniqueException e) {
                        System.out.println("insert invalid - product not unique");
                    }
                    break;
                case 7:
                    product = Input.getString("product: ");
                    try {
                        //product=(String)sorted.remove(product);
                        sorted_product.remove(product);
                        System.out.println(product + " removed");
                    } catch (SortedADT.NotFoundException e) {
                        System.out.println("remove invalid - product not found");
                    }
                    break;
                case 8:
                    product = Input.getString("product: ");
                    try {
                        product = (String) sorted_product.find(product);
                        System.out.println(product + " found");
                    } catch (SortedADT.NotFoundException e) {
                        System.out.println("product not found");
                    }
                    break;
                case 9:
                    System.out.println(sorted_product);
                    break;
                default:
                    System.out.println("invalid option");
            }
        } while (option != 0);
    }
}
