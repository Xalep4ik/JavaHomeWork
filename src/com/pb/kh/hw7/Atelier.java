package com.pb.kh.hw7;


public class Atelier {

    public static void main(String[] args) {

        Pants pants = new Pants() {};
        Skirt skirt = new Skirt() {};
        Tshirt tshirt = new Tshirt() {};
        Tie tie = new Tie () {};

        Clothes clothes [] = new Clothes[] {pants,tshirt,skirt,tie};

        pants.name = "Pants ";
        pants.Color = "green ";
        pants.Size = Size.L.getDescription();
        pants.Prise = 45;
        skirt.name = "Skirt ";
        skirt.Color = "white ";
        skirt.Size = Size.M.getDescription();
        skirt.Prise = 50;
        tshirt.name = "Tshirt ";
        tshirt.Color = "blue ";
        tshirt.Size = Size.XXS.getDescription();
        tshirt.Prise = 35;
        tie.name = "Tie ";
        tie.Color = "black ";
        tie.Size = Size.S.getDescription();
        tie.Prise = 25;

        pants.dressMan();
        skirt.dressWomen();
        tshirt.dressWomen();
        tie.dressMan();

        System.out.println("-----------Одеть мужчину----------");
        dressMan(clothes);
        System.out.println("-----------Одеть женщину----------");
        dressWomen(clothes);

    }

    public static void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда : ");
        for (Clothes cloth : clothes){
            if (cloth instanceof ManClothes) {
                ((ManClothes) cloth).dressMan();
            }
        }
    }

    public static void dressWomen(Clothes [] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomenClothes) {
                ((WomenClothes) clothe).dressWomen();
            }
        }
    }

}
