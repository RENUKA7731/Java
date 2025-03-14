package org.aimnxt.proj;
public class FoodItem extends Item
{
String exp;
public FoodItem()
{
}
public FoodItem(int id,String name,double price,String exp)
{
super(id,name,price);
this.exp=exp;
}
public void setName(String name)
{
this.name=name;
}
public String getName()
{
return name;
}
public void setExp(String exp)
{
this.exp=exp;
}
public String getExp()
{
return exp;
}
public double getGst()
{
return price*0.3;
}
}
