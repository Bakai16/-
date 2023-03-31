package ru.javabegin.training.fastjava2.javafx.interfaces.impls;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import ru.javabegin.training.fastjava2.javafx.interfaces.AddressBook;
import ru.javabegin.training.fastjava2.javafx.objects.Person;

import java.util.ArrayList;

// класс реализовывает интерфейс с помощью коллекции
public class CollectionAddressBook implements AddressBook {

    private ObservableList<Person> personList = FXCollections.observableArrayList();

    @Override
    public void add(Person person) {
        personList.add(person);
    }

    @Override
    // для коллекции не используется, но пригодится для случая, когда данные хранятся в БД и пр.
    public void update(Person person) {
        // т.к. коллекция и является хранилищем - то ничего обновлять не нужно
        // если бы данные хранились в БД или файле - в этом методе нужно было бы обновить соотв. запись
    }

    @Override
    public void delete(Person person) {
        personList.remove(person);
    }

    public ObservableList<Person> getPersonList() {
        return personList;
    }

    public void print(){
        int number = 0;
        System.out.println();
        for(Person person : personList){
            number++;
            System.out.println(number+") fio = "+person.getFio()+"; phone = "+person.getPhone());
        }
    }

    public void fillTestData(){
        personList.add(new Person("Бакай Акылбеков", "+996707239484"));
        personList.add(new Person("Санжар Эмилканов", "+996505230458"));
        personList.add(new Person("Бактияр Рахматилаев", "+996706334534"));
        personList.add(new Person("Данияр Уркунов", "+996773949565"));
        personList.add(new Person("Эльба Абылгазиева", "+996707475745"));
        personList.add(new Person("Нургиза Боконбаева", "+996706943434"));
        personList.add(new Person("Талант Казылов", "+996705837542"));
    }



}

