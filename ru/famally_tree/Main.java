package ru.famally_tree;

import javax.imageio.IIOException;
import java.io.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FamilyTree tree = new FamilyTree();

        Human igor = new Human("Игорь", Gender.Male,LocalDate.of(1900,9,10) );
        Human lena = new Human("Лена", Gender.Famale,LocalDate.of(1905,11,11) );
        Human nasty = new Human("Настя", Gender.Famale,LocalDate.of(1930, 12, 15),lena,igor);
        tree.addHumans(igor);
        tree.addHumans(lena);
        tree.addHumans(nasty);

        Human grandMother = new Human("Лариса",Gender.Famale,LocalDate.of(1840,03,22));
        grandMother.addChildren(igor);
        tree.addHumans(grandMother);

        System.out.println(tree);

//        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Tree.out"));
//        out.writeObject(tree);
//        out.close();

        FileInputStream fileInputStream = new FileInputStream("Tree.out");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        FamilyTree tree2 = (FamilyTree) objectInputStream.readObject();

        System.out.println(tree2);


    }





}
