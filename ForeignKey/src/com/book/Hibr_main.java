package com.book;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Hibr_main {
public static void main(String[] args) {
	//SSR is used to map the config file and execute it
StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//Metadata in the config file should be executed
Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
//session factory
SessionFactory sf=md.getSessionFactoryBuilder().build();
//session is place where we write the CRUD operations
Session s=sf.openSession();
//used to save the crud operations on the db
Transaction t=s.beginTransaction();
Author au=new Author();
au.setId(1);
au.setName("karthik");
au.setEmail("k@c.c");
s.save(au);
Book b=new Book();
b.setBid(101);
b.setTitle("java");
b.setAuthor(au);
s.save(b);
t.commit();
s.close();
sf.close();

//select * from employee;
Query q=s.createQuery("select name where title='java'");
Author au=() q.uniqueResult();
System.out.println(el);


}
}
