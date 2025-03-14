package org.aimnxt.proj;
public abstract class Item implements IItem,java.io.Serializable
{
int id;
String name;
double price;
public Item()
{
}
public Item(int id)
{
this.id=id;
}
public Item(int id,String name)
{
this(id);
this.name=name;
}
public Item(int id,String name,double price)
{
this.id=id;
this.name=name;
this.price=price;
}
public void setId(int id)
{
this.id=id;
}
public int getId()
{
return id;
}
public void setName(String name)
{
this.name=name;
}
public String getName()
{
return name;
}
public void setPrice(double price)
{
this.price=price;
}
public double getPrice()
{
return price;
}
public abstract double getGst();
public void Update()
{
price=price+0.08;
}
}
 
